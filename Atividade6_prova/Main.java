package Atividade6_prova;

/*
 * Questão 6 prova.
 */
public class Main {
    public static void main(String[] args) {
        IInterfaceLD lista = new ListaD();

        lista.add_ordenado(1);
        lista.add_ordenado(2);
        lista.add_ordenado(3);
        lista.add_ordenado(5);
        lista.add_ordenado(7);
        lista.add_ordenado(6);
        lista.add_ordenado(4);

        lista.imprimeLista();
        lista.verificaPosicao(6);
    }
}
