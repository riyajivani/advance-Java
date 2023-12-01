package riya;

public class NameIterator implements Iterator{

    int index;
    
    @Override
    public boolean hasnext() {
        if(index<NameRepository.names.length)
            return true;
        
        return false;
    }

    @Override
    public Object next() {
        if(this.hasnext())
            return NameRepository.names[index++];
        
        return null;
    }
    
    
}
