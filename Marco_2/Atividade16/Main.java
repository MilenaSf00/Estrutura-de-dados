package Marco_2.Atividade16;

public class Main {
    public static void main(String[] args) {
       

        ABB abb = new ABB();

        abb.add(52);
        abb.add(22);
        abb.add(8);
        abb.add(11);
        abb.add(43);
        abb.add(26);
        abb.add(85);
        abb.add(81);
        abb.add(69);
        abb.add(96);

        System.out.println("busca iterativa");
        Noh buscaIterativa = abb.buscaIterativa(11);
        System.out.println("Encontrado: " + buscaIterativa.getValor());

        System.out.println("busca recursiva");
        Noh buscaRecursiva = abb.buscaRec(26);
        System.out.println("Encontrado: " + buscaRecursiva.getValor());

        System.out.println("Pré-ordem:");
        abb.preOrdem();

        System.out.println("Em ordem:");
        abb.emOrdem();

        System.out.println("Pós-ordem:");
        abb.posOrdem();

        System.out.println("Largura:");
        abb.imprimeLargura();
        
    }
}
