package Marco_2.Atividade13;

public class Mapa implements Interface {
    private Aluno[] vetorAl;

    public Mapa(int tamanho) {
        vetorAl = new Aluno[tamanho];
    }

    @Override
    public int hash(int chave) {
        return chave % vetorAl.length;
    }

    @Override
    public Aluno get(int chave) {
        int sondagem = 0;
        int hash;
        while (sondagem < vetorAl.length) {
            hash = (hash(chave) + sondagem) % vetorAl.length;
            if (vetorAl[hash] != null && vetorAl[hash].getMatricula() == chave) {
                Aluno aluno = vetorAl[hash];
                vetorAl[hash] = null; 
                return aluno;
            }
            sondagem++;
        }
        return null;
    }

    @Override
    public void put(int chave, Aluno valor) {
        int sondagem = 0;
        int hash;
        while (sondagem < vetorAl.length) {
            hash = (hash(chave) + sondagem) % vetorAl.length;
            if (vetorAl[hash] == null ||
                    vetorAl[hash].getMatricula() == chave) {
                vetorAl[hash] = valor;
                return;
            }
            sondagem++;
        }
    }

    @Override
    public Aluno remove(int chave) {
        int hash = hash(chave);
        Aluno aluno = this.vetorAl[hash];
        this.vetorAl[hash(chave)] = null;
        return aluno;
    }
}

