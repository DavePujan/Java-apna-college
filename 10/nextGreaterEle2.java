import java.util.Stack;

public class nextGreaterEle2 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int curr = nums[i % n];

            while (!st.isEmpty() && st.peek() <= curr) {
                st.pop();
            }

            if (i < n) {
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(curr);
        }
      return ans;
    }

    public static void main(String[] args) {
        nextGreaterEle2 obj = new nextGreaterEle2();
        int[] nums = {1, 5, 3, 6, 8};
        int[] res = obj.nextGreaterElements(nums);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
