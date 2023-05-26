package Atividade8_prova;
/*
 * Questão 8 prova
 */

public class Main {
    public static void main(String[] args) {

        ListaD lista1 = new ListaD();
        lista1.insereFim(1);
        lista1.insereFim(2);
        lista1.insereFim(3);
        lista1.insereFim(4);

        ListaD lista2 = new ListaD();
        lista2.insereFim(5);
        lista2.insereFim(6);
        lista2.insereFim(7);
        lista2.insereFim(8);

       
        lista1.concat(lista2, lista2);
        lista1.imprimeLista();
    }

}