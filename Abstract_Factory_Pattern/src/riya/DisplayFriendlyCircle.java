package riya;

public class DisplayFriendlyCircle implements DisplayFriendlyShape{
 
    private final int x,y,radius;

    public DisplayFriendlyCircle(int x,int y,int radius) {
        this.x=x;
        this.y=y;
        this.radius=radius;
        System.out.println("DisplayFriendlyCircle Constructor");
    }
    
    
    @Override
    public void draw()
    {
        System.out.println("DisplayFriendlyCircle::draw()");
    }
}
