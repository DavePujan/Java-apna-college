// check if a number is prime or not
import java.util.*;
public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        
        // Loop only up to square root of n for efficiency
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(num + (isPrime(num) ? " is prime." : " is not prime."));
    }
}
