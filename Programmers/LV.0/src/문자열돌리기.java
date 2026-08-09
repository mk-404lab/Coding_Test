import java.util.*;

public class 문자열돌리기 {
    public static void main(String[] args) {

        // 향상된 for문을 사용하고자 toCharArray()로 문자열 각 원소를 char 타입으로 떼어낸다.

        String a = "abcde";

        for(char c : a.toCharArray()){
            System.out.println(c);
        }
    }
}
