package riya;

public class DisplayFriendlyFactory implements ShapeFactory{
    @Override
    public Shape getShape(String sourceType)
    {
        switch(sourceType)
        {
            case "Circle":{
                return new DisplayFriendlyCircle(5,5,10);
            }
            case "Square":{
                return new DisplayFriendlySquare(10);
            }
        }
        return null;
    }
}
