import java.util.*;

public class removeElement {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 2, 3 }; // val = 3 , expected output = 2
        int val = 3;
        System.out.println("Length after removing element: " + removeElementFromArray(nums, val));

        // two pointer approach
        int nums2[] = { 3, 2, 2, 3 }; // val = 3 , expected output = 2
        val = 3;
       System.out.println("Length after removing element (Two Pointer): " + removeElementTwoPointer(nums2, val));
    }
    
    public static int removeElementFromArray(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int key : nums) {
            if (key != val) {
                list.add(key);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }

    // or two pointer approach
    public static int removeElementTwoPointer(int[] nums, int val) {
        int i = 0, j = nums.length-1;
        while(i<=j){
            if(nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            } else {
                i++;
            }
        }
        return i;
    }
}