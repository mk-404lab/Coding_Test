public class 문자열정수의합 {
    public static void main(String[] args) {
        String num_str = "123456789";
        int answer = 0;

        /*
        * 기존에 사용했던 코드 -> 실패 테스트 케이스 존재
        *
        * Integer.parseInt()를 사용 중인데, int 타입은 최대 10자리까지 표현 가능
        * 문제 조건에서는 num_str이 100자 이하이기 때문에 int 타입을 초과하는 숫자가 들어올 경우
        * 런타임 에러 발생

        int num = Integer.parseInt(num_str);

        while(num != 0) {
            answer += num % 10;
            num /= 10;
        }
        return answer;
         */

        // ------------------------------------------------------------------------------

        /*
        * String.charAt(idx)를 사용해 꺼낸 값은 문자 타입으로 표현된 정수.
        * 따라서 '0'을 빼주면 정수 타입이 됨
        * 단일 문자로 표현된 정수를 본래의 정수 타입으로 바꾸는 방법 중 한 가지
         */

        for(int i=0 ; i<num_str.length() ; i++) {
            answer += num_str.charAt(i) - '0';
        }

        System.out.println(answer);


    }
}
