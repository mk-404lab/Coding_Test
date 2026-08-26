public class _0떼기 {
    public static void main(String[] args) {

        /*
        * 문자열로 표현된 정수를 정수 타입으로 변형하면 앞에 존재하는 0은 자동으로 생략됨을 이용
        * String.valueOf()를 사용해도 되고, "" + Integer.parseInt()를 사용해도 됨
         */

        String n_str = "0010";
        System.out.println(String.valueOf(Integer.parseInt(n_str)));


        /*
        * 새로운 방식으로 replaceAll을 활용하여 정규식을 사용
        * ^ : 문자열의 시작
        * + : 연속됨을 의미
         */
//        System.out.println(n_str.replaceAll("^0+", ""));
    }
}
