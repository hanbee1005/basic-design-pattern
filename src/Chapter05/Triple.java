package Chapter05;

public class Triple {
    private static Triple[] triples = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };
    private int id;

    private Triple(int id) {
        System.out.println("The instance " + id + " is created.");
        this.id = id;
    }

    public static Triple getInstance(int i) {
        return triples[i];
    }

    public String toString() {
        return "[Triple id=" + id + "]";
    }
}
