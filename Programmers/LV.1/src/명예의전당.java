import java.util.Collections;
import java.util.PriorityQueue;

public class 명예의전당 {
    public static void main(String[] args) {

        /*
         * PriorityQueue를 사용할 경우 값을 삽입함과 동시에 자동으로 오름차순 정렬됨
         *
         * 기존에는 단순 ArrayList를 사용해 명예의 전당 중 가장 작은 값을 삭제하는 방식 사용했으나,
         * 이는 1번 인덱스부터 끝까지의 요소를 전부 앞으로 한칸씩 움직여야 하기 때문에 불필요한 오버헤드 발생
         * 따라서 내부적으로 자동 정렬되는 우선순위큐 사용이 적합함
         */

        int k=3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = new int[score.length];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        /*
         * 만약 내림차순 정렬을 원할 경우 아래와 같이 사용하면 됨
         *
         * PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
         */

        for(int i=0 ; i<score.length ; i++) {
            pq.add(score[i]);

            if(pq.size() > k) {
                pq.poll();
            }

            answer[i] = pq.peek();
        }

        for (Integer i : pq) {
            System.out.println(i);
        }

    }
}
