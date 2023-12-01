package myclass;

import myclass.MyClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author riyaj
 */
public class MyClassTest {
    MyClass my;
    
    public MyClassTest() {
    }
    
    @Before
    public void setUp() {
        my = new MyClass();
    }
    
    @After
    public void tearDown() 
    {
        my=null;
    }

    @Test
    public void testMain() 
    {
        int a=20,b=20,c;
        c=my.add(a, b);
        assertEquals(40,30);
    }
    
}





















