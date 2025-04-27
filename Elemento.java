public class Elemento {
    String id;
    String descricao;
    String extra;

    public Elemento(String id, String descricao, String extra) {
        this.id        = id;
        this.descricao = descricao;
        this.extra     = extra;
    }

    public void imprimir() {
        System.out.println(id + " | " + descricao + " | " + extra);
    }
}
//