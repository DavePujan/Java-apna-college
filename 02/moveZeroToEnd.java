public class moveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0 ,1,0,3,12};
        System.out.println("Array after moving zeroes to the end:");
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int[] arr2 = {0,0,1};
        System.out.println("\nArray after moving zeroes to the end:");
        moveZeroes(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    public static int[] moveZeroes(int[] arr) {
        int zeroIndex = 0; // Pointer for the position of the next non-zero element

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap non-zero element to the front
                int temp = arr[zeroIndex];
                arr[zeroIndex] = arr[i];
                arr[i] = temp;
                zeroIndex++;
            }
        }return arr;
    }
}
