// This code defines a Student class with attributes name and age, and a method displayInfo() to print the student's information.
// In the main method, two Student objects are created, their attributes are set, and their information is displayed using the displayInfo() method.

// we will connect theory of class object with attributes and methods
class Student {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    // method with value return type
    int calculateYearOfBirth(int currentYear) {
        return currentYear - age;
    }
}

public class attributeAndMethods02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Alice";
        student1.age = 20;

        Student student2 = new Student();
        student2.name = "Bob";
        student2.age = 22;

        student1.displayInfo();
        student2.displayInfo();

        // object independence
        student1.name = "Charlie";
        student1.age = 25;

        student1.displayInfo();
        student2.displayInfo();
        // This shows that changing the attributes of student1 does not affect student2, demonstrating object independence.

        // here attributes are : name and age
        
        // now methods
        // here method is displayInfo() which is used to display the information of the student
        // method syntax : returnType methodName(parameters) { // method body }
    }
}
