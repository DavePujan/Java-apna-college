import java.util.*;
public class firstUniqueElement {
    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 2, 0, 4};
        int result = firstUnique(nums);
        System.out.println("First unique element: " + result);

    }
    public static int firstUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
