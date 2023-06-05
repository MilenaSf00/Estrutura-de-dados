package Atividade3;

public class Main {
    public static void main (String[] args){
        Aluno aluno1 = new Aluno("Maria", 18, 10);
        Aluno aluno2 = new Aluno("João", 18, 9);
        Aluno aluno3 = new Aluno("Lucas", 18, 8.5);
        Aluno aluno4 = new Aluno("Juliana", 18, 10);
        Aluno aluno5 = new Aluno("Henrique", 18, 9);
        
        AlunoVetor vetor = new AlunoVetor(5);
        
        vetor.adicionarAluno(aluno1);
        vetor.adicionarAluno(aluno2);
        vetor.adicionarAluno(aluno3);
        vetor.adicionarAluno(aluno4);
        vetor.adicionarAluno(aluno5);

        System.out.println("existe a aluna maria?"+vetor.contem(aluno1));

        System.out.println("Qual o tamanho do vetor?"+vetor.tamanho());

        vetor.remove(aluno1);

        System.out.println("existe a aluna maria?"+vetor.contem(aluno1));

        System.out.println("qual o tamanho do vetor?"+vetor.tamanho());

    }
}
