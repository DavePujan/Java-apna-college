// This code demonstrates the concept of classes and objects in Java.
// A class is a blueprint for creating objects, and an object is an instance of a class
class Car {
    String brand;
    String model;
    int year;
}

public class objectAndClass01 {
    public static void main(String[] args) {
        // creating an object of the class
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;

        // creating another object of the class
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2019;

        // printing the details of the cars
        System.out.println("Car 1: " + car1.brand + " " + car1.model + " " + car1.year);
        System.out.println("Car 2: " + car2.brand + " " + car2.model + " " + car2.year);
    }
}
