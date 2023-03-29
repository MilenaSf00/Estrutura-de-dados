package Atividade1;

/*
 * Variáveis x e y são coordenadas de um ponto do plano cartesiano.
 * Métodos get e set. 
*/
public class PontoCartesiano{
    private double x;
    private double y;

    public PontoCartesiano(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x =x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y= y;
    }





}