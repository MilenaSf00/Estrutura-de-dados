package Atividade1;

/*
 * Criação do objeto coordenada1 e coordenada2 da classe PontoCartesiano.
 * Criação do objeto ponto que recebe coordenada1 e coordenada2. Com o objeto 
 * ponto, posso utilizar o método distanciaEuclidiana().
 * 
 */

 public class Main {
    public static void main(String[]args){
      
        PontoCartesiano coordenada1 = new PontoCartesiano(4.0, 1.0);
        PontoCartesiano coordenada2 = new PontoCartesiano(5.0, 2.0);

        Ponto ponto = new Ponto(coordenada1, coordenada2);

        double distancia= ponto.distanciaEuclidiana();
        System.out.println(distancia);
    }
}
