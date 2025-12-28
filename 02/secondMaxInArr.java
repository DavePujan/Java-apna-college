
public class secondMaxInArr {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3,5};
        int max = arr[0];
        int flag = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                flag= i;
            }
        }

        // handle this: 
            // if same as max (max = 5 and another 5 exists) (ex: arr = {4,5,1,2,3,5})
           
        int s_max = 0;
            for(int i=0; i< arr.length;i++){
                if( arr[i] > s_max && arr[i] < max ){
                    s_max = arr[i];
                }
                if( arr[i] == max && i != flag ){
                    s_max = max;
                }
            }

        System.out.println("Max: " + max);
        System.out.println("Second Max: " + s_max);
        System.out.println("Index of Max: " + flag);
    }
}
