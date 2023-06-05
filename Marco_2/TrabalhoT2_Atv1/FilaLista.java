package Marco_2.TrabalhoT2_Atv1;

public class FilaLista implements IFila{ 
    private Noh inicio;
    private Noh fim;

    public FilaLista(){
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public boolean adicionar(Aluno aluno) {
       Noh novo = new Noh(aluno);
        if(this.isEmpty()){
            inicio = novo;
            fim = novo;
        }else{
            fim.setProximo(novo);
            fim = novo;
            return true;
        }
        return false;
    }

    @Override
    public Aluno remover() {
        if (!isEmpty()) {
            Noh nohRemover = inicio; 
            Aluno alunoRemovido = (Aluno) nohRemover.getInformacao(); 
            inicio = inicio.getProximo(); 
            if (inicio == null) {
                fim = null; 
            }
            nohRemover.setProximo(null);
            return alunoRemovido;
        }
        return null; 
    }

    @Override
    public boolean isEmpty() {
        return inicio == null && fim == null;
    }    

    @Override
    public int size() {
        int tamanho = 0;
        Noh nohAtual = inicio;
        while (nohAtual != null) {
            tamanho++;
            nohAtual = nohAtual.getProximo();
        }
        return tamanho;
    }

    @Override
    public void imprimirLista() {
        if (isEmpty()) {
            System.out.println("A fila vazia.");
            return;
        }
        Noh nohAtual = inicio;
        while (nohAtual != null) {
            Aluno al = (Aluno) nohAtual.getInformacao();
            System.out.println("Nome: "+ al.getNome()); 
            System.out.println("idade: "+ al.getIdade()); 
            System.out.println("nota: "+ al.getNota()); 
            nohAtual = nohAtual.getProximo();
        }
    } 
}
