package riya;

public class ExtraCheese extends CakeDecorator {

    public ExtraCheese(cake cake) {
        super(cake);
    }

    @Override
    public float price() {
        return c.price() + 100;
    }

}
