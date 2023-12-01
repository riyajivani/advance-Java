package riya;

public class Rectangle extends Shape{
    
    public Rectangle()
    {
        type = "Rectangle";
        System.err.println("Rectangle object created.");
    }
    @Override
    void draw() {
        System.err.println("Inside Rectangle :: draw()");
    }
}
