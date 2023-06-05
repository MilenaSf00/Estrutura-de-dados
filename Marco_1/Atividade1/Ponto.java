package Atividade1;

/*
 * Váriaveis x2 e y2 do tipo PontoCartesiano.
 * O método distanciaEuclidiana calcula a distância dos pontos x2 e y2.
 */

 public class Ponto {
    private PontoCartesiano x2;
    private PontoCartesiano y2;

    public Ponto(PontoCartesiano x2, PontoCartesiano y2){
        this.x2 = x2;
        this.y2=y2;
    }

    public PontoCartesiano getX() {
        return x2;
    }
    public void setX(PontoCartesiano x2) {
        this.x2 = x2;
    }public PontoCartesiano getY() {
        return y2;
    }public void setY(PontoCartesiano y2) {
        this.y2 = y2;
    }

/*
 * Calcula a distância  da coordenada x2(segundo ponto) e x (primeiro ponto) subtraindo esse valor que é 
 * é armazenado em distanciaX.
 * Calcula a distância  da coordenada y2(segundo ponto) e y (primeiro ponto) subtraindo esse valor que é 
 * é armazenado em distanciaY.
 * Math.pow calcula a soma dos quadrados.
 * Math.sqrt calcula a raiz quadrada da soma dos quadrados.
 */
    public double distanciaEuclidiana(){
        double distanciaX =x2.getX() - y2.getX();
        double distanciaY = x2.getY() - y2.getY();
        double somaDosQuadrados = Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2);
        double distancia = Math.sqrt(somaDosQuadrados);
        return distancia;
    }
}

