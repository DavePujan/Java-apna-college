public class GCD {
    public static int main(String[] args) {
        int a = 18;
        int b = 12;

        while(b!=0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
