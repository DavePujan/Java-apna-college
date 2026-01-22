/*
- Learn basic of two pointer
	• Opposite Direction (Left–Right)
	•  Fast–Slow (Floyd’s Algorithm)
	•  Merge Two Sorted Structures

*/

import java.util.*;
public class basicOfTwoPointer {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        int target = 30;
        oppositeDirPointer(arr, target);
        System.out.println("Indices of numbers that sum to " + target + " are: " +
        Arrays.toString(twoSum(arr, target)));
        System.out.println("The number of unique elements in the array is: " +removeDuplicates(arr));

        // fast slow pointer
        System.out.println("After Removing the element: " + removeDuplicatesBySlowFast(arr, 17));  
    }

    // Opposite Direction Two Pointer Approach

    // to find pairs in a sorted array which sum is equal to target
    public static void oppositeDirPointer(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }

    // pair sum (two sum 2)
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[] { left + 1, right + 1 }; // returning 1-based indices
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 }; // return -1 if no pair found
    }

    //  Remove / Skip Duplicates
    //  used in 3Sum , Unique Pairs , Dedup Problems
    public static int removeDuplicates(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r && arr[l] == arr[l + 1]) l++;
        while (l < r && arr[r] == arr[r - 1]) r--;

        return r - l + 1;
    }

    public static int maxArea(int[] height) {
    int l = 0, r = height.length - 1;
    int max = 0;

    while (l < r) {
        int area = Math.min(height[l], height[r]) * (r - l);
        max = Math.max(max, area);

        if (height[l] < height[r]) l++;
        else r--;
    }
    return max;
    }

// Fast–Slow Pointer

    // Category A: Remove / Filter Elements
    public static int removeDuplicatesBySlowFast(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
            nums[slow] = nums[fast];
            slow++;
            }
        }
    return slow;
    }
    
}
