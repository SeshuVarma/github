public class arrIntegers {
    public static void main(String args[]){
        int[] arr = {2, 3, 1, 4, 6, 2, 1};
        for(int i=0; i<arr.length; i++){
            if(i%2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
}
