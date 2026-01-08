
public class pivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndexFinder(nums));

    }
    public static int pivotIndexFinder(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n+1];
        prefix[0] = 0;

        for(int i = 0 ; i < n;i++){
            prefix[i+1] = prefix[i] + nums[i];
        }

        for(int i = 0 ; i<n ; i++){
            int leftSum = prefix[i];
            int rightSum = prefix[n] - prefix[i+1];

            if(leftSum == rightSum) return i;
        }
            return -1;
    }
}
