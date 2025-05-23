
public class reverseAnArray {
    public static void reverseArray(int numbers[]){
        int first = 0, last = numbers.length-1;
        while(first < last){
            swap(numbers, first, last);
            first++;
            last--;
        }
    }
    public static void swap(int numbers[], int first, int last){
        int temp = numbers[first];
        numbers[first] = numbers[last];
        numbers[last] = temp;
    }
    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        reverseArray(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
