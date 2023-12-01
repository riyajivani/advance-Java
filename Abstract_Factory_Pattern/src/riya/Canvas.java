package riya;

import java.util.ArrayList;
import java.util.Iterator;

public class Canvas {
  private  ArrayList<Shape> shapeList = new ArrayList<Shape>();
  
  public void addNewShape(String shapeType, String ObjectType)
  {
      Shape shape=null;
      
      switch (ObjectType) 
      {
            case "DisplayFriendly":{
                shape=new DisplayFriendlyFactory().getShape(shapeType);
                break;
            }   
            case "PrinterFriendly":{
                shape=new PrinterFriendlyFactory().getShape(shapeType);
                break;
            }
        }
      
      shapeList.add(shape);
  }
  
  public void redraw()
  {
      Iterator<Shape> itr = shapeList.iterator();
      while(itr.hasNext())
      {
          Shape shape = itr.next();
          shape.draw();
      }
  }
}
