class parentClass {
    void show() {
        System.out.println("This is the parent class.");
    }
}

class childClass extends parentClass {
    void display() {
        System.out.println("This is the child class.");
    }
}

public class Inheritance07 {
    public static void main(String[] args) {
        childClass child = new childClass();
        child.show(); // inherited method from parent class
        child.display(); // method of child class
    }
}
