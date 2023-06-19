package Marco_2.Atividade14;

public class Main {
    public static void main(String[] args) {
        MapaHashLSE mapa = new MapaHashLSE();

        Aluno aluno1 = new Aluno("Aluno1", 222);
        Aluno aluno2 = new Aluno("Aluno2", 466);
        Aluno aluno3 = new Aluno("Aluno3", 789);
        Aluno aluno4 = new Aluno("Aluno4", 22);
        Aluno aluno5 = new Aluno("Aluno5", 242);
        
        mapa.put(222, aluno1);
        mapa.put(466, aluno2);
        mapa.put(789, aluno3);
        mapa.put(22, aluno4);
        mapa.put(242, aluno5);
    
        System.out.println("Aluno com a matrícula 466 está na posição: " + mapa.hash(466));
        System.out.println("Aluno com a matrícula 22 está na posição: " + mapa.hash(22));

        mapa.resize();
        mapa.imprimirMapa();
    }
}

