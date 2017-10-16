import sun.security.provider.certpath.Vertex;

/**
 * Created by 1 on 16.10.2017.
 */
public class Edge {
    private sun.security.provider.certpath.Vertex vertex1;
    private Vertex vertex2;

    public Edge(Vertex vertex1, Vertex vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    public Vertex getVertex1() {
        return vertex1;
    }

    public Vertex getVertex2() {
        return vertex2;
    }
}
