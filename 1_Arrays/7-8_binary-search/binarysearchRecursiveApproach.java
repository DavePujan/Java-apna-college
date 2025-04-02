
public class binarysearchRecursiveApproach {
    public static int binarySearch(int numbers[], int key, int start, int end){
        int mid= (start+end)/2;
        if(numbers[mid] == key){
            return mid;
        }
        if(numbers[mid] < key){
            return binarySearch(numbers, key, mid+1, end);
        }else{
            return binarySearch(numbers, key, start, mid-1);
        }
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 5;
        System.out.println("Found at index: " + binarySearch(numbers, key, 0, numbers.length-1));
    }
}
