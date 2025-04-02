import java.util.*;

public class linearSearch {
    public static int findLinearSearch(int numbers[], int key) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 5;

        int index = findLinearSearch(numbers, key);
        if(index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + index);
        }
    }
}

