public class 약수의개수와덧셈 {
    public static void main(String[] args) {

        /*
         * 약수의 개수가 짝수일 때 : 더하기
         * 약수의 개수가 홀수일 때 : 빼기
         *
         * 해당 문제를 해결하기 위해 left ~ right의 수를 하나씩 반복하며 약수의 개수를 세는 방법을 선택했음
         * 그러나 불변의 법칙으로 주어진 수가 제곱수일 때 그 수의 약수는 반드시 홀수개다.
         * EX > 16 => {1, 2, 4, 8, 16} / 25 => {1, 5, 25}
         * EX > 17 => {1, 17} / 20 => {1, 2, 4, 5, 10, 20}
         *
         * 따라서 해당 문제는 제곱수인지 판단하면 간단하게 해결 가능
         */

        int left = 24;
        int right = 27;
        int answer = 0;

        for(int i=left ; i<=right ; i++) {
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            } else {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
