package Marco_2.TrabalhoT2_Atv1;

public interface IPilha {
    public boolean Push(Aluno aluno);
    public Object Pop();
    public Object top(); 
    public boolean isEmpty();
    public int size();
    public void inverter(FilaLista fila);
    public void imprimirPilha();
}
