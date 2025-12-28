public class armstrong {
    public static void main(String[] args) {
        int n = 153;
        int original = n;
         
        int temp = n;
        int digits = 0;

        while(temp > 0){
            digits++;
            temp = temp % 10;
        }

        int sum= 0;
        while(n>0){
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n = n / 10;
        }
        if(sum == original){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
