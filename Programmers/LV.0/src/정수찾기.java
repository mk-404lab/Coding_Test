import java.util.Arrays;

public class 정수찾기 {
    public static void main(String[] args) {

        /*
        * 해당 문제의 조건에서 num_list의 최대 길이가 100임에 따라 순차 탐색보다 이진 탐색이 유리하다고 판단하고 코드를 작성했음
        * 그러나 탐색을 한 번 수행하는 현 상황에서는 순차 탐색이 더 유리함
        *
        * 현재 정렬되어 있지 않은 배열 기준으로
        * 순차 탐색의 최악 경우 : 최대 100번의 비교 필요
        *
        * 정렬 후 이진 탐색의 경우 : 탐색 비용은 약 7번이나, 정렬 비용이 약 664번 발생함
        * 정렬이라는 사전 작업이 필요해 훨씬 비효율 야기
         */

        int[] num_list = {15, 98, 23, 2, 15};
        int n = 2;

        int startIdx = 0;
        int lastIdx = num_list.length-1;
        int answer = 0;

        Arrays.sort(num_list);

        while(startIdx <= lastIdx) {
            int middleIdx = (startIdx + lastIdx) / 2;

            if(num_list[middleIdx] == n) {
                answer = 1;
                break;
            } else if(num_list[middleIdx] < n) {
                startIdx = middleIdx + 1;
            } else if(num_list[middleIdx] > n) {
                lastIdx = middleIdx - 1;
            }
        }

        System.out.println(answer);

    }
}
