import java.util.*;

public class basicOfSlidingWin {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;
        fixedSizeWindow(arr, k);
        maxSumOfKSizeWindow(arr, k);
        minSumOfKSizeWindow(arr, k);
        countOfKSizeWindowWithSumTarget(arr, k, 15);
        maxAvgOfKSizeWindow(arr, k);
        maxLenWhichHaveSumEqualsToTarget(arr, 15);
        System.out.println(
                "Minimum length of subarray with sum at least 15 is: " + minLenSubarrayWithSumAtLeastTarget(arr, 15));

        int[] binaryArr = { 1, 0, 1, 1, 0, 0, 1, 1, 1, 0 };
        System.out.println(
                "Maximum length of subarray with at most 2 zeroes is: " + maxSubarrayWithAtMostKZeroes(binaryArr, 2));

        int[] fruits = { 1, 2, 1, 2, 3, 2, 2, 1 };
        System.out.println("Maximum length of subarray with at most 2 types of fruits is: " + totalFruit(fruits));
    }

    // fixed size window sum using sliding window technique
    public static void fixedSizeWindow(int[] arr, int k) {
        int n = arr.length;
        int windowSum = 0;

        for (int i = 0; i < n; i++) {
            windowSum += arr[i];

            if (i >= k) {
                windowSum -= arr[i - k];
            }

            if (i >= k - 1) {
                System.out.println("Window ending at index " + i + " has sum: " + windowSum);
            }
        }
    }

    // max sum of any window size k using fixed size sliding window
    public static void maxSumOfKSizeWindow(int[] arr, int k) {
        int n = arr.length;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            windowSum += arr[i];

            if (i >= k) {
                windowSum -= arr[i - k];
            }

            if (i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }
        System.out.println("Maximum sum of any window of size " + k + " is: " + maxSum);
    }

    // for min sum
    public static void minSumOfKSizeWindow(int[] arr, int k) {
        int n = arr.length;
        int windowSum = 0;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            windowSum += arr[i];

            if (i >= k) {
                windowSum -= arr[i - k];
            }

            if (i >= k - 1) {
                minSum = Math.min(minSum, windowSum);
            }
        }
        System.out.println("Minimum sum of any window of size " + k + " is: " + minSum);
    }

    // for count of subarrays of size k with sum = target
    public static void countOfKSizeWindowWithSumTarget(int[] arr, int k, int target) {
        int n = arr.length;
        int windowSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            windowSum += arr[i];

            if (i >= k) {
                windowSum -= arr[i - k];
            }

            if (i >= k - 1) {
                if (windowSum == target) {
                    count++;
                }
            }
        }
        System.out.println("Count of subarrays of size " + k + " with sum " + target + " is: " + count);
    }

    // for max avg
    public static void maxAvgOfKSizeWindow(int[] arr, int k) {
        int n = arr.length;
        int windowSum = 0;
        double maxAvg = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < n; i++) {
            windowSum += arr[i];

            if (i >= k) {
                windowSum -= arr[i - k];
            }

            if (i >= k - 1) {
                maxAvg = Math.max(maxAvg, windowSum / (double) k);
            }
        }
        System.out.println("Maximum average of any window of size " + k + " is: " + maxAvg);
    }

    // now variable size window
    public static void maxLenWhichHaveSumEqualsToTarget(int[] arr, int target) {
        int left = 0, sum = 0, maxLen = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        System.out.println("Maximum length of subarray with sum " + target + " is: " + maxLen);
    }

    // min length subarray with sum >= target
    public static int minLenSubarrayWithSumAtLeastTarget(int[] arr, int target) {
        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > target) {
                sum -= arr[left];
                left++;
            }
            if (sum == target) {
                minLen = Math.min(minLen, right - left + 1);
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minLen;
        }
    }

    // find max subarray with at most K (zeroes)
    public static int maxSubarrayWithAtMostKZeroes(int[] arr, int k) {
        int left = 0, zeroCount = 0, maxLen = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    // Leetcode 904 - Fruit Into Baskets (Count Window + At Most K technique) - Do it Later
    public static int totalFruit(int[] fruits) {
        int left = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0)
                    map.remove(fruits[left]);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    // Leetcode 930 - Binary Subarrays With Sum (At Most K technique) - Do it Later
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return atMostSum(nums, goal) - atMostSum(nums, goal - 1);
    }

    public static int atMostSum(int[] nums, int k) {
        int left = 0, sum = 0, count = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }


    // Leetcode 1248 - Count Number of Nice Subarrays (At Most K trick , exactly K odd numbers) - Do it Later
    public static int numberOfSubarrays(int[] nums, int k) {
        return atMostOdd(nums, k) - atMostOdd(nums, k - 1);
    }

    public static int atMostOdd(int[] nums, int k) {
        int left = 0, count = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 == 1)
                k--;

            while (k < 0) {
                if (nums[left] % 2 == 1)
                    k++;
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }

}
