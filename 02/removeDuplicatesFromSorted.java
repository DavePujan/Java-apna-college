public class removeDuplicatesFromSorted {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};

        int newLength = removeduplicates(arr);

        for(int i = 0; i < newLength; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeduplicates(int[] arr){
        if(arr.length == 0) return 0;

        int index = 1; // slow pointer
        for(int i = 1; i < arr.length; i++){ // fast pointer
            if(arr[i] != arr[i - 1]){
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}
