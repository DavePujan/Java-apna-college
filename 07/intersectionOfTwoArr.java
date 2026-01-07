import java.util.HashSet;

public class intersectionOfTwoArr {

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 1 };
        int[] arr2 = { 2, 2 };
        int[] result = IntersectionArray.intersection(arr1, arr2);
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public class IntersectionArray {
        static int[] intersection(int[] a, int[] b) {
            HashSet<Integer> set = new HashSet<>();
            HashSet<Integer> result = new HashSet<>();

            for (int x : a)
                set.add(x);
            for (int x : b) {
                if (set.contains(x)) {
                    result.add(x);
                }
            }

            int[] ans = new int[result.size()];
            int i = 0;
            for (int x : result)
                ans[i++] = x;

            return ans;
        }
    }

}
