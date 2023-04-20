package Atividade5;



public class Main {
    public static void main (String[] args){
        IInterfaceLSE lista = new ListaSE();
      
        lista.insereInicio(5);
        lista.insereInicio(32);
        lista.insereFim(8);
    
        lista.imprimeLista();
        lista.remove(5);
 
        System.out.println("  Quantos elementos tem na lista?  " + lista.tamanho());
        
    }
}
