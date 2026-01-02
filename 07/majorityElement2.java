import java.util.*;
public class majorityElement2 {
    public static void main(String[] args) {
        
        int nums[] = {10, 20,20, 20, 30, 30,30, 50};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }

        for(int key : map.keySet()){
            if(map.get(key) > n / 3){
                result.add(key);
            }
        }
        return result;
    }
}
