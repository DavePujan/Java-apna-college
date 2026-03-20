// find area of circle

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        sc.close();
        double area = 3.14 * radius * radius; // area = πr^2
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }
}
