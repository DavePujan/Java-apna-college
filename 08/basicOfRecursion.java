public class basicOfRecursion {

    static void printNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n + " ");
        printNum(n - 1);
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    static int sumDigits(int n) {
        if (n == 0)
            return 0;
        return n % 10 + sumDigits(n / 10);
    }

    static String reverseString(String s) {
        if (s.length() == 0)
            return "";
        return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
    }

    static void toh(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println(a + " -> " + c);
            return;
        }
        toh(n - 1, a, c, b);
        System.out.println(a + " -> " + c);
        toh(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        int n = 5;
        printNum(n);
        System.out.println("Factorial of " + n + " is: " + factorial(n));
        int fibN = 10;
        System.out.println("Fibonacci of " + fibN + " is: " + fib(fibN));
        int num = 12345;
        System.out.println("Sum of digits of " + num + " is: " + sumDigits(num));
        String str = "Hello";
        System.out.println("Reverse of " + str + " is: " + reverseString(str));

        int disks = 3;
        System.out.println("Tower of Hanoi solution for " + disks + " disks:");
        toh(disks, 'A', 'B', 'C');

    }
}
