public class 대문자로바꾸기 {
    public static void main(String[] args) {
        String myString = "aBcDeFg";
        String answer = "";

        /*
        * for문을 활용하여 기존 문자열을 순회 후 각 문자가 소문자일 경우
        * 대문자로 치환하여 새 문자열에 이어붙인다.
        * Character.toUpperCase(각 문자) 사용

        for(int i=0 ; i<myString.length() ; i++){
            if(Character.isLowerCase(myString.charAt(i))) {
                answer += Character.toUpperCase(myString.charAt(i));
            } else {
                answer += myString.charAt(i);
            }

        }

        System.out.println(answer);

         */

        /*
        * String객체.toUpperCase()를 사용하는 방법
        * 개별 문자를 순회할 필요 없이 문자열 객체 전체를 한 번에 대문자로 변환 가능
        */

        answer = myString.toUpperCase();
        System.out.println(answer);
    }
}
