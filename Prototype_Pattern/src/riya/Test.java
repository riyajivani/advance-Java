package riya;

public class Test {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        
        Shape cloned1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: "+cloned1.getType());
        
        Shape cloned2 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: "+cloned2.getType());
        
        Shape cloned3 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: "+cloned3.getType());
        
        Shape cloned4 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: "+cloned4.getType());
        
        Shape cloned5 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape: "+cloned5.getType());
        
    }
 
}
