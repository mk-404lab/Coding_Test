public class 약수의합 {
    public static void main(String[] args) {
        int n = 12;
        int answer = 0;

        for(int i=1 ; i<=n ; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }


        /*
         * 어떤 수 n의 진약수(자기 자신을 제외한 약수) 중 가장 큰 값은 수학적으로 항상 2/n 이하가 됨
         * 따라서 해당 문제의 조건에서 n은 3000 이하일 때 위의 코드를 사용할 경우 3000번의 반복이 실행
         * 아래의 코드를 사용할 경우 1500번만 수행됨, 이후 n만 추가적으로 더해줄 경우 해당 문제를 해결할 수 있음
         *
         * 단, n=1일 때의 예외 케이스만 고려해주면 됨
         */

        /*
        for(int i=1 ; i<=n/2 ; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        answer += n;
         */

        System.out.println(answer);
    }
}
