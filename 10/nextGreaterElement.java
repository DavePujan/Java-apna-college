import java.util.Stack;

public class nextGreaterElement {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length-1];
        int n = nums2.length;
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && nums2[i] >= st.peek()){
                st.pop();
            }

            if(st.isEmpty()){
                ans[nums2[i]] = -1;
            }else{
                ans[nums2[i]] = st.peek();
            }

            st.push(nums2[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        nextGreaterElement obj = new nextGreaterElement();
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] res = obj.nextGreaterElement(nums1, nums2);
        for(int i : res){
            System.out.print(i + " ");
        }
    }
}
