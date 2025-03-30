import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        // print using for loop
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        // print using .toString loop
        System.out.println(Arrays.toString(arr));

        // updation
        arr[2] = 10;
        sc.close();
    }

}
