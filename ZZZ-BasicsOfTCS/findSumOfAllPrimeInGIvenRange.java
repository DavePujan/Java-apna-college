// find sum of all prime numbers in given range

import java.util.Scanner;

public class findSumOfAllPrimeInGIvenRange {

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
        System.out.print("Enter the lower bound of the range: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upper = sc.nextInt();
        sc.close();
        int sum = 0;

        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Sum of all prime numbers between " + lower + " and " + upper + " is: " + sum);
    }

}
