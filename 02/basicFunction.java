
public class basicFunction {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        // function to find sum of elements in array
        int sum = arraySum(arr);
        System.out.println("Sum of array elements: " + sum);

        // linear search using function
        int target = 3;
        int index = linearSearch(arr, target);
        System.out.println("Index of " + target + ": " + index);

        // binary search using function (array must be sorted)
        int[] sortedArr = {1, 2, 3, 4, 5};
        int bIndex = new basicFunction().binarySearch(sortedArr, target);
        System.out.println("Index of " + target + " in sorted array: " + bIndex);

        
    }

    // learn what to write in function signature, public/private, static/non-static, return type, parameters
    // public: when function is accessible from other classes like psvm is public
    // static: when function is only related to class and not to object of class
    // return type: what type of value function will return, void if nothing is returned
    // parameter vs argument: parameter is variable in function signature, argument is actual value passed
    public static int arraySum(int[] inputArr){
        int sum = 0;
        for(int i = 0; i < inputArr.length; i++){
            sum += inputArr[i];
        }
        return sum;
    }

    // if we dont use public or private, default is package-private.means accessible within same package only.
    static int linearSearch(int[] inputArr, int target){
        for(int i = 0; i < inputArr.length; i++){
            if(inputArr[i] == target){
                return i;
            }
        }
        return -1; // not found
    }

    // if we dont use static, it is non-static method and needs object of class to be called
    public int binarySearch(int[] inputArr, int target){
        int left = 0;
        int right = inputArr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(inputArr[mid] == target){
                return mid;
            }
            else if(inputArr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1; // not found
    }
}
