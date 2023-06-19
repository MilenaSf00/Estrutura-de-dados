package Marco_2.Atividade13;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula){
        this.nome=nome;
        this.matricula=matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
   
    @Override
    public String toString() {
        return "Nome: " + nome + ", Matrícula: " + matricula;
    }
}
