//  lc 697: Degree of an Array 
import java.util.HashMap;
public class degreeOfAnArray {
    public static void main(String[] args) {
        int nums[] = {1,2,2,3,1,4,2}; // expected output = 6
        System.out.println("Length of shortest subarray: " + new degreeOfAnArray().findShortestSubArray(nums));
    }

    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!map.containsKey(num)) {
                map.put(num, new int[]{1, i, i});
            } else {
                int[] val = map.get(num);
                val[0]++;
                val[2] = i;
            }
        }
        int maxFreq = 0;
        for (int[] val : map.values()) {
            maxFreq = Math.max(maxFreq, val[0]);
        }
        int minLen = Integer.MAX_VALUE;
        for (int[] val : map.values()) {
            if (val[0] == maxFreq) {
                minLen = Math.min(minLen, val[2] - val[1] + 1);
            }
        }
        return minLen;
    }
}

