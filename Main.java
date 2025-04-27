public class Main {
    public static void main(String[] args) {
        Pilha historico = new Pilha();
        Fila filaAtendimento = new Fila();

        try {
            // Histórico - Pilha
            historico.empilhar(new Elemento(1, 101, 20240820.1030f));
            historico.empilhar(new Elemento(2, 102, 20240820.1100f));

            // Atendimento - Fila
            filaAtendimento.enfileirar(new Elemento(1, 201, 0f));
            filaAtendimento.enfileirar(new Elemento(2, 202, 0f));

            // Exibindo Histórico
            System.out.println("Histórico de Solicitações:");
            while (!historico.estaVazia()) {
                historico.desempilhar().imprimir();
            }

            // Exibindo Atendimento
            System.out.println("\nFila de Atendimento:");
            while (!filaAtendimento.estaVazia()) {
                filaAtendimento.desenfileirar().imprimir();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
