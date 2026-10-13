public class Principal {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>();

        System.out.println("pilha.tamanha(): " + pilha.tamanho());
        System.out.println("pilha.vazia()? " + pilha.vazia());

        pilha.push("Maria");
        pilha.push("Joao");
        pilha.push("Ana");
        System.out.println("Adicionados: Maria, Joao, Ana");

        System.out.println("pilha.tamanho(): " + pilha.tamanho());
        System.out.println("pilha.vazia(): " + pilha.vazia());
        System.out.println("pilha.peek() - topo: " + pilha.peek());

        System.out.println("Itens:");
        while (!pilha.vazia()) {
            System.out.println(pilha.pop());
        }
    }
}