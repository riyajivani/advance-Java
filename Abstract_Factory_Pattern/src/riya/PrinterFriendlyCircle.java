package riya;

public class PrinterFriendlyCircle implements PrinterFriendlyShape{
 
    private final int x,y,radius;

    public PrinterFriendlyCircle(int x,int y,int radius) {
        this.x=x;
        this.y=y;
        this.radius=radius;
        System.out.println("PrinterFriendlyCircle Constructor");
    }
    
    
    public void draw()
    {
        System.out.println("PrinterFriendlyCircle::draw()");
    }
}
