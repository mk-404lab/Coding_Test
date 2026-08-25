public class 공백으로구분하기2 {
    public static void main(String[] args) {
        String my_string = " i    love you ";

        /*
        * 기존에 사용한 해결 방식
        * split(" ")을 사용할 경우 공백 하나를 발견하면 즉시 뒤의 문자열을 구분지음
        * 그 결과 i love 사이의 4개 공백 중 첫 공백을 제거하고 뒤에 이어진 3개의 공백은 제거되지 않음
        * 또한 문자열 앞 뒤의 공백을 제거하지 못함

        String[] answer = my_string.split(" ");

        for (String s : answer) {
            System.out.println(s);
        }

        */


        /*
        * 정규 표현식에서 \s는 모든 공백 문자를 의미함(스페이스, 탭 등)
        * +는 한 개 이상 연속될 수 있음을 의미함
        * \s를 표현하기 위해 \를 하나 더 붙여 \\s+가 됨
        * 문자열 앞 뒤의 공백을 제거하기 위해 trim()을 함께 사용하여 해결
         */

        String[] answer = my_string.trim().split("\\s+");

        for (String s : answer) {
            System.out.println(s);
        }
    }
}
