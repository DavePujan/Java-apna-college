import java.util.*;

class StockSpan {
    public static int[] calculateSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop smaller elements
            while (!st.isEmpty() && price[i] >= price[st.peek()]) {
                st.pop();
            }

            // Calculate span
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }

            // Push current index
            st.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int[] res = calculateSpan(price);

        System.out.println(Arrays.toString(res));
    }
}