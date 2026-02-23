// 1342. Number of Steps to Reduce a Number to Zero
public class lc1342 {
    public int numberOfSteps(int num) {
        if(num == 0) return 0;
        if(num % 2 == 0) return 1+ numberOfSteps(num/2);
        else return 1+ numberOfSteps(num-1);
    }

    public static void main(String[] args) {
        lc1342 obj = new lc1342();
        int num = 14;
        System.out.println("Number of steps to reduce " + num + " to zero is: " + obj.numberOfSteps(num));
    }
}

// explanation for num = 14
// Step 1) 14 is even; divide by 2 and obtain 7. 
// Step 2) 7 is odd; subtract 1 and obtain 6.
// Step 3) 6 is even; divide by 2 and obtain 3. 
// Step 4) 3 is odd; subtract 1 and obtain 2. 
// Step 5) 2 is even; divide by 2 and obtain 1. 
// Step 6) 1 is odd; subtract 1 and obtain 0.