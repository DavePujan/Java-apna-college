public class subarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;
        System.out.println(subarrayWithSum(arr, target));
    }
    public static boolean subarrayWithSum(int[] arr, int target) {
        int start = 0, currSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currSum += arr[end];

            while (currSum > target && start <= end) {
                currSum -= arr[start++];
            }

            if (currSum == target)
                return true;
        }
        return false;
    }
}
