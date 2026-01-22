import java.util.*;

public class findPairWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;
        System.out.println(hasPair(arr, target));
        int target2 = 30;
        System.out.println(hasPair(arr, target2));
    }

    public static boolean hasPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            if (set.contains(target - x))
                return true;
            set.add(x);
        }
        return false;
    }
}
