public class Pilha {
    private Node topo;

    public Pilha() {
        topo = null;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void empilhar(Elemento e) {
        Node novo = new Node(e);
        novo.prox = topo;
        topo = novo;
    }

    public Elemento desempilhar() throws Exception {
        if (estaVazia()) {
            throw new Exception("Erro: pilha vazia");
        }
        Elemento e = topo.elemento;
        topo = topo.prox;
        return e;
    }
}
