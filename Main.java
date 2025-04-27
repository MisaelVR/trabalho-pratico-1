public class Main {
    public static void main(String[] args) {
        Pilha historico      = new Pilha();
        Fila filaAtendimento = new Fila();

        try {
            // --- popula o histórico de solicitações (stack) ---
            historico.empilhar(new Elemento("REQ001", "Instalação de software", "2024-08-20 10:30"));
            historico.empilhar(new Elemento("REQ002", "Manutenção preventiva",  "2024-08-20 11:00"));
            // ... (adicione quantas quiser)

            // --- popula a fila de atendimento (queue) ---
            filaAtendimento.enfileirar(new Elemento("CLI001", "Maria Silva",    "Dúvida sobre produto"));
            filaAtendimento.enfileirar(new Elemento("CLI002", "João Souza",     "Reclamação de serviço"));
            // ... (adicione quantos quiser)

            // Demonstração de operações
            System.out.println("Desempilhando histórico:");
            while (!historico.estaVazia()) {
                System.out.println("  " + historico.desempilhar());
            }

            System.out.println("\nAtendendo fila de clientes:");
            while (!filaAtendimento.estaVazia()) {
                System.out.println("  " + filaAtendimento.desenfileirar());
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
