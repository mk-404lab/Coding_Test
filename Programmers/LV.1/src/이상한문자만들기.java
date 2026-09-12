public class 이상한문자만들기 {
    public static void main(String[] args) {

        /*
         * 문자열 s는 한 개 이상의 단어로 구성되어 있다.
         * 각 단어는 하나 이상의 공백 문자로 구분되어 있다.
         *
         * 기존 풀이 방식에서는 단순히 s.split(" ")을 사용했기 때문에 연속된 공백 문자를 올바르게 제거하지 못하는 문제가 발생했다.
         *
         * 아래의 풀이 방식은 하나의 문자 단위로 split을 하지 않고, 각 알파벳을 전부 끊어 공백 여부를 검사한다.
         * 따라서 공백이 연속되더라도 걸러낼 수 있음
         *
         * 만약 공백일 경우 idx를 0으로 초기화, 공백이 끝났을 경우 idx를 1부터 카운팅하기 때문에 짝수 검사 조건에서 idx-1을 사용함
         */

        String s = "try hello world";
        String answer = "";
        int idx = 0;

        String[] words = s.split("");

        for(String ss : words) {
            idx = ss.contains(" ") ? 0 : idx+1  ;

            if((idx-1) % 2 == 0) {
                answer += ss.toUpperCase();
            } else {
                answer += ss.toLowerCase();
            }
        }

        System.out.println(answer);
    }
}
