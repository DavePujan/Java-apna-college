/*
    Frequency Pattern (MOST COMMON)
    Template (Memorize This)
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
*/

import java.util.HashMap;

public class basicHashing {
    public static void main(String[] args) {

        // create and print 
        int nums[] = {100, 100, 200, 400, 400, 400};
        HashMap<Integer, Integer> sampleMap = new HashMap<>();
        for(int num : nums){
            sampleMap.put(num , sampleMap.getOrDefault(num , 0) + 1);
        }
        System.out.println("Sample Map: " + sampleMap);
        System.out.println("Keys: " + sampleMap.keySet() + ", Values: " + sampleMap.values());

        // .put and .containsKey example
        int arr2[] = {1,2,3,4,5,6,7,8};
        System.out.println("Value for key 9: " + putKeyIfNotContainsKey(arr2, 9));

        //  .get example
        int arr3[] = {11,22,33,44,55};
        System.out.println("Value for key 33: " + getExample(arr3, 33));

        int arr4[] = {1,2,2,3,4,4,4,5};
        System.out.println("Frequency count using getOrDefault:" + getOrDefaultExample(arr4));

        int arr5[] = {10,20,20,30,40,40,40,50};
        System.out.println("Print Map:");
        printMap(arr5);

    }

    // this one function is just for information / practice
    // note that function has return type HashMap<Integer, Integer>
    public static HashMap<Integer, Integer> createHashfunction(int arr1[]){
        // here's simplest way to create a hash map
         
        HashMap<Integer, Integer> map = new HashMap<>(); //create
        for(int i = 0; i < arr1.length; i++){
            if(map.containsKey(arr1[i])){ // check if key exists
                map.put(arr1[i], map.get(arr1[i]) + 1); // update value if key exists
            }else{
                map.put(arr1[i], 1); //add value if key does not exist (initialize to 1)
            }
        } 
        return map;
    }

    public static int putKeyIfNotContainsKey(int arr2[], int key){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr2.length; i++){
            map.put(arr2[i], 1); // initialize all keys with value 1
        }

        if(!map.containsKey(key)){ // check if key does not exist
            map.put(key, 1); // add key with value 1
            return -1; // indicate that key was added
            
        }else{
            return map.get(key); // return value if key exists
        }
    }

    public static int getExample(int arr3[], int key){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr3.length; i++){
            map.put(arr3[i], arr3[i] * 2); // initialize keys with value as double the key
        }

        int value = map.get(key); // access value -> check for key, ex: in [11,22,33,44,55], put(num , num*2) -> key=33, value=66
        if(value != 0){
            return value;
        }else{
            return -1; // indicate that key does not exist
        }
    }

    public static HashMap<Integer, Integer> getOrDefaultExample(int arr4[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr4.length; i++){
            // use getOrDefault to simplify frequency counting
            map.put(arr4[i], map.getOrDefault(arr4[i], 0) + 1);
        }
        return map;
    }

    public static void printMap(int arr5[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr5.length; i++){
            map.put(arr5[i], map.getOrDefault(arr5[i], 0) + 1);
        }
        for(int key : map.keySet()){
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // or
        System.out.println(map.keySet() + " " + map.values());
        // or perticular value from key
        System.out.println("Value for key 30: " + map.get(30));
    }
}



// HashMap<Integer, Integer> map = new HashMap<>(); //create
// map.put(5,1); // add value
// map.put(5,2); // update value
// map.get(5); // access value , returns 2, if not exits returns null (Get Value)

/* containsKey , used in two sum, first occurence, freq update (Check Existence)

if(map.containsKey(5)) {
    map.get(5); // returns 2
    map.put(5, map.get(5) + 1); // update value if key exists
} else {
    map.put(5,1); // add value if key does not exist
*/

/*  .put(num, map/getOrDefault(num, 0) + 1); 
If key exists → return its value
Else → return default value (0)

example: for arr[] = {1,2,2,3,4,4,4,5}; --> o/p: {1=1, 2=2, 3=1, 4=3, 5=1}
*/

//  map.keySet() --> returns all keys
//  example: for arr[] = {1,2,2,3,4,4,4,5}; --> o/p: [1, 2, 3, 4, 5]
// so if we print key, we get [1, 2, 3, 4, 5] , but if we print value, we get [1, 2, 1, 3, 1]
//  map.values() --> returns all values

/* loop through keys and values
for(int key : map.keySet()){
    System.out.println("Key: " + key + ", Value: " + map.get(key));
}
 or
for(int i = 0; i < arr.length; i++){
    System.out.println("Key: " + arr[i] + ", Value: " + map.get(arr[i]));
}
*/

//  .entrySet() --> returns key-value pairs - Cleaner and faster than keySet() in interviews.
/*
    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
*/
