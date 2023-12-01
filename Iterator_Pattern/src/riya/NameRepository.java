package riya;

public class NameRepository implements Container{
    
    protected static String names[]={"Riya","Jash","Shruti","Priya"};
    
    @Override
    public Iterator getIterator()
    {
        return new NameIterator();
    }
}
