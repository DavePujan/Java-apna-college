//  find maximum of three numbers
public class findMaxOfThree {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        int max = a; // Assume a is the largest

        if (b > max) {
            max = b; // Update max if b is larger
        }
        if (c > max) {
            max = c; // Update max if c is larger
        }

        System.out.println("The maximum of " + a + ", " + b + ", and " + c + " is: " + max);
    }
}
