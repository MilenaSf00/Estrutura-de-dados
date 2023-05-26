package Atividade6;

/*
 * Atividade 6.Implemente um LDS Génerica.
 */

public class Main {
    public static void main (String[] args){
        IInterfaceLSE lista = new ListaSE();

        Aluno aluno1 = new Aluno("Milena", 19, 10);
        Aluno aluno2 = new Aluno("Juliana", 19, 10);

        lista.insereInicio(aluno1);
        lista.insereInicio(aluno2);
        lista.insereFim(aluno1);

        lista.imprimeLista();
        System.out.println("Tamanho da lista: "+lista.tamanho());
    }
}
