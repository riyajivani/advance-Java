package riya;

public class Test {

    public static void main(String[] args) {
        System.out.println("Price of CheeseCake " + new CheeseCake().price());
        System.out.println("Price of CreamCake " + new CreamCake().price());
        System.out.println("Price of CheeseCake with ExtraCheese " + new ExtraCheese(new CheeseCake()).price());
        System.out.println("Price of CheeseCake with ExtraCheese " + new ExtraCream(new CreamCake()).price());

    }
}
