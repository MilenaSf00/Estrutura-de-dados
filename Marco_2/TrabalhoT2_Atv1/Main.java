package Marco_2.TrabalhoT2_Atv1;
/*
 * Trabalho T2. Inverter a ordem dos alunos.
 */
public class Main {
    public static void main(String[] args) {
        FilaLista fila = new FilaLista();
        PilhaLista pilha = new PilhaLista();

        Aluno aluno1 = new Aluno("Aluno1", 20, 9.5);
        Aluno aluno2 = new Aluno("Aluno2", 20, 9.5);
        Aluno aluno3 = new Aluno("Aluno3", 20, 9.5);

        fila.adicionar(aluno1);
        fila.adicionar(aluno2);
        fila.adicionar(aluno3);

        System.out.println("Fila original:");
        fila.imprimirLista();

        //Aluno removerAl = fila.remover();
        //System.out.println("Aluno removido: " + removerAl.getNome());

        pilha.inverter(fila);

        System.out.println("Pilha invertida:");
        pilha.imprimirPilha();
    
        System.out.println("Tamanho da pilha" + pilha.size());
    }
}