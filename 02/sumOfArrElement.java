public class sumOfArrElement {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -2, 4};
        System.out.println("Sum of Array Elements: " + sumOfArray(arr));
    }
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
