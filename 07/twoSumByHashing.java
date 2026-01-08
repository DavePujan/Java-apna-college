import java.util.*;
public class twoSumByHashing {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9; 
        int[] result = twoSum(nums, target);
        System.out.println("Indices of the two numbers: " + Arrays.toString(result));

        int[] resultSet = twoSumWithHashSet(nums, target);
        System.out.println("Numbers that add up to target: " + Arrays.toString(resultSet));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static int[] twoSumWithHashSet(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        // current hashset = is empty
        for (int num : nums) {
            int need = target - num; // in our case need = 9 - num = 9 - 2 = 7
            int[] arr = new int[2];
            if (set.contains(need)) {
                arr[0] = need; // arr[0] = 7
                arr[1] = num;  // arr[1] = 2
                return arr; // return array [7,2]
            }
            set.add(num); // add 2 to hashset
        }
        return new int[0]; // return empty array if no pair found
    }
}
