public class 부분문자열 {
    public static void main(String[] args) {

        // 부분 문자열 포함 관계를 확인하기 위해 contains(CharSequence s)를 사용
        // 전체 문자열.contains(확인할 부분 문자열)로 사용

        String str1 = "abc";
        String str2 = "aababcc";
        int answer = 0;

        answer = str2.contains(str1) ? 1 : 0 ;

        System.out.println(answer);

    }
}
