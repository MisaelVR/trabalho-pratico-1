public class Elemento {
    String id;
    String info1;
    String info2;

    public Elemento(String id, String info1, String info2) {
        this.id    = id;
        this.info1 = info1;
        this.info2 = info2;
    }

    @Override
    public String toString() {
        return id + " | " + info1 + " | " + info2;
    }
}
