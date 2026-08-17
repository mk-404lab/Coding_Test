public class 접미사인지확인하기 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "na";
        int answer = 0;

        /*
        나의 원본 풀이

        answer = my_string.length() < is_suffix.length() ? 0 : 1 ;

        int startIndex = my_string.length() - is_suffix.length();
        int idx = 0;

        for (int i = startIndex; i < my_string.length(); i++) {
            if (my_string.charAt(i) != is_suffix.charAt(idx++)) {
                answer = 0;
            }
        }
        System.out.println(answer);

         */

        // endsWith(String suffix) 사용하여 간단하게 해결한 버전
        answer = my_string.endsWith(is_suffix) ? 1 : 0 ;

        System.out.println(answer);
    }
}
