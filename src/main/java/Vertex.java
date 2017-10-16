/**
 * Created by 1 on 16.10.2017.
 */
public class Vertex {

    private final int number;

    Vertex(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vertex)) return false;

        Vertex vertex = (Vertex) o;

        return getNumber() == vertex.getNumber();
    }

    @Override
    public int hashCode() {
        return getNumber();
    }
}


