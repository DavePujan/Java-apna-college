// this is example 01
class Vehicle {
    double price;
    double mileage;
    String color;

    void display() {
        System.out.println("Price: " + price + ", Mileage: " + mileage + ", Color: " + color);
    }
}

class Car extends Vehicle {
    String fuelType;
    String brand;
}

public class InheritanceExample07 {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.price = 1000000;
        c1.mileage = 15;
        c1.color = "Red";
        c1.fuelType = "Petrol";
        c1.brand = "Tata";

        c1.display();
    }
}
