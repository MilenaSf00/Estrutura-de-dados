package Marco_2.TrabalhoT2_Atv1;

public class PilhaLista implements IPilha {
    private Noh topo;
    private int size;

    public PilhaLista (){ 
        this.topo = null;
        size = 0;
    }

    @Override
    public boolean Push(Aluno aluno) {
        Noh novo = new Noh(aluno);
        if (this.isEmpty())
            topo = novo;
        else {
            novo.setProximo(topo);
            topo = novo;
        }
        size ++;
        return true;
    }
    
    @Override
    public Object Pop() {
        Object info = null;
        if (!this.isEmpty()){
            info = topo.getInformacao();
            topo = topo.getProximo();
        }
        return info;
    }

    @Override
    public Object top() {
        if (isEmpty()) {
            return null;
        }
        return topo.getInformacao();
    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void inverter(FilaLista fila) {
        while (!fila.isEmpty()) {
            Push(fila.remover());
        }
    }
    
    @Override
    public void imprimirPilha() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }
        Noh nohAtual = topo;
        while (nohAtual != null) {
            Aluno aluno = (Aluno) nohAtual.getInformacao();
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Nota: " + aluno.getNota());
            System.out.println("-------------------");
           nohAtual = nohAtual.getProximo();
        }
    }
}
