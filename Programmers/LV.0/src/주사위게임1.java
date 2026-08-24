public class 주사위게임1 {
    public static void main(String[] args) {
        /*
        * Math.abs(int a)
        * Math.pow(double a, double b)
         */

        int a = 3;
        int b = 5;

        int answer = 0;

        if((a % 2 == 1) && (b % 2 == 1)) {
            answer = (int)Math.pow(a, 2) + (int)Math.pow(b, 2);
        } else if((a % 2 == 0) && (b % 2 == 0)) {
            answer = Math.abs(a-b);
        } else {
            answer = 2 * (a+b);
        }

        System.out.println(answer);
    }
}
