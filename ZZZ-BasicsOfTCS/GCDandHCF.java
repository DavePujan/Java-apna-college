//  find GCD and HCF of two numbers
// gcd = greatest common divisor
// hcf = highest common factor
// both are same
public class GCDandHCF {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}

// calculation:
// 48 = 2^4 * 3^1
// 18 = 2^1 * 3^2
// GCD = 2^1 * 3^1 = 6