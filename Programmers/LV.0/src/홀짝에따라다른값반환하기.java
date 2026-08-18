public class 홀짝에따라다른값반환하기 {
    public static void main(String[] args) {
        int n = 7;
        int answer = 0;

        /*
        * 나의 풀이 방식

        String flag = "";

        flag = n % 2 == 0 ? "even" : "odd" ;

        if(flag.equals("even")) {   //짝수
            for(int i=2 ; i<=n ; i+=2) {
                answer += i*i;
            }
        } else {    // 홀수
            for(int i=1 ; i<=n ; i+=2) {
                answer += i;
            }
        }

        System.out.println(answer);

         */

        /*
        * 수학 공식을 활용한 풀이 방식
        *
        * 1. n이 홀수일 때 : 합 공식
        * 개념: 첫 번째 홀수부터 k번째 홀수까지 더한 합은 항상 k제곱이다.
        * n까지의 홀수 개수: k = (n+1)/2
        * ex > n = 7일 때, 홀수는 1, 3, 5, 7 => 4개
        * 합 공식 : k제곱 = ((n+1)/2)제곱 => (n+1)제곱/4
         */

        /*
        * 2. n이 짝수일 때 : 짝수 제곱의 합 공식
        * (m*(m+1)*(2m+1))/6    (m = n/2)
        * 최종 공식 : 4 * ((m*(m+1)*(2m+1))/6)
         */

        if(n % 2 == 1) {    // 홀수인 경우
            answer = (n+1) * (n+1) / 4;
        } else {
            answer = 4 * n/2 * (n/2 + 1) * (2 * n/2 + 1) / 6 ;
        }

        System.out.println(answer);
    }
}
