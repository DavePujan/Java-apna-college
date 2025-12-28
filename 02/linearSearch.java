public class linearSearch {
    public static int linearSearchFunction(int[] arr, int target){
    for(int i=0; i<arr.length; i++){
        if( arr[i] == target){
            return i;
        }
    }return -1;
}
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,1};
        int target = 4;
        int index = linearSearchFunction(arr, target);
        System.out.println("Index of " + target + ": " + index);
    }
}
