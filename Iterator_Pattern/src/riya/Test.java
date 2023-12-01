package riya;

public class Test {
    public static void main(String[] args) {
        NameRepository Rname = new NameRepository();
        
        for(Iterator i = Rname.getIterator();i.hasnext();)
        {
            String name = (String)i.next();
            System.out.println("Name: "+name);
        }
    }
   
}
