// 2. Print a N Fibonacci numbers

class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Print a 10 Fibonacci numbers
        int a = 0, b = 1;

        System.out.println("a " + n + " Fibonacci numbers:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}


// 1️⃣ Fibonacci Number – LC # 509
// 💡 Direct formula / recursion / DP (VERY related)
// 2️⃣ Climbing Stairs – LC #70
// 💡 Number of ways → Fibonacci pattern
// 3️⃣ Min Cost Climbing Stairs – LC # 746
// 💡 Also uses Fibonacci-like DP transitions
// 4️⃣ House Robber – LC # 198
// 💡 Similar recurrence to Fibonacci

