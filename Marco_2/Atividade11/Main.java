package Marco_2.Atividade11;
/*
 * Atividade 11
 */
public class Main {
    public static void main(String[] args) {
        FilaVet lista = new FilaVet(4);

        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        lista.adicionar(4);

        lista.imprimirLista();
        lista.remover();

        System.out.println("===");
        lista.imprimirLista();
    }
}
