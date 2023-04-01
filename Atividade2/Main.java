package Atividade2;

public class Main {
    public static void main (String[] args){
        AlunoVetor vetor = new AlunoVetor();

        Aluno aluno1 = new Aluno("Mario", 18, 7.5);
        Aluno aluno2 = new Aluno("Maria", 18, 10);
        Aluno aluno3 = new Aluno("Joana", 17, 9.0);
        Aluno aluno4 = new Aluno("Lucas", 18, 9.5);
 
        vetor.adicionarAluno(aluno1);
        vetor.adicionarAluno(aluno2);
        vetor.adicionarAluno(aluno3);
        vetor.adicionarAluno(aluno4);
 
        System.out.println("Verificando o tamanho do vetor: " + vetor.tamanho());
        System.out.println("Existe o aluno Mario?" + vetor.contem(aluno1));
        System.out.println("Existe a aluna Maria?" + vetor.contem(aluno2));
        System.out.println("Existe a aluna Joana?" + vetor.contem(aluno3));
        System.out.println("Existe o aluno Lucas?" + vetor.contem(aluno4));
       
    }
}
