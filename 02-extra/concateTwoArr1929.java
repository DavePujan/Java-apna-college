import java.util.*;
public class concateTwoArr1929 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(new concateTwoArr1929().getConcatenation(nums)));
    }
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        int i = 0 , j = 0 , x=0;

        while(j != nums.length){
            if( i < nums.length){
                arr[x++] = nums[i++];
            }else{
                arr[x++] = nums[j++];
            }
        }
        return arr;
    }
}
