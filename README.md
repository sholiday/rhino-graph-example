# Project Rhino Graph Example
Example code to read data from Project Rhino's dataset.

## Requirements
 * Java (>=1.6)
 * Maven

## Example Run
Let's say we have a part of the dataset at `/home/stephen/part-m-00000`.

We can make sure maven is all working by running:

    mvn compile

We'll likely see some warnings but it should be fine as long as we see:

    [INFO] BUILD SUCCESS

Next we can actually run the code:

    mvn compile exec:java \
      -Dexec.mainClass="rhino.graph.example.CombinedGraphReaderExample" \
      -Dexec.args="/home/stephen/part-m-00000"

And we should see something like:

    [INFO] --- exec-maven-plugin:1.2.1:java (default-cli) @ rhino-graph-example ---
    2014-07-04 19:11:40.414 java[62890:3c07] Unable to load realm info from SCDynamicStore
    14/07/04 19:11:40 WARN util.NativeCodeLoader: Unable to load native-hadoop library for your
    platform... using builtin-java classes where applicable
    Starting read.

    2305843009225712352  rhinoId: 2305843009225712352 Properties: [songLength:
    <Item int_value:211000> songName: <Item string_value:Hackwave> songId:
    <Item int_value:12018400> songMbid: <Item string_value:9783a9ef-629f-3374-8dde-633c3a156ac2> ]
    outEdges: {similarSong --> 2305843009213804804 Properties:
    [similarSongScore: <Item double_value:0.0010929900454357266> ] ...


## Thrift Definition
Let's take a look at the thrift definition in `graph.thrift`:

    struct TVertex {
      1: optional i64 rhinoId, // A unique ID in the dataset for the vertex.
      3: optional map<string, Item> properties,
      4: optional list<TEdge> outEdges,
    }

(Note I've omitted fields that aren't present in the published data.
We use those fields as part of the ETL pipeline outlined
[here](http://stephenholiday.com/articles/2014/batch-graph-build-using-hadoop-and-titan/).)

Each vertex has a 64bit ID named `rhinoId`. The properties field is a key-value map for the vertex.
(ex. songName: <Item string_value:Hackwave>). These properties are defined by:

    union Item {
      1: i16 short_value;
      2: i32 int_value;
      3: i64 long_value;
      4: double double_value;
      5: string string_value;
      6: binary bytes_value;
    }

I don't think we use bytes_value anywhere.

Each vertex has a list of (directed) edges starting from itself.

    struct TEdge {
        3: optional i64 rightRhinoId,
        5: optional string label, // The type of edge.
        6: optional map<string, Item> properties
    }

## Java Code
I've provided an example of reading the data files in CombinedGraphReaderExample.
You may wish to modify the code to convert the data into a format more convenient for your use.

## Getting the Data
Contact stephen.holiday@gmail.com