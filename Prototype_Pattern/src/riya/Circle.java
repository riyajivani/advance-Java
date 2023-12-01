package riya;

public class Circle extends Shape{

    public Circle()
    {
        type = "Circle";
        System.err.println("circle object created.");
    }
    @Override
    void draw() {
        System.err.println("Inside circle :: draw()");
    }
    
}
