public class Main {
    public static void main(String[] args) {
        Pilha historico       = new Pilha();
        Fila  filaAtendimento = new Fila();

        try {
            historico.empilhar(new Elemento("REQ001", "Instalação de software", "2024-08-20 10:30"));
            historico.empilhar(new Elemento("REQ002", "Manutenção preventiva",  "2024-08-20 11:00"));
            historico.empilhar(new Elemento("REQ003", "Atualização de sistema",  "2024-08-20 11:30"));

            filaAtendimento.enfileirar(new Elemento("CLI001", "Maria Silva",    "Dúvida sobre produto"));
            filaAtendimento.enfileirar(new Elemento("CLI002", "João Souza",     "Reclamação de serviço"));
            filaAtendimento.enfileirar(new Elemento("CLI003", "Ana Costa",      "Solicitação de reembolso"));

            System.out.println("Desempilhando Histórico");
            while (!historico.estaVazia()) {
                historico.desempilhar().imprimir();
            }

            System.out.println("\nAtendendo Fila de Clientes");
            while (!filaAtendimento.estaVazia()) {
                filaAtendimento.desenfileirar().imprimir();
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
//