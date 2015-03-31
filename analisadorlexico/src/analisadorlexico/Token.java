package analisadorlexico;

public abstract class Token {
    private int tipo;
    
    public int getTipo(){
        return tipo;
    }
    
    public void setTipo (int t){
        tipo = t;
    }    
}
