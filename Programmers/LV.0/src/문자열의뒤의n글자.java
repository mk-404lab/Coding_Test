public class 문자열의뒤의n글자 {
    public static void main(String[] args) {

        // string.substring(beginIndex) => 해당 인덱스부터 끝까지의 문자열 반환
        // string.substring(beginIndex, endIndex) => beginIndex부터 endIndex 까지의 문자열 반환

        String my_string = "ProgrammerS123";
        String answer = "";
        int n = 11;

        answer = my_string.substring(my_string.length() - n);

        System.out.println(answer);

    }
}
