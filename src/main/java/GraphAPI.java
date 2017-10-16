/**
 * Created by 1 on 16.10.2017.
 */
public interface GraphAPI {

    void addEdge(Edge e);
    void addVertex(Vertex v);
    void deleteEdge(Edge e);
    void deleteVertex(Vertex v);
    int degreeVertex(Vertex v);

}
