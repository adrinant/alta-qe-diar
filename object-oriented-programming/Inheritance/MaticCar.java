package OOP.Inheritance;

public class MaticCar extends Car{
    public MaticCar(String brand, int year, int numberOfDoors) {
        super(brand, year, numberOfDoors);
    }

    public void transmission(){
        System.out.println("Matic car have automatic transmission");
    }
}
