package Atividade5_prova;

public class ListaD implements IInterfaceLD{
  private Noh inicio;
  private Noh fim;
  private int totalDeAlunos;

  public ListaD(){
    this.inicio = null;
    this.fim = null;
    this.totalDeAlunos = 0;
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
    totalDeAlunos ++;
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
    return totalDeAlunos;
  }
  
  @Override
  public int nroPares() {
    int quantidadePares = 0;
    Noh nohAtual = inicio;
  
    while (nohAtual != null) {
        if (nohAtual.getInformacao() % 2 == 0) {
          quantidadePares++;
        }
        nohAtual = nohAtual.getProximo();
    }
    return quantidadePares;
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
}