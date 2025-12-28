public class CountNumberEvenOdd {
    public static void main(String[] args) {
        int[] arr = {12,2,124,22,1234,44444};
        int evenCount = 0;
        int oddCount = 0;

        for(int i=0; i<arr.length; i++){
            if(String.valueOf(arr[i]).length() % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
