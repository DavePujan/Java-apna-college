import java.util.*;

public class PassAsFunctionArgs {
    public static void update(int marks[],int nonChangable) {
        for(int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int nonChangable = 5;
        int marks[] = {97, 98, 99};
        update(marks, nonChangable);
        System.out.println(Arrays.toString(marks));
        System.out.println(nonChangable);
    }
}
