package riya;

public class Square extends Shape{
    
    public Square()
    {
        type = "Rectangle";
        System.err.println("Square object created.");
    }
    @Override
    void draw() {
        System.err.println("Inside Square :: draw()");
    }
}
