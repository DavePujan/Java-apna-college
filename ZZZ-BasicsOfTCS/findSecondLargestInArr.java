// find second largest element in an array
public class findSecondLargestInArr {
    public static int findSecondLargest(int[] arr) {
        // first find max and then find second largest
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max; // Update secondMax before updating max
                max = num; // Update max
            } else if (num > secondMax && num != max) {
                secondMax = num; // Update secondMax if num is between max and secondMax
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        int secondLargest = findSecondLargest(arr);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("There is no second largest element.");
        }
    }
}