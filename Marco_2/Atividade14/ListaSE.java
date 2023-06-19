package Marco_2.Atividade14;

public class ListaSE implements IInterfaceLSE { 
    private Noh<Object> inicio;
    private int totalDeAlunos;
  
    public ListaSE(){
       this.inicio=null;
       this.totalDeAlunos = 0;
    }
    public Noh<Object> getInicio() {
        return inicio;
    }

    public void setInicio(Noh<Object> inicio) {
        this.inicio = inicio;
    }
   
    public void insereInicio(Object informacao) {
        Noh<Object> novo = new Noh<>(informacao);
        if (inicio == null) {
            inicio = novo;
        } else {
            novo.setProximo(inicio);
            inicio = novo;
        }
        totalDeAlunos++;
    }

    
    public void insereFim(Object informacao) {
        
       Noh<Object> novo = new Noh<>(informacao);
       if(inicio == null){
        inicio = novo;
       }else{
        Noh <Object> ultimo = inicio;
        for(Noh <Object>i = inicio; i != null; i= i.getProximo()){
            ultimo = i;
        }
        ultimo.setProximo(novo);
       }
       totalDeAlunos++;
    }


    public boolean estahVazia(Object informacao) {
        return inicio == null;
    }

  
    public boolean remove(Object informacao) {
        Noh<Object> anterior = null, p = inicio;
        while (p != null && !p.getInformacao().equals(informacao)) {
            anterior = p;
            p = p.getProximo();
        }
        if (p == null) {
            return false;
        } else if (anterior == null) {
            inicio = p.getProximo();
        } else {
            anterior.setProximo(p.getProximo());
        }
       
        return true;
    }
  
    public int tamanho (){
        return totalDeAlunos;
    }


    public void imprimeLista (){
        Noh<Object>  nohAtual = inicio;
        while (nohAtual != null) {
            Aluno al = (Aluno)nohAtual.getInformacao();
            System.out.println("Nome do aluno: "+ al.getNome());
            System.out.println("Matricula: "+ al.getMatricula());
            nohAtual = nohAtual.getProximo();
        }
    }
}

