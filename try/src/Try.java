import pkgtry.FourVehical;
import pkgtry.Vehical;

class Car implements Vehical,FourVehical
{
    @Override
    public void drive()
    {
        Vehical.super.drive();
        FourVehical.super.drive();
        Vehical.blow();
        System.out.println("Drive me I'M a car!");
    }
}

public class Try
{
    public static void main(String[]args)
    {
        Vehical v = new Car();
        v.drive();
    }
}