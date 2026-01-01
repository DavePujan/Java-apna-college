public class reverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5  };
       
        System.out.println("Reversed Array: ");
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }
}
