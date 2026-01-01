public class countOccurenceinArr {
    public static void main(String[] args) {
        int arr[] = {5 ,7,7,8,8,10};
        int target = 8;  // expected output = 2

        countOccurence(arr, target);
        System.out.println("Count of " + target + " in array: " + countOccurence(arr, target));
    }

    public static int countOccurence(int[] arr, int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
}
