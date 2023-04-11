public class makes10 {
    public static void main(String args[]) {
        boolean answer = makes10(9, 10);
        System.out.println(answer);
    }

    public static boolean makes10(int a, int b) {
        int sum = a+b;
        if(sum == 10 || a == 10 || b == 10){
            return true;
        }
        else{
            return false;
        }
    }
}
