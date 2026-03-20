// find all possible prime numbers up to a given number
import java.util.*;

public class findAllPossiblePrime {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        // Check divisors from 2 up to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime");
            }
        }
    }
}
