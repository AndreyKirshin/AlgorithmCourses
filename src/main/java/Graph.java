import java.util.ArrayList;


/**
 * Created by 1 on 16.10.2017.
 */
public class Graph implements GraphAPI{
    private ArrayList<Vertex> vertices;
    private ArrayList<Edge> edges;

    public Graph(ArrayList<Vertex> vertices, ArrayList<Edge> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }

    public Graph(ArrayList<Edge> edges) {
        this.edges = edges;
    }


    public void addEdge(Edge e) {
        edges.add(e);
    }

    public void addVertex(Vertex v){
        vertices.add(v);
    }

    public void deleteEdge(Edge e) {
        edges.remove(e);

    }

    public void deleteVertex(Vertex v) {
        vertices.remove(v);
        for(Edge e : edges){
            if(v.equals(e.getVertex1()) || v.equals(e.getVertex2())){
                edges.remove(e);
            }
        }
    }
    public int degreeVertex(Vertex v) {
        int result = 0;
        for(Edge e : edges){
            if(v.equals(e.getVertex1()) || v.equals(e.getVertex2())){
                result++;
            }
        }

        return result;
    }


}
