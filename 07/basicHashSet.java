import java.util.*;
public class basicHashSet {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,5,6,7,7,8};
        int k = 5; // key to be searched in set
        System.out.println("Array after removing duplicates using HashSet: " + Arrays.toString(basicOfHashSet(arr)));
        System.out.println("Is key " + k + " present in set? " + (containsKey(arr, k) == 1 ? "Yes" : "No"));
    }

    public static int[] basicOfHashSet(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for(int num : set){
            result[index++] = num;
        }
        return result;
    }

    public static int containsKey(int[] arr, int k){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        if(set.contains(k)){ // .contains gives true if key is present
            return 1;
        } else { // or false if not found in set
            return 0;
        }
    }
}