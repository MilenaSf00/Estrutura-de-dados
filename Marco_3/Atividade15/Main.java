package Marco_3.Atividade15;

public class Main {
    public static void main(String[] args) {
        ABB abb = new ABB();
        abb.add(63);
        abb.add(7);
        abb.add(2);
        abb.add(59);
        abb.add(52);
        abb.add(60);
        abb.add(90);


        Noh valor = abb.busca(52);
        System.out.println("Valor buscado: " + valor.getValor());
        abb.imprimir(abb.getRaiz());
    }
}
