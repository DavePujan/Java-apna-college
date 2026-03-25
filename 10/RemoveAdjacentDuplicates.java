import java.util.Stack;

public class RemoveAdjacentDuplicates {
    static String remAdj(String str){
        Stack<Character> st = new Stack<>();
        for(char c: str.toCharArray()){
            if(!st.isEmpty() && st.peek()==c){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c: st){
            sb.append(c);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "abbaca";
        System.out.println(remAdj(str));
    }
}
