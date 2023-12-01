package riya;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author riyaj
 */
public class PersonIT {
    public PersonIT() {}
    
    @Before
    public void setUp() {}
    
    @Test
    public void testPerson() {
        Person p=new Person();
        p.setKey(new Key());
        House h = new House();
        h.lock(p);
        assertEquals(true,h.isLocked());
        h.unlock(p);
        assertEquals(false,h.isLocked());
        h.lock(p);
        Key oldKey = p.getKey();
        Key newKey = new Key();
        p.setKey(newKey);
        h.unlock(p);
        assertEquals(true,h.isLocked());
    }
}
