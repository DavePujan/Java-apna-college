
public class thirdMax {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int max = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                
            }
        }
       
        int s_max = Integer.MIN_VALUE;
            for(int i=0; i< nums.length;i++){
                if( nums[i] > s_max && nums[i] < max ){
                    s_max = nums[i];
                   
                }
                
            }

        int t_max = Integer.MIN_VALUE;
            for(int i=0; i< nums.length; i++){
                if( nums[i] > t_max && nums[i] < s_max){
                    t_max = nums[i];
                }
                
               
            }

        if (t_max == Integer.MIN_VALUE) {
    System.out.println("Third Max: " + max);
} else {
    System.out.println("Third Max: " + t_max);
}

    }
    }

