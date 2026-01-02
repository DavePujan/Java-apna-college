import java.util.*;

// ArrayList <Integer> list = new ArrayList<>();
// list.add(10); // add element
// list.get(0); // get element at index 0
// list.size(); // size of arraylist
// list.set(0, 20); // set element at index 0 to 20
public class basicArrayList {
    public static void main(String[] args) {
        int nums[] = {10, 20,20, 20, 30, 30,30, 50};
        System.out.println(returnSolo(nums));
    }

    public static ArrayList<Integer> returnSolo(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        for( int key : map.keySet()){
            if(map.get(key) == 1){
                list.add(key);
            }
        }
        return list;
    }
}
