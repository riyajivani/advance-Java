package riya;

public class Factory_Pattern //user
{
    public static void main(String[] args) 
    {
        FruitFactory fruitFactory = new FruitFactory();

        Fruit apple = fruitFactory.getFruit("apple");
        apple.eat();

        Fruit orange = fruitFactory.getFruit("orange");
        orange.eat();

        Fruit banana = fruitFactory.getFruit("banana");
        banana.eat();
    }
}