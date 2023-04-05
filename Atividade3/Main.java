package Atividade3;

public class Main {
    public static void main (String[] args){
        Aluno aluno1 = new Aluno("Maria", 18, 10);
        
        AlunoVetor vetor = new AlunoVetor(5);


        vetor.adicionarAluno(aluno1);

        System.out.println("existe a aluna maria?"+vetor.contem(aluno1));


        vetor.remove(aluno1);
        System.out.println("existe a aluna maria?"+vetor.contem(aluno1));

        
        System.out.println("qual o tamanho do vetor?"+vetor.tamanho());

    }
}
