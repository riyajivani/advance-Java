package riya;

class FruitFactory 
{    
    public Fruit getFruit(String type)
    {
        if (type.equalsIgnoreCase("apple")) 
        {
            return new Apple();
        } 
        else if (type.equalsIgnoreCase("orange")) 
        {
            return new Orange();
        } 
        else if (type.equalsIgnoreCase("banana")) 
        {
            return new Banana();
        } 
        else 
        {
            throw new IllegalArgumentException("Invalid fruit type: " + type);
        }
    }
}