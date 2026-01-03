import java.util.*;
public class freqCount {
  public static void main(String[] args) {
    int nums[] = { 10, 20,20, 20, 30, 30,30, 50 };
    freqCountFunction(nums);
  }  

  public static void freqCountFunction(int[] nums){
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for(int num : nums){
        map.put(num , map.getOrDefault(num , 0) + 1);
    }
    int newNums[] = new int[map.size()];
    int index = 0;
    for(int key: map.keySet()){
        newNums[index++] = key;
  }
    System.out.println("Array with unique elements: " + Arrays.toString(newNums));
  }
}
