import java.lang.*;
import java.util.*;

public class KSGraphEdge
{
    private int __edgeWeight;
    private KSGraphVertex __sourceVertex;
    private KSGraphVertex __targetVertex;

    public KSGraphEdge(KSGraphVertex sourceVertex, KSGraphVertex targetVertex)
    {
        this.__sourceVertex = sourceVertex;
        this.__targetVertex = targetVertex;
        this.__edgeWeight = 0;
    }

    public KSGraphVertex GetSourceVertex()
    {
        return __sourceVertex;
    }

    public KSGraphVertex GetTargetVertex()
    {
        return __targetVertex;
    }

    public int GetEdgeWeight()
    {
        return __edgeWeight;
    }
}
