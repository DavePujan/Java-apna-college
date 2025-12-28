
public class findMaxMinInArr {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -2, 4};
       int max = 0;
       int min = 0;
       for(int i = 0; i < arr.length; i++){
           if(arr[i] > max){
               max = arr[i];
           }
           if(arr[i] < min){
               min = arr[i];
           }
       }
         System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
