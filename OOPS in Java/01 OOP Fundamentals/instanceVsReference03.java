class Student {
    String name;
    int age;
}

public class instanceVsReference03 {
    // object:
    new Student(); // this creates an object of the Student class and returns a reference to it
    // reference:
    Student student1; // this creates a reference variable student1 of type Student, but it does not point to any object yet
    // instance:
    student1 = new Student(); // this creates an instance of the Student class and assigns its reference to student1

    public static void main(String[] args) {
        Student student1 = new Student(); // this creates an object of the Student class and assigns its reference to student1
        student1.name = "Alice"; // this sets the name attribute of the student1 object to "Alice"
        student1.age = 20; // this sets the age attribute of the student1 object to 20

        Student student2 = new Student(); // this creates another object of the Student class and assigns its reference to student2
        student2.name = "Bob"; // this sets the name attribute of the student2 object to "Bob"
        student2.age = 22; // this sets the age attribute of the student2 object to 22

        System.out.println("Student 1: " + student1.name + ", Age: " + student1.age); // this prints the details of student1
        System.out.println("Student 2: " + student2.name + ", Age: " + student2.age); // this prints the details of student2
    }
}
