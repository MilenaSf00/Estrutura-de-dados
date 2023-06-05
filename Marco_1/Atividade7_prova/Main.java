package Atividade7_prova;

/*
 *Questão 7 prova
 */

 public class Main {
    public static void main(String[] args) {
        ListaSE lista = new ListaSE();

        lista.insereInicio(1);
        lista.insereInicio(2);
        lista.insereInicio(3);
        lista.insereInicio(4);
        lista.insereInicio(5);

        System.out.println("Lista recursiva:");
        lista.imprime_rec(lista.getInicio());

    }
}