package Atividade3;


public class AlunoVetor implements IVetor{
    private Aluno[] alunos;
    private int totalDeAlunos;
  
    public AlunoVetor(int tamanho){
       alunos= new Aluno[tamanho];
       this.totalDeAlunos = 0; 
    }

    
    @Override
    public boolean adicionarAluno(Aluno al) {
       garanteEspaco();
       alunos[totalDeAlunos] = al;
       totalDeAlunos++;
       return true;
    }
 
    @Override
    public int tamanho (){
        return totalDeAlunos;
    }

   

    @Override
    public boolean contem(Aluno al){
        for(int i = 0; i < totalDeAlunos; i++){
            if(al.getNome().equals(alunos[i].getNome())){
                return true;
            }
        } 
        return false;
    }
 
    @Override  
    public boolean cheio() {
       if(totalDeAlunos == alunos.length){
        return true;
       }
       return false;

    }
 
    @Override
    public boolean remove(Aluno al) {
        int indice = -1;
        for(int i = 0; i < totalDeAlunos; i++){
            if(al == alunos[i]){
                indice = i;
                break;
            }
        }
        if(indice != -1){
            for(int i = indice; i < totalDeAlunos - 1 ; i++){
                alunos[i] = alunos[i+1];
            }
            totalDeAlunos--;
            return true;
        }
        return false;
    }
    

    @Override
    public void garanteEspaco(){
        if(this.cheio()){
            Aluno[] novosAlunos = new Aluno[this.alunos.length * 2];
            for(int i = 0; i < totalDeAlunos; i++){
                novosAlunos[i] = alunos[i];
            }
            alunos = novosAlunos;
        }
    }

}




