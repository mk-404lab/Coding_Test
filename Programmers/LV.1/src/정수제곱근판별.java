public class 정수제곱근판별 {
    public static void main(String[] args) {
        long n = 123;
        long answer = 0;

        if(Math.pow(Math.sqrt(n), 2) == n) {
            answer = (long)Math.pow(Math.sqrt(n)+1, 2);
        } else {
            answer = -1;
        }
        System.out.println(answer);
    }
}
