package Marco_3.Atividade17;

public class Noh {
    private int informacao;
    private Noh esquerda;
    private Noh direita;
    private Noh pai;
    private int balanceamento;

    public Noh(int informacao) {
        this.informacao = informacao;
        this.esquerda = null;
        this.direita = null;
        this.pai = null;
        this.balanceamento = 0;
    }

    public int getInformacao() {
        return informacao;
    }

    public void setInformacao(int informacao) {
        this.informacao = informacao;
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

    public int getBalanceamento() {
        return balanceamento;
    }

    public void setBalanceamento(int balanceamento) {
        this.balanceamento = balanceamento;
    }
}
