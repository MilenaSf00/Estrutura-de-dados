package Marco_2.Atvidade12;

/*
 * Atividade 12.
 */
public class Main {
    public static void main(String[] args) {
    
        FilaLista fila = new FilaLista();
        Aluno aluno1 = new Aluno("Aluno1", 20, 9.5);
        Aluno aluno2 = new Aluno("Aluno2", 20, 9.5);
        Aluno aluno3 = new Aluno("Aluno3", 20, 9.5);
        
        fila.adicionar(aluno1);
        fila.adicionar(aluno2);
        fila.adicionar(aluno3);

        fila.imprimirLista();

        fila.remover();
        System.out.println("===");
        fila.imprimirLista();


        System.out.println("Tamanho da fila: " + fila.size());
        System.out.println("Está vazio? " + fila.isEmpty());
    }
}
