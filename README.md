# 📚 Projeto de Estrutura de Dados em Java – Pilha e Fila

Este projeto foi desenvolvido para consolidar o aprendizado sobre estruturas de dados dinâmicas, aplicando conceitos de **lista encadeada**, **pilha** e **fila**, utilizando exclusivamente recursos básicos da linguagem Java.

O trabalho foi realizado seguindo as restrições definidas na disciplina de Resolução de Problemas estruturados em Computação durante o curso de Engenharia de Software da PUCPR.

---

# 📋 Sobre o Projeto

O objetivo do projeto é praticar a criação manual de estruturas de dados, **sem utilização de funções prontas** da linguagem, respeitando as seguintes regras:

- Apenas utilização de `String`, `int`, `float`, `try-catch`, `throws`, e funções básicas de entrada e saída.
- Proibição do uso de `List`, arrays (`[]`), `Map`, `StringBuilder`, ou qualquer tipo de estrutura automatizada.
- Implementação manual de **lista encadeada**, **pilha** (LIFO) e **fila** (FIFO).

---

# ⚙️ Funcionalidades

**Pilha (Histórico de Solicitações)**  
- Inserção de solicitações (empilhar).
- Remoção de solicitações seguindo a lógica LIFO (desempilhar).
- Verificação se a pilha está vazia.
- Impressão do histórico desempilhado.

**Fila (Ordem de Atendimento de Clientes)**  
- Inserção de novos clientes (enfileirar).
- Atendimento dos clientes na ordem FIFO (desenfileirar).
- Verificação se a fila está vazia.
- Impressão dos atendimentos conforme desenfileirados.

---

# 🧱 Estrutura do Projeto

O projeto é organizado da seguinte forma:

```
Elemento.java      // Representa os dados armazenados em cada nó (ID, descrição, extra).
Node.java          // Representa o nó da lista encadeada.
Pilha.java         // Implementação manual da estrutura de pilha.
Fila.java          // Implementação manual da estrutura de fila.
Main.java          // Classe principal que demonstra o uso da pilha e fila.
```

---

# 🔗 Sistema de Fluxo de Dados

- **Elemento**: guarda o ID, a descrição e informações adicionais.
- **Node**: conecta cada elemento a outro elemento.
- **Pilha**: utiliza o topo para gerenciar o histórico de forma LIFO.
- **Fila**: utiliza frente e trás para gerenciar o atendimento de forma FIFO.

---

# 🚀 Tecnologias Utilizadas

- Java
- IDE: Visual Studio Code
- Execução no console

---

# 🛠️ Como Executar

1. Clone o repositório (após publicar no GitHub):
   ```bash
   git clone https://github.com/MisaelVR/trabalho-pratico-1.git
   ```
2. Abra o projeto em uma IDE de sua preferência.
3. Compile e execute o arquivo `Main.java`.
4. Acompanhe a simulação da pilha e da fila pelo console.

---

# 📌 Observações Importantes

- Nenhum recurso avançado de Java foi utilizado.
- Não foram usados arrays, listas, estruturas de dados prontas ou StringBuilder.
- Todo o tratamento de erros é feito manualmente utilizando `try-catch` e `throws Exception`.
- A implementação respeita os conceitos ensinados em aula sobre **listas encadeadas**, **pilha** e **fila**.

---

# 👨‍💼 Créditos

Projeto desenvolvido por Emmanuel Victorio, Misael Vicente e Otávio Augusto,  
Disciplina **Resolução de Problemas estruturados em Computação**, Engenharia de Software – PUCPR.

---

# 🔥 Exemplo de Saída no Console

```
=== Desempilhando Histórico ===
REQ003 | Atualização de sistema | 2024-08-20 11:30
REQ002 | Manutenção preventiva | 2024-08-20 11:00
REQ001 | Instalação de software | 2024-08-20 10:30

=== Atendendo Fila de Clientes ===
CLI001 | Maria Silva | Dúvida sobre produto
CLI002 | João Souza | Reclamação de serviço
CLI003 | Ana Costa | Solicitação de reembolso
```

---

# 📌 Links Importantes

- Repositório GitHub: https://github.com/MisaelVR/trabalho-pratico-1.git
- Vídeo de explicação no YouTube: https://www.youtube.com/watch?v=wLrKN8llhbY

---
