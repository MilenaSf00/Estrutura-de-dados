package Marco_2.Atividade13;
/*
 * Atividade 13. Encontrar uma forma de minimizar o problema das colisões.
 */
public class Main {
    public static void main(String[] args) {
        
        Mapa mapa = new Mapa(20);

        Aluno aluno1 = new Aluno("Aluno1", 3);
        Aluno aluno2 = new Aluno("Aluno2", 23);
        Aluno aluno3 = new Aluno("Aluno3", 43);

        mapa.put(aluno1.getMatricula(), aluno1); 
        mapa.put(aluno2.getMatricula(), aluno2); 
        mapa.put(aluno3.getMatricula(), aluno3); 

        Aluno alunoEncontrado1 = mapa.get(3); 
        Aluno alunoEncontrado2 = mapa.get(23); 
        Aluno alunoEncontrado3 = mapa.get(43); 

        System.out.println("Alunos:");
        System.out.println(alunoEncontrado1);
        System.out.println(alunoEncontrado2);
        System.out.println(alunoEncontrado3);
    }        
}   