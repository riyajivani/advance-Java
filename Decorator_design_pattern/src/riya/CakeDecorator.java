package riya;

public class CakeDecorator implements cake {

    protected cake c;

    public CakeDecorator(cake cake) {

        this.c = cake;
    }

    @Override
    public float price() {
        return c.price();
    }
}
