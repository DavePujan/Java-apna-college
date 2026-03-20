// find maximum of four numbers
public class findMaxOfFour {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15, d = 25;
        int max = a; // Assume a is the largest

        if (b > max) {
            max = b; // Update max if b is larger
        }
        if (c > max) {
            max = c; // Update max if c is larger
        }
        if (d > max) {
            max = d; // Update max if d is larger
        }

        System.out.println("The maximum of " + a + ", " + b + ", " + c + ", and " + d + " is: " + max);
    }
}
