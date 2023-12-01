package riya;

/**
 *
 * @author riyaj
 */
public class House {
    private int lock;

    public House() {
        lock=-1;
    }
    
    public void lock(Person p)
    {
        lock=p.getKey().getId();
    }
    public void unlock(Person p)
    {
        if(lock==p.getKey().getId()){lock=-1;}
    }
    
    public boolean isLocked()
    {
        if(lock==-1)
        {
            return false;
        }
        return true;
    }
}
