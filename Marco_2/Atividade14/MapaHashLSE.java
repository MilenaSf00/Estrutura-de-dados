package Marco_2.Atividade14;


public class MapaHashLSE{
    private ListaSE[] vetorLista;

    public MapaHashLSE(){
        this.vetorLista = new ListaSE[10];
    }

    public int hash(int chave){
        return chave % vetorLista.length;
    }

    public void put(int chave, Aluno valor) {
    int hash = hash(chave);
    ListaSE alunosLista = this.vetorLista[hash];

    if (alunosLista == null) {
        alunosLista = new ListaSE();
        alunosLista.insereInicio(valor);
        this.vetorLista[hash] = alunosLista;
    } else {
        Noh n = alunosLista.getInicio();
        while (n != null) {
            if (((Aluno) n.getInformacao()).getMatricula() == chave) {
                n.setInformacao(valor);
                return;
            }
            n = n.getProximo();
        }
        alunosLista.insereInicio(valor);
    }
}

        
    public Aluno remove(int chave) {
    int hash = hash(chave);
    ListaSE alunosLista = this.vetorLista[hash];

    if (alunosLista != null) {
        for (Noh n = alunosLista.getInicio(); n != null; n = n.getProximo()) {
            Aluno aluno = (Aluno) n.getInformacao();
            if (aluno.getMatricula() == chave) {
                alunosLista.remove(aluno);
                return aluno;
            }
        }
    }

    return null;
}

    public Aluno get(int chave) {
        int hash = hash(chave);
        ListaSE alunosLista = this.vetorLista[hash];

        if(alunosLista != null){
            Noh n = alunosLista.getInicio();
            while(n!=null){
                if (((Aluno) n.getInformacao()).getMatricula() == chave) {
                    return (Aluno) n.getInformacao();
                }    
                n = n.getProximo();
            }
        }    
        return null;    
    }

public void resize() {
    int novoEspaco = vetorLista.length * 2;
    ListaSE[] novoVetorLista = new ListaSE[novoEspaco];
    
    
    rehash(novoVetorLista);
    vetorLista = novoVetorLista;
}


public void rehash(ListaSE[] novoVetorLista) {
    int novoTamanho = vetorLista.length;
    
    for (ListaSE alunosLista : vetorLista) {
        if (alunosLista != null) {
            Noh<Object> n = alunosLista.getInicio();
            while (n != null) {
                Aluno aluno = (Aluno) n.getInformacao();
                int novoIndice = hash(aluno.getMatricula()) % novoTamanho;
                ListaSE novaLista = novoVetorLista[novoIndice];
                if (novaLista == null) {
                    novaLista = new ListaSE();
                    novoVetorLista[novoIndice] = novaLista;
                }
                novaLista.insereInicio(aluno);
                n = n.getProximo();
            }
        }
    }
    
    vetorLista = novoVetorLista;
}


    public void imprimirMapa() {
        for (int i = 0; i < vetorLista.length; i++) {
            ListaSE alunosLista = vetorLista[i];
            System.out.println("Posição " + i + ":");

            if (alunosLista != null) {
                for (Noh n = alunosLista.getInicio(); n != null; n = n.getProximo()) {
                    Aluno aluno = (Aluno) n.getInformacao();
                    System.out.println("Matrícula: " + aluno.getMatricula());
                    System.out.println("Nome: " + aluno.getNome());
                }
            } else {
                System.out.println("Vazio");
            }
        }
    }


}