public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int target = 3;
        int index = binarySearchFunction(arr, target);
        System.out.println("Index of " + target + ": " + index + " (using iterative method)");

        int recIndex = bSearchWithRecursion(arr, 0, arr.length - 1, target);
        System.out.println("Index of " + target + ": " + recIndex + " (using recursive method)");

        int[] occurenceArr = {1,2,2,2,3,4,5,5,6};
        target = 2;
        int firstOccurence = lowerBound(occurenceArr, target);
        System.out.println("First Occurence (lower bound) of " + target + ": " + firstOccurence);

        int lastOccurence = upperBound(occurenceArr, target);
        System.out.println("Last Occurence (upper bound - 1) of " + target + ": " + lastOccurence);
    }

    public static int binarySearchFunction(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // not found
    }

    public static int bSearchWithRecursion(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1; // not found
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return bSearchWithRecursion(arr, mid + 1, right, target);
        } else {
            return bSearchWithRecursion(arr, left, mid - 1, target);
        }
    }

    // learn this for leetcode problems

    // first occurence (lower bound)
    public static int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    // last occurence (upper bound - 1)
    public static int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left - 1;
    }
}
