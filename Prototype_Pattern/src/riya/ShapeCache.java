package riya;

import java.util.HashMap;

public class ShapeCache {
    
    private static HashMap<String,Shape> shapemap = new HashMap<>();
    
    public static Shape getShape(String shapeId)
    {
        Shape cachedShape = shapemap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    
    public static void loadCache()
    {
        System.out.println("Starting object creation and caching");
        
        Circle circle = new Circle();
        circle.setId("1");
        shapemap.put(circle.getId(), circle);
        
        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapemap.put(rectangle.getId(), rectangle);
        
        Square square = new Square();
        square.setId("3");
        shapemap.put(square.getId(), square);
        
        System.out.println("ending object creation and caching");
    }
}
