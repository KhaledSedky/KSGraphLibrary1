import java.io.File;
import java.util.*;
import java.lang.*;

public class MainGraphSample
{
    public static void main(String[] args)
    {
        HashMap<String, KSGraphVertex> sampleGraph = new HashMap<String, KSGraphVertex>();

        KSGraphVertex graphRoot = new KSGraphVertex("1");

        KSGraphVertex graphVertex2 = new KSGraphVertex("2");
        KSGraphVertex graphVertex3 = new KSGraphVertex("3");
        KSGraphVertex graphVertex4 = new KSGraphVertex("4");
        KSGraphVertex graphVertex5 = new KSGraphVertex("5");
        KSGraphVertex graphVertex6 = new KSGraphVertex("6");
        KSGraphVertex graphVertex7 = new KSGraphVertex("7");

        sampleGraph.put("1", graphRoot);
        sampleGraph.put("2", graphVertex2);
        sampleGraph.put("3", graphVertex3);
        sampleGraph.put("4", graphVertex4);
        sampleGraph.put("5", graphVertex5);
        sampleGraph.put("6", graphVertex6);
        sampleGraph.put("7", graphVertex7);

        graphRoot.ConnectToTarget(graphVertex2);
        graphRoot.ConnectToTarget(graphVertex3);
        graphRoot.ConnectToTarget(graphVertex4);
        graphVertex2.ConnectToTarget(graphVertex4);
        graphVertex2.ConnectToTarget(graphVertex5);
        graphVertex3.ConnectToTarget(graphVertex6);
        graphVertex4.ConnectToTarget(graphVertex3);
        graphVertex4.ConnectToTarget(graphVertex6);
        graphVertex4.ConnectToTarget(graphVertex7);
        graphVertex5.ConnectToTarget(graphVertex4);
        graphVertex5.ConnectToTarget(graphVertex7);
        graphVertex7.ConnectToTarget(graphVertex6);

        //KSGraphVertex clonedGraphVertex = MainGraphSample.CloneGraph(graphRoot);
        HashMap<String, KSGraphVertex> clonedGraph = KSGraphVertex.CloneGraph(graphRoot);
        ArrayList<KSGraphVertex> topologicalSortOrder = KSGraphVertex.TopologicalSort(clonedGraph, clonedGraph.get(graphRoot.GetVertexName()));

        for(KSGraphVertex vertex : topologicalSortOrder)
        {
            System.out.println(vertex.GetVertexName());
        }

        System.out.println("Graph Created");
    }
}

