package Atividade9_prova;
/*
 * Questão 9 prova
 */
public class Main {
    public static void main(String[] args) {
    
        ListaSE lista = new ListaSE();
        lista.insereFim(120);
        lista.insereFim(40);
        lista.insereFim(55);
        lista.insereFim(10);
        lista.insereFim(0);
    
        lista.imprimeLista();
        lista.bubble_sort();;
        lista.imprimeLista();
    
    }

}