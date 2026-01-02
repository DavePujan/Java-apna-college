//  return that element which comes more than n/2 times.
import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2}; // expected output = 2
        System.out.println("Majority Element is: " + majorityElementFinder(nums));

    }
    public static int majorityElementFinder(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int leader = nums.length / 2;

        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
            if(map.get(num) > leader){
                return num;
            }
        }
       return -1;
    }
}
