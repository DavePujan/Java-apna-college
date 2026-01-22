import java.util.*;
public class basicOfKadaneAlgo {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(arr));
        System.out.println(Arrays.toString(bestSubArray(arr)));
    }
    
    public static int maxSubArray(int[] arr) {
        int globalMax = arr[0];
        int localMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            localMax = Math.max(arr[i], localMax + arr[i]);
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    
    }

/*
    Array = [-2,1,-3,4,-1,2,1,-5,4]
    Best subarray = [4,-1,2,1]
*/ 

// here's code to return best array:
    public static int[] bestSubArray(int[] arr) {
        int globalMax = arr[0];
        int localMax = arr[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (localMax + arr[i] < arr[i]) {
                localMax = arr[i];
                tempStart = i;
            } else {
                localMax += arr[i];
            }

            if (localMax > globalMax) {
                globalMax = localMax;
                start = tempStart;
                end = i;
            }
        }
        int[] bestSubArray = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            bestSubArray[i - start] = arr[i];
        }
        return bestSubArray;
    }
}