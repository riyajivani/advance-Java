package riya;

import java.util.Random;

/**
 *
 * @author riyaj
 */
public class Key {
    int id;

    public Key() {
        Random rand=new Random(); 
        this.id = rand.nextInt(100000);
    }

    public int getId() {
        return id;
    }
    
    
}
