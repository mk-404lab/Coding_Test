import java.util.HashMap;
import java.util.Map;

public class 가장가까운같은글자 {
    public static void main(String[] args) {
        /*
         * 문자와 인덱스를 함께 저장하기 위해 HashMap을 사용
         * map.put / map.get() / map.containsKey()를 활용
         */

        String s = "banana";
        int[] answer = new int[s.length()];

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0 ; i<s.length() ; i++) {
            if(!(map.containsKey(s.charAt(i)))) {
                answer[i] = -1;
                map.put(s.charAt(i), i);
            } else {
                answer[i] = i - map.get(s.charAt(i));
                map.put(s.charAt(i), i);
            }
        }

        for (int i : answer) {
            System.out.print(i);
        }
    }
}
