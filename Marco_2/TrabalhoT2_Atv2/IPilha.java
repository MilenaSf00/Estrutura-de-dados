package Marco_2.TrabalhoT2_Atv2;

public interface IPilha {
    public boolean Push(Object info);
    public Object Pop();
    public Object top(); 
    public boolean isEmpty();
    public int size();
    public  boolean testaPalindromo(String palavra);
    public void imprimeResultado(String palavra);
}
