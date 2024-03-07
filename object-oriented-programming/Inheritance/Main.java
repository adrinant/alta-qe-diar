package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);
        Motorcycle myMotorcycle = new Motorcycle("Honda", 2020, false);
        MaticCar myMaticCar = new MaticCar("Mitsubishi", 2023, 4);

        // Memanggil method dari subclass
        myCar.drive(); // Output: This car is driving.
        myCar.honk(); // Output: Beep beep!

        // Memanggil method dari superclass
        System.out.println("Brand: " + myCar.getBrand()); // Output: Brand: Toyota
        System.out.println("Year: " + myCar.getYear()); // Output: Year: 2022

        System.out.println();
        // Memanggil method dari subclass
        myMotorcycle.drive(); // Output: This motorcycle is driving.
        myMotorcycle.wheelie(); // Output: Doing a wheelie!


        // Memanggil method dari superclass
        System.out.println("Brand: " + myMotorcycle.getBrand()); // Output: Brand: Honda
        System.out.println("Year: " + myMotorcycle.getYear()); // Output: Year: 2020

        System.out.println();
        // Matic Car (Cucu dari Vehicle)
        myMaticCar.drive();
        myMaticCar.honk();
        System.out.println("Brand: "+ myMaticCar.getBrand());
        System.out.println("Year: "+ myMaticCar.getYear());
        myMaticCar.transmission();
    }
}
