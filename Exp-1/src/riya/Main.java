package riya;

interface Drivable {
    void start();
    void stop();
    void accelerate();
    void brake();
}

abstract class Vehicle {
    protected String name;
    protected int speed;

        public Vehicle(String name) {
            this.name = name;
            this.speed = 0;
    	}

    	public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Speed: " + speed + " mph");
    	}
}
class Car extends Vehicle implements Drivable {
    public Car(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(name + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println(name + " is stopping.");
    }

    @Override
    public void accelerate() {
        speed += 10;
        System.out.println(name + " is accelerating.");
    }

    @Override
    public void brake() {
        speed -= 5;
        System.out.println(name + " is braking.");
    }
}

class Bicycle implements Drivable {
    private String name;
    private int speed;

    public Bicycle(String name) {
        this.name = name;
        this.speed = 0;
    }

    @Override
    public void start() {
        System.out.println(name + " is starting to pedal.");
    }

    @Override
    public void stop() {
        System.out.println(name + " has stopped.");
    }

    @Override
    public void accelerate() {
        speed += 5;
        System.out.println(name + " is pedaling faster.");
    }

    @Override
    public void brake() {
        speed -= 2;
        System.out.println(name + " is applying brakes.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Speed: " + speed + " mph");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        Bicycle myBicycle = new Bicycle("Mountain Bike");

        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.stop();

        System.out.println();

        myBicycle.start();
        myBicycle.accelerate();
        myBicycle.brake();
        myBicycle.stop();

        System.out.println("\nCar Info:");
        myCar.displayInfo();

        System.out.println("\nBicycle Info:");
        myBicycle.displayInfo();
    }
}
