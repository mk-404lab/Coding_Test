import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {

        /*
        * str = "" + n 으로 표현할 수도 있지만, String.valueOf(n).split("")을 활용해 각 문자로 분해하고 바로 배열에 저장할 수 있음
        * 정렬을 위해 배열을 도입했으나, 객체나 래퍼 타입이 아닌 일반 원시 타입의 경우 내림차순 정렬이 간단하지 않음
        * 따라서 String 타입으로 정수 n을 받아 Arrays.sort(str, Collections.reverseOrder())를 사용해 간단히 내림차순 정렬 수행
        *
        * StringBuilder 객체에 내림차순 정렬된 문자열을 이어붙이고
        * Long.parseLong()을 사용해 반환 타입을 맞춰줌
         */
        long n = 118372;
        long answer = 0;

        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for(String s : str) {
            sb.append(s);
        }
        answer = Long.parseLong(sb.toString());

        System.out.println(answer);

        /*

         * 위의 코드와 같이 split을 사용하지 않을 경우 n을 문자열로 만든 후
         * 배열을 선언하고, 반복문을 통해 문자열을 하나씩 분해하는 과정이 요구됨

        String str = "" + n;
        long[] tmp = new long[str.length()];

         */
    }
}
