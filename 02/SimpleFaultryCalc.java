public class SimpleFaultryCalc {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        int count = 0;
        for(int i=0; i < operations.length; i++){
            if(String.valueOf(operations[i]) == "X++" || String.valueOf(operations[i]) == "++X"){
                count++;
            }else{
                count--;
            }
        }
       System.out.println(count);
    }
}
