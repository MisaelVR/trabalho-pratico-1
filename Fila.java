public class Fila {
    private Node frente;
    private Node tras;

    public Fila() {
        frente = null;
        tras   = null;
    }

    public boolean estaVazia() {
        return frente == null;
    }

    public void enfileirar(Elemento e) {
        Node novo = new Node(e);
        if (estaVazia()) {
            frente = novo;
            tras   = novo;
        } else {
            tras.prox = novo;
            tras      = novo;
        }
    }

    public Elemento desenfileirar() throws Exception {
        if (estaVazia()) {
            throw new Exception("Erro: fila vazia");
        }
        Elemento e = frente.elemento;
        frente     = frente.prox;
        if (frente == null) {
            tras = null;
        }
        return e;
    }
}
//