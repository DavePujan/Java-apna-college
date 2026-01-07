import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class diffOfTwoArr {
    
public static void main(String[] args) {
    diffOfTwoArr solution = new diffOfTwoArr();
    int[] nums1 = {1, 2, 3};
    int[] nums2 = {2, 4, 6};
    List<List<Integer>> result = solution.findDifference(nums1, nums2);
    System.out.println(result);
}

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int x : nums1) set1.add(x);
        for (int x : nums2) set2.add(x);

        List<Integer> list1 = new ArrayList<>();
        for (int x : set1) {
            if (!set2.contains(x)) {
                list1.add(x);
            }
        }

        List<Integer> list2 = new ArrayList<>();
        for (int x : set2) {
            if (!set1.contains(x)) {
                list2.add(x);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);

        return result;
    }
}
