public class 더크게합치기 {
    public static void main(String[] args) {

        /*
         * 숫자를 덧셈 연산이 아닌 문자열 합치기 방식으로 이어 붙여야 함
         * 문자열 ""에 숫자를 더하면 문자열 합치기가 됨
         * 대소 비교를 위해 문자열을 다시 정수로 바꿔야 함
         * Integer.parseInt(s)를 이용
        */

        int a = 9;
        int b = 91;

        int max1 = Integer.parseInt("" + a + b);
        int max2 = Integer.parseInt("" + b + a);

        int answer = max1 < max2 ? max2 : max1;

        System.out.println(answer);

    }
}
