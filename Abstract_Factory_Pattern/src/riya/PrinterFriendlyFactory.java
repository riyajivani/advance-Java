package riya;

public class PrinterFriendlyFactory implements ShapeFactory{
    @Override
    public Shape getShape(String sourceType)
    {
        switch(sourceType)
        {
            case "Circle":
                return new PrinterFriendlyCircle(5,5,10);
            case "Square":
                return new PrinterFriendlySquare(10);
            
        }
        return null;
    }
}
