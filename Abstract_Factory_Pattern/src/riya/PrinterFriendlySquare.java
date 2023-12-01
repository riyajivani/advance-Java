package riya;

public class PrinterFriendlySquare implements PrinterFriendlyShape{

    private final int width;

    public PrinterFriendlySquare(int width) {
        this.width = width;
        System.out.println("PrinterFriendlySquare Constructor");
    }
    
    public void draw()
    {
        System.out.println("PrinterFriendlySquare::draw()");
    }
}
