class Student {
    private String name;
    private int rollNo;
    private int age; // with validation

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }
    
    // validation in setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Please enter a valid age.");
        }
    }
}


public class Encapsulation06 {
    public static void main(String[] args) {

        // Usage of encapsulation:
        Student student1 = new Student();
        student1.setName("Alice");
        student1.setRollNo(101);
        student1.setAge(20);

        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Roll No: " + student1.getRollNo());
        System.out.println("Student Age: " + student1.getAge());
    }
}
