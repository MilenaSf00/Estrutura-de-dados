package Atividade4;

/*
 * Atividade 4. Implemente um TAD LSE genérica de modo que seja possível inserir Alunos.
 */
public class Main {
    public static void main (String[] args){
        IInterfaceLSE lista = new ListaSE();
        Aluno aluno1 = new Aluno("Julia", 19, 10);
        Aluno aluno2 = new Aluno("Maria", 19, 10);

        lista.insereInicio(aluno1);
        lista.insereInicio(aluno2);

        lista.imprimeLista();
        
        System.out.println("Tamanho da lista de alunos :"+lista.tamanho());
    }
}
