package OOP.Inheritance;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void drive() {
        System.out.println("This vehicle is driving.");
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}
