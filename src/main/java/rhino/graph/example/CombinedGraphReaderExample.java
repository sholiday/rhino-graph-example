package rhino.graph.example;
// Copyright 2014
// Author: Stephen Holiday (stephen.holiday@gmail.com)

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.SequenceFile;

import java.io.IOException;
import java.util.Map;

import rhino.etl.hadoop.graph.thrift.Item;
import rhino.etl.hadoop.graph.thrift.TEdge;
import rhino.etl.hadoop.graph.thrift.TVertex;
import rhino.etl.hadoop.graph.writable.TVertexWritable;

public class CombinedGraphReaderExample {
  public static void main(String[] args) throws IOException {
    // Setup the Hadoop Sequence file reader.
    Configuration conf = new Configuration();
    FileSystem fs = FileSystem.get(conf);
    Path path = new Path(args[0]);
    SequenceFile.Reader reader = new SequenceFile.Reader(fs, path, conf);

    // We can reuse these objects to hypothetically save the GC some effort.
    LongWritable key = new LongWritable();
    TVertexWritable value = new TVertexWritable();

    System.out.println("Starting read.");
    while (reader.next(key, value)) {
      // You may not need deep copy if you are careful with how you use the data.
      // But to avoid confusion I'm defaulting to copy the vertex.
      System.out.println(processVertex(key.get(), value.get().deepCopy()));
    }
    reader.close();

    System.out.println("Read completed");
  }

  public static StringBuilder processVertex(Long key, TVertex vertex) {
    StringBuilder sb = new StringBuilder(key.toString());
    sb.append("\t");

    if (vertex.isSetRhinoId()) {
      sb.append(" rhinoId: ").append(vertex.rhinoId);
    }
    if (vertex.isSetTitanId()) {
      sb.append(" titanId: ").append(vertex.titanId);
    }

    sb.append(" Properties: [");
    if (vertex.isSetProperties()) {
      sb.append(processProperties(vertex.getProperties()));
    }
    sb.append("] outEdges: {");

    for (TEdge edge : vertex.getOutEdges()) {
      sb.append(processEdge(edge));
    }
    sb.append("}");

    return sb;
  }

  public static StringBuilder processProperties(Map<String, Item> properties) {
    StringBuilder sb = new StringBuilder();
    for (Map.Entry<String, Item> entry : properties.entrySet()) {
      sb
        .append(entry.getKey())
        .append(": ")
        .append(entry.getValue().toString())
        .append(" ");
    }

    return sb;
  }

  public static StringBuilder processEdge(TEdge edge) {
    StringBuilder sb = new StringBuilder(edge.getLabel());
      sb
        .append(" --> ")
        .append(edge.rightRhinoId);

    sb.append(" Properties: [");
    if (edge.isSetProperties()) {
      sb.append(processProperties(edge.getProperties()));
    }
    sb.append("] ");

    return sb;
  }
}
