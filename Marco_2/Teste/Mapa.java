package Marco_2.Teste;

public class Mapa {
    private Aluno[] vetor;


    public Mapa(){
        this.vetor = new Aluno[20];
    }

    public int hash(int chave){
        return chave % vetor.length;
    }

    public Aluno get(int chave){
        int hash = hash(chave);
        return this.vetor[hash];
    }
    public void put(int chave, Aluno valor){
        int hash = hash(chave);
        this.vetor[hash] = valor;
    }
    public Aluno remove(int chave){
        int hash = hash(chave);
        Aluno aluno = this.vetor[hash];
        this.vetor[hash] = null;
        return aluno;
    }
}
