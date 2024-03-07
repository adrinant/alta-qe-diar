package OOP.Inheritance;

public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String brand, int year, boolean hasSideCar) {
        super(brand, year);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void drive() {
        System.out.println("This motorcycle is driving.");
    }

    public void wheelie() {
        System.out.println("Doing a wheelie!");
    }
}
