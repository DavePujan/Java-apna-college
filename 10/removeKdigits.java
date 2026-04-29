import java.util.Stack;

public class removeKdigits {
    public String removeKdigitsFromString(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(char c: num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek() > c){
                st.pop();
                k--;
            }
            st.push(c);
        }
        // edge handling - if k is still non-zero
        while(k>0){
            st.pop();
            k--;
        } 
        StringBuilder res = new StringBuilder();
        for(char c: st){
            res.append(c);
        }
        // remove leading zeros
        while(res.length() > 1 && res.charAt(0) == '0'){
            res.deleteCharAt(0);
        }
        return res.length() == 0 ? "0" : res.toString();
    }
    public static void main(String[] args) {
        removeKdigits obj = new removeKdigits();
        String num = "1432219";
        int k = 3;
        String res = obj.removeKdigitsFromString(num, k);
        System.out.println(res);
        String num2 = "10";
        int k2 = 2;
        String res2 = obj.removeKdigitsFromString(num2, k2);
        System.out.println(res2);
    }
}
