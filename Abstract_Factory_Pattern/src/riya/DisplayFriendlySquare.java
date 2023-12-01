package riya;

public class DisplayFriendlySquare implements DisplayFriendlyShape{

    private final int width;

    public DisplayFriendlySquare(int width) {
        this.width = width;
        System.out.println("DisplayFriendlySquare Constructor");
    }
    
    public void draw()
    {
        System.out.println("DisplayFriendlySquare::draw()");
    }
}
