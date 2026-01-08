import java.util.HashSet;
public class unionOfArr {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 1 };
        int[] arr2 = { 2, 3, 4 };
        int[] result = union(arr1, arr2);
        System.out.print("Union: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);

        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
}
