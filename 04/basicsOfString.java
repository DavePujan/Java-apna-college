import java.util.*;
class basicsOfString {
    public static void main(String[] args) {
       String s = "leetcode";

    // StringBuilder: because of immutability java use it to modify string



    int n = s.length();
    System.out.println(n);

    char ch = s.charAt(0);
    System.out.println(ch);

    char[] arr = s.toCharArray(); // used in reverse string, palindrome check, frequency count
    System.out.println(arr); 

    arr[0] = 'x';
    System.out.println(arr);

    
    String s1 = "abc";
    String s2 = "abc";
    System.out.println(s1.equals(s2)); // returns true if both string are equal
    System.out.println(s1.equalsIgnoreCase(s2)); // used to compare string ignoring case
    

    String ppp = "H e l : l ,  o";
    ppp = ppp.replaceAll("[^a-zA-Z0-9]", "");
    System.out.println(ppp);

    ppp = ppp.toLowerCase();
    System.out.println(ppp);

    ppp = ppp.toUpperCase();
    System.out.println(ppp);


    // palindrome check
    String xxx = "A man, a plan, a canal: Panama";
    xxx = xxx.replaceAll("[^a-zA-Z0-9]", "");
    System.out.println(xxx);
    xxx = xxx.toLowerCase();
    System.out.println(xxx);
    String rev = "";
    for (int i = xxx.length() - 1; i >= 0; i--) {
        rev += xxx.charAt(i);
    }
    System.out.println(rev);
    System.out.println("true if palindrome : " + xxx.equals(rev));





    // used in remove prefix/ suffix , sliding window problems
    s.substring(0, 3); // [0,3) - 3 is not included
    System.out.println("from 0 to 3 : "+s.substring(0, 3));

    s.substring(3); // from index 3 to end
    System.out.println("from 3 to end : "+s.substring(3));





    // how to access things from array of string
    String[] strs = {"flower","flow","flight"};
    System.out.println(strs[0].charAt(0));
    System.out.println(strs[1].charAt(0));
    System.out.println(strs[2].charAt(0));





    s.contains("code"); // returns true if "code" is present in "s"
    System.out.println(s.contains("code"));




    // used in first unique character and find pattern
    s.indexOf("e"); // returns index of first occurrence of "e"
    System.out.println(s.indexOf("e"));

    s.indexOf("code"); // returns index of first occurrence of "code"
    System.out.println(s.indexOf("code"));

    s.indexOf("code", 2); // returns index of first occurrence of "code" after index 2
    System.out.println(s.indexOf("code", 2));

    s.lastIndexOf("e"); // returns index of last occurrence of "e"
    System.out.println(s.lastIndexOf("e"));

    s.lastIndexOf("code"); // returns index of last occurrence of "code"
    System.out.println(s.lastIndexOf("code"));

    s.lastIndexOf("code", 2); // returns index of last occurrence of "code" after index 2
    System.out.println(s.lastIndexOf("code", 2));





    // used in prefix problems and file extension checks 
    s.startsWith("code"); // returns true if "code" is present in "s"
    System.out.println(s.startsWith("code"));

    s.endsWith("code"); // returns true if "code" is present in "s"
    System.out.println(s.endsWith("code"));




    s.trim(); // used to remove leading and trailing spaces
    System.out.println(s.trim());



    String s3 = s.replace("code", "java"); // used to replace strings
    System.out.println(s3);

    // used in count words, reverse words, string parsing
    String[] words = s.split(" "); // used to split strings
    System.out.println(Arrays.toString(words));




    // StringBuilder - MIMP
    StringBuilder sb = new StringBuilder();

    sb.append("a");
    System.out.println(sb);
    sb.append("leet");
    System.out.println(sb);
    sb.deleteCharAt(0);
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    sb.setCharAt(0, 'z');
    System.out.println(sb);

    String result = sb.toString();
    System.out.println("result = " + result);



    String s4 = "Hello";
    System.out.println(Character.isLetter(s4.charAt(0)));
    System.out.println(Character.isDigit(s4.charAt(0)));
    System.out.println(Character.isLowerCase(s4.charAt(0)));




    // ASCII Tricks
    int index = ch - 'a'; // 0-25 : a-z
    System.out.println(index);

    index = ch - 'A'; // 0-25 : A-Z
    System.out.println(index);

    index = ch - '0'; // 0-9 : 0-9
    System.out.println(index);

    int[] freq = new int[26];
    freq[ch - 'a']++;
    
    System.out.println(Arrays.toString(freq));





    // Type Conversion
    int x = Integer.parseInt("123"); // String -> int
    System.out.println(x); // here x is int

    String y = String.valueOf(123); // int -> String
    System.out.println(y); // here y is string

    }
}