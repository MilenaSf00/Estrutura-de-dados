package Atividade4;



public class Main {
    public static void main (String[] args){
        IInterfaceLSE lista = new ListaSE();
        Aluno aluno1 = new Aluno("Milena", 19, 10);
        Aluno aluno2 = new Aluno("Lucas", 19, 10);

        lista.insereInicio(aluno1);
        lista.insereInicio(aluno2);

        lista.imprimeLista();
        
        System.out.println("Tamanho da lista de alunos :"+lista.tamanho());
    }
}
