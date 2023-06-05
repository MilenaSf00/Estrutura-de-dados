package Atividade3;

public interface IVetor{
    public  boolean adicionarAluno(Aluno al);
    public  int tamanho();
    public  boolean contem(Aluno al);
    public  boolean cheio();
    public  boolean remove(Aluno al);
    public void garanteEspaco();
}