package Marco_3.Atividade17;

public class Main {
    public static void main(String[] args) {
        AVL avl = new AVL();

        avl.insere(51);
        avl.insere(57);
        avl.insere(98);
        avl.insere(19);
        avl.insere(11);
        avl.insere(45);
        avl.insere(79);

        avl.mostrarArvoreBalanceada();
    }
}
