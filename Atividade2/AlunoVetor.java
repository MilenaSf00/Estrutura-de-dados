package Atividade2;

public class AlunoVetor {
    private Aluno[] alunos = new Aluno[5];
    private int totalDeAlunos;
  
    public AlunoVetor(){
       alunos= new Aluno[5];
       this.totalDeAlunos = 0;
    }

    public boolean adicionarAluno(Aluno al){
        if(totalDeAlunos <alunos.length){
            alunos[totalDeAlunos] = al;
            totalDeAlunos ++;
         return true;
        }
        return false;
    }

    public int tamanho (){
        return totalDeAlunos;
    }

    public boolean contem(Aluno al){
        for(int i = 0; i < totalDeAlunos; i++){
            if(al.getNome().equals(alunos[i].getNome())){
                return true;
            }
        } 
        return false;
    }
}