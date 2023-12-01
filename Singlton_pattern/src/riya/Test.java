package riya;

public class Test {
    public static void main(String[] args) {
        Logger logger1=Logger.getInstance();
        Logger logger2=Logger.getInstance();
        
        System.err.println("Object references: \n logger1 = "+logger1+"\n logger2 = "+logger2);
    }
 
}
