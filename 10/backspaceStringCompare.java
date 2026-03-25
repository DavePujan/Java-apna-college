import java.util.Stack;

public class backspaceStringCompare {
    static boolean backspaceString(String s, String t){
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='#'){
                if(!st1.isEmpty()) st1.pop();
            }else{
                st1.push(c);
            }
        }
        for(char c: t.toCharArray()){
            if(c=='#'){
                if(!st2.isEmpty()) st2.pop();
            }else{
                st2.push(c);
            }
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(char c: st1){
            sb1.append(c);
        }
        for(char c: st2){
            sb2.append(c);
        }
        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceString(s, t) ? "Equal" : "Not equal");
        String s2 = "a#v#c#";
        String t2 = "a#c#c#c";
        System.out.println(backspaceString(s2, t2) ? "Equal" : "Not equal");
    }
}
