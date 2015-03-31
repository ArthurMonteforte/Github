package analisadorlexico;

public class SimpleToken extends Token
    implements ConstantsInterface{
    public SimpleToken(int t) {
        setTipo(t);
    }
    
    public String toString() {
        String str = null;
            switch(getTipo()) {
                
            }
            return "token:\ttipo: "+str+"\tvalue: "+stringRep();
    }
    
}
