public class posNeg {


    public static void main(String args[]) {
        boolean answer1 = posNegative(1, -1, false);
        System.out.println(answer1);
        posNegative(-1, 1, false);
        boolean answer2 = posNegative(-1, 1, false);
        System.out.println(answer2);
        posNegative(-4, -5, true);
        boolean answer3 = posNegative(-4, -5, true);
        System.out.println(answer3);
    }

    public static boolean posNegative(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
}