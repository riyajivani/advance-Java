package lambdafunc;

interface MathCalc
{
    float calculation(float x,float y);
    
    default void display()
    {
        System.out.println("computation complete");
    }
}

public class LambdaFunc {

    public static void main(String[] args) {
        
        MathCalc addition = (a,b)->{return a+b;};
        MathCalc subtraction = (a,b)->{return a-b;};
        MathCalc multiplication = (a,b)->{return a*b;};
        MathCalc division = (a,b)->{return a/b;};
        
        System.out.println("addition is: "+ addition.calculation(50, 10));
        addition.display();
        System.out.println("subtraction is: "+ subtraction.calculation(50, 10));
        subtraction.display();
        System.out.println("multiplication is: "+ multiplication.calculation(50, 10));
        multiplication.display();
        System.out.println("division is: "+ division.calculation(50, 10));
        division.display();
    }
    
}
