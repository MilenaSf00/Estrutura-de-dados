package Marco_2.Teste;

public class Main {
    public static void main(String[] args) {
    
        Mapa mapa = new Mapa();

        Aluno aluno1 = new Aluno("Milena", 3);
        Aluno aluno2 = new Aluno("Ana", 23);
        Aluno aluno3 = new Aluno("Joao", 43);
        
        mapa.put(3, aluno1);
        mapa.put(23, aluno2);
        mapa.put(43, aluno3);

        System.out.println(mapa.get(3));
        System.out.println(mapa.get(23));
        System.out.println(mapa.get(43));

    }

}
