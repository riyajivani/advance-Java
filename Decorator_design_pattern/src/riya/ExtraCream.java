package riya;

public class ExtraCream extends CakeDecorator {

    public ExtraCream(cake cake) {
        super(cake);
    }

    @Override
    public float price() {
        return c.price() + 50;
    }

}
