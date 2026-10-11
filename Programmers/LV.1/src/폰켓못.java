import java.util.HashSet;
import java.util.Set;

public class 폰켓못 {
    public static void main(String[] args) {

        /*
         * HashSet을 사용할 경우 add 했을 때 자동으로 중복 검사 후 삽입됨
         * 기존에는 nums.length/2의 조건을 만족할 때만 삽입하도록 조건 검사를 시도했으나
         * 다 집어 넣은 후 기준을 초과할 경우와 그렇지 않은 경우에 대해 각각 answer 값을 지정해줌으로써 코드 가독성 향상
         */

        int[] nums = {3, 1, 2, 3};
        int answer = 0;

        Set<Integer> hs = new HashSet<>();

        for(int num : nums) {
            hs.add(num);
        }

        answer = hs.size() <= nums.length / 2 ? hs.size() : nums.length / 2;

        System.out.println(answer);

    }
}
