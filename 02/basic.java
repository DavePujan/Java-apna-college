
import java.util.HashMap;
import java.util.Arrays;
public class basic {

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};

        int[] newArr = new int[5];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = i + 1;
        }

        int j = arr[2]; //access

        arr[4] = 10; //update

        System.out.println(arr.length); //length

        for(int i = 0; i < arr.length; i++){ //traversal
            System.out.println(arr[i]);
        }

        for(int i : arr){ //for-each loop to traverse
            System.out.println(i);
        }

        int[] arr1D = {2, 1, 3, 4, 5};

        int[][] arr2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        //length of first row
        System.out.println("Lenght of first row "+arr2D[0].length);

        System.out.println(arr2D[1][2]); //access

        // sum of i elements in 2D array
        int sum2D = 0;
        for(int i = 0; i < arr2D.length; i++){
            for(int k = 0; k < arr2D[i].length; k++){
                sum2D += arr2D[i][k];
            }
        }
        System.out.println("Sum of 2D array: " + sum2D);

        // saving sum of each row in 1D array
        int[] result = new int[arr2D.length];
        for(int i = 0; i < arr2D.length; i++){
            int sumRow = 0;
            for(int k = 0; k < arr2D[i].length; k++){
                sumRow += arr2D[i][k];
            }
            result[i] = sumRow;
        }

        System.out.println("String of 1D array: " + Arrays.toString(arr1D));
        Arrays.sort(arr1D); //sort array
        System.out.println("Sorted 1D array: " + Arrays.toString(arr1D));
        
        // find sum / max / min
        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // shortest way to find max and min using for-each loop
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int num : arr){
            if(num > max2) max2 = num;
            if(num < min2) min2 = num;
        }
        System.out.println("Max2: " + max2);
        System.out.println("Min2: " + min2);


        // hashmap for two sum, freq count, duplicates, majority element
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num=0; num < arr1D.length; num++){
            map.put(arr1D[num], map.size() + 1);
        }
        System.out.println(map);

        // output: {5=1, 1=2, 3=3, 4=4, 2=5} (order may vary)

        int[] newArr1 = {1, 2, 2, 3, 4, 4, 4, 5};
        HashMap<Integer, Integer> newMap = new HashMap<>();
        for(int num=0; num<newArr1.length; num++){
            newMap.put(newArr1[num], newMap.getOrDefault(newArr1[num], 0) + 1);
        }
        System.out.println("Map: " + newMap);
        // put this value in new array to sort it like counting sort
        int resultArr[] = new int[newArr1.length];
        int index = 0;
        for(int i=0; i<=5; i++){
            if(newMap.containsKey(i)){
                int freq = newMap.get(i);
                for(int k=0; k<freq; k++){
                    resultArr[index++] = i;
                }
            }
        }
        
        int x[] = {10, 20, 30, 40, 50};
        // count frequency of elements
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int i = 0; i < x.length; i++){
            freqMap.put(x[i], freqMap.getOrDefault(x[i], 0) + 1);
        }
        System.out.println("Frequency Map: " + freqMap);

        // other usefull methods
        for(int i = 0; i < x.length; i++){
            System.out.println(freqMap.containsKey(x[i])); //check if key exists, returns true/false
        }
        System.out.println("Contains key 20: " + freqMap.containsKey(20));

        freqMap.remove(30); //remove key
        System.out.println("After removing key 30: " + freqMap);

        System.out.println("keys: " + freqMap.keySet() + ", values: " + freqMap.values());

        // get value for a key
        System.out.println(freqMap.get(x[0])); //get value for key 10
        System.out.println(freqMap.get(40)); //get value for key 40



        // reverse an array
        int[] arr1 = {1, 2, 3, 4, 5};
        int l = 0, r = arr1.length - 1;
        while(l < r){
            int temp = arr1[l];
            arr1[l] = arr1[r];
            arr1[r] = temp;
            l++;
            r--;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr1));



        // prefix sum array used in range sum queries (RSQ)
        int[] prefixSum = new int[arr1.length];
        prefixSum[0] = arr1[0];

        for(int i = 1; i < arr1.length; i++){
            prefixSum[i] = prefixSum[i - 1] + arr1[i];
        }

}
}