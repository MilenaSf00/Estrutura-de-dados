package Marco_2.Atividade15;

public class Noh {
    private int valor;
    private Noh esquerda;
    private Noh direita;
    private Noh pai;

    public Noh(int v) {
        this.valor = v;
        
    }

    public Noh getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Noh esquerda) {
        this.esquerda = esquerda;
    }

    public Noh getDireita() {
        return direita;
    }

    public void setDireita(Noh direita) {
        this.direita = direita;
    }

    public Noh getPai() {
        return pai;
    }

    public void setPai(Noh pai) {
        this.pai = pai;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
