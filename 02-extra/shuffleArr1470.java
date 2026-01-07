import java.util.*;
public class shuffleArr1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = nums.length / 2;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int i = 0 , j =n;
        int[] arr = new int[nums.length];
        for(int k = 0; k < nums.length; k++){
            if(k % 2 == 0){
                arr[k] = nums[i++];
            }else{
                arr[k] = nums[j++];
            }
        }
        return arr;
    }
}
