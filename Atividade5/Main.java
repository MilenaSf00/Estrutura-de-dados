package Atividade5;

/*
 * Atividade 5. Implementação de LDE de inteiros.
 */
public class Main {
    public static void main (String[] args){
        IInterfaceLSE lista = new ListaDE();
      
        lista.insereInicio(5);
        lista.insereInicio(32);
        lista.insereFim(8);

        lista.imprimeLista();
        lista.remove(5);
 
        System.out.println("  Quantos elementos tem na lista?  " + lista.tamanho());
    }
}
