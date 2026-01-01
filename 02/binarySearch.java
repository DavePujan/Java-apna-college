public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int target = 3;
        int index = binarySearchFunction(arr, target);
        System.out.println("Index of " + target + ": " + index + " (using iterative method)");

        int recIndex = bSearchWithRecursion(arr, 0, arr.length - 1, target);
        System.out.println("Index of " + target + ": " + recIndex + " (using recursive method)");

        // check true position (search insert position)
        int[] nums = {1, 3, 5, 6};

        target = 5;
        int truePos = checkTruePosition(nums, target);
        System.out.println("True Position of " + target + ": " + truePos);

        target = 2;
        truePos = checkTruePosition(nums, target);
        System.out.println("True Position of " + target + ": " + truePos);

        int[] occurenceArr = { 1, 2, 2, 2, 3, 4, 5, 5, 6 };
        target = 2;
        int firstOccurence = lowerBound(occurenceArr, target);
        System.out.println("First Occurence (lower bound) of " + target + ": " + firstOccurence);

        int lastOccurence = upperBound(occurenceArr, target);
        System.out.println("Last Occurence (upper bound - 1) of " + target + ": " + lastOccurence);

        // Binary Search on Answer example (not functional, just a template)
        int low = 1, high = 100;
        int answer = binarySearchOnAnswer(low, high);
        System.out.println("Binary Search on Answer result: " + answer);

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

    /*
     * Example 1:
     * 
     * Input: nums = [1,3,5,6], target = 5
     * Output: 2
     * Example 2:
     * 
     * Input: nums = [1,3,5,6], target = 2
     * Output: 1
     */
    public static int checkTruePosition(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        boolean left = false, right = false;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
                right = true;
            } else {
                high = mid - 1;
                left = true;
            }
        }
        if (left)
            return high + 1;
        if (right)
            return low;
        return -1;

    }

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

    // Binary Search on Answer (🔥 Most LeetCode Problems)
    // Used when:
    // Array not sorted
    // Answer is a number
    // Condition is monotonic (true → false or false → true)
    public static int binarySearchOnAnswer(int low, int high) {
        while (low < high) {
            int mid = low + (high - low) / 2;

            // check condition
            boolean condition = false; // replace with actual condition

            if (condition) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low; // or high, both are same here
    }
}

/*
 * 🧩 Practice Order (Best Learning Path)
 * 
 * Binary Search
 * First Bad Version
 * Search Insert Position
 * Find First & Last Position
 * Koko Eating Bananas
 * Capacity To Ship Packages
 * Split Array Largest Sum
 */