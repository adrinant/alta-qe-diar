package OOP.Inheritance;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void drive() {
        System.out.println("This car is driving.");
    }

    public void honk() {
        System.out.println("Beep beep!");
    }
}
