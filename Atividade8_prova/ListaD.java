package Atividade8_prova;

public class ListaD implements IInterfaceLD{
    private Noh inicio;
    private Noh fim;
    private int total;
  
    public ListaD(){
      this.inicio = null;
      this.fim = null;
      this.total = 0;
    }
  
    public Noh getInicio() {
        return inicio;
    }
    public Noh getFim() {
        return fim;
    }
    @Override
    public void insereInicio(int info) {
    Noh  novo = new Noh(info);
        if(inicio == null){
            inicio = novo;
            fim = novo;
            
        }else{
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
            
        }
        total ++;
    }
  
    @Override
    public void insereFim(int info) {
      Noh novo =  new Noh(info);
      if(fim == null){
        inicio = novo;
        fim = novo;
      }else{
        novo.setAnterior(fim);
        fim.setProximo(novo);
        fim = novo;
      }
  
    }
  
    @Override
    public boolean estahVazia() {
        return inicio == null;
    }
  
    @Override
    public boolean remove(int info) {
      Noh  p = inicio;
        while(p!=null && p.getInformacao() != info){
          p = p.getProximo();
          if(p==null){
              return false;
          }
          if(p == inicio){
          inicio = p.getProximo();
        
        if(inicio != null){
          inicio.setAnterior(null);
        }
        else{
          fim = null;
        }
      }else if(p.getProximo() == null){
          p.getAnterior().setProximo(null);
          fim = p.getAnterior();
        }else{
          p.getAnterior().setProximo(p.getProximo());
          p.getProximo().setAnterior(p.getAnterior());
        }
        
      }return true;
    }
  
    @Override
    public int tamanho() {
        return total;
    }
  
    @Override
    public int nroPares() {
        int count = 0;
        Noh current = inicio;
    
        while (current != null) {
            if (current.getInformacao() % 2 == 0) {
                count++;
            }
            current = current.getProximo();
        }
    
        return count;
    }
    

    @Override
    public void imprimeLista() {
      Noh nohAtual = inicio;
      System.out.println("Lista Encadeada:");
  
      while (nohAtual != null) {
          System.out.println(nohAtual.getInformacao());
          nohAtual = nohAtual.getProximo();
      }
  }

  @Override
  public boolean add_ordenado(int info) {
      
    Noh novo = new Noh(info);

    if (inicio == null) {
        inicio = novo;
        fim = novo;
    } else {
        Noh atual = inicio;

        while (atual != null && info > atual.getInformacao()) {
            atual = atual.getProximo();
        }

        if (atual == null) {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        } else if (atual == inicio) {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        } else {
            Noh anterior = atual.getAnterior();
            novo.setProximo(atual);
            novo.setAnterior(anterior);
            anterior.setProximo(novo);
            atual.setAnterior(novo);
        }
    }

    total++;
   
    return false;
  
  }

    @Override
    public boolean verificaPosicao(int info) {
    Noh atual = inicio;
    int posicao = 1;

    while (atual != null && info > atual.getInformacao()) {
        atual = atual.getProximo();
        posicao++;
    }

    if (atual != null && info == atual.getInformacao()) {
        System.out.println("O número " + info + " está na posição " + posicao + " da lista.");
        return true;
    } else {
        System.out.println("O número " + info + " não está na posição correta da lista.");
        return false;
    }
}

    @Override
    public void concat(ListaD l1, ListaD l2) {
        if (l1 == null || l1.estahVazia()) {
            return; 
        }

        if (l2 == null || l2.estahVazia()) {
            return; 
        }

        if (estahVazia()) {
            inicio = l1.getInicio();
            fim = l2.getFim();
        } else {
            fim.setProximo(l1.getInicio());
            l1.getInicio().setAnterior(fim);
            fim = l2.getFim();
        }

        total += l1.tamanho() + l2.tamanho();
    }

}




    
