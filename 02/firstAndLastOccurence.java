public class firstAndLastOccurence {
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int target = 8;  // expected first index = 3, last index = 4
        int targetIndex = 6; // expected first index = -1, last index = -1

        int arrX[] = {};
        int targetX = 0; // expected first index = -1, last index = -1

        int arr1[] = {1}; 
        int target1 = 0; // expected first index = -1, last index = -1
        int targetIndexX = 1; // expected first index = -1, last index = -1

        int arr2[] = {2,2};
        int target2 = 2; // expected first index = 0, last index = 1
        int target2Index = 3; // expected first index = -1, last index = -1

        System.out.println("Array 1:");
        System.out.println("First and Last Occurence of " + target + ": [" + returnFirstAndLastOccurenceInArr(arr, target)[0] + ", " + returnFirstAndLastOccurenceInArr(arr, target)[1] + "]");
        System.out.println("First and Last Occurence of " + targetIndex + ": [" + returnFirstAndLastOccurenceInArr(arr, targetIndex)[0] + ", " + returnFirstAndLastOccurenceInArr(arr, targetIndex)[1] + "]");

        System.out.println("Array X:");
        System.out.println("First and Last Occurence of " + targetX + ": [" + returnFirstAndLastOccurenceInArr(arrX, targetX)[0] + ", " + returnFirstAndLastOccurenceInArr(arrX, targetX)[1] + "]");
        System.out.println("Array 2:");
        System.out.println("First and Last Occurence of " + target1 + ": [" + returnFirstAndLastOccurenceInArr(arr1, target1)[0] + ", " + returnFirstAndLastOccurenceInArr(arr1, target1)[1] + "]");
        System.out.println("First and Last Occurence of " + targetIndexX + ": [" + returnFirstAndLastOccurenceInArr(arr1, targetIndexX)[0] + ", " + returnFirstAndLastOccurenceInArr(arr1, targetIndexX)[1] + "]");

        System.out.println("Array 3:");
        System.out.println("First and Last Occurence of " + target2 + ": [" + returnFirstAndLastOccurenceInArr(arr2, target2)[0] + ", " + returnFirstAndLastOccurenceInArr(arr2, target2)[1] + "]");
        System.out.println("First and Last Occurence of " + target2Index + ": [" + returnFirstAndLastOccurenceInArr(arr2, target2Index)[0] + ", " + returnFirstAndLastOccurenceInArr(arr2, target2Index)[1] + "]");
    }
    public static int[] returnFirstAndLastOccurenceInArr(int[] arr, int target){
       int[] x = {-1, -1};
        if (arr.length == 0) return x;

        // first occurrence
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid;
        }

        if (arr[left] != target) return x;
        x[0] = left;

        // last occurrence
        right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2 + 1; 
            if (arr[mid] > target)
                right = mid - 1;
            else
                left = mid;
        }

        x[1] = right;
        return x;
    }
}
