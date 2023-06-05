package Atividade5_prova;
/*
 * Questão 5 prova.
 */
 
public class Main {
    public static void main (String[] args){
    IInterfaceLD lista = new ListaD();

    lista.insereInicio(2);
    lista.insereInicio(4);
    lista.insereFim(8);
    lista.insereFim(3);
    lista.insereFim(10);

    System.out.println("Lista: ");
    lista.imprimeLista();
 
    int quantidadePares = lista.nroPares();
    System.out.println("Número de elementos pares: " + quantidadePares);
    }
}