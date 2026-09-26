import java.util.Arrays;

public class k번째수 {
    public static void main(String[] args) {

        /*
         * Arrays.copyOfRage(original, from, to) 사용할 경우 최초 배열 선언, for문 반복을 통한 값 대입
         * 과정이 한 번에 이뤄지기 때문에 훨씬 효율적으로 작성할 수 있음
         */

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},
                            {4, 4, 1},
                            {1, 7, 3}};
        int idx = 0;

        int[] answer = new int[commands.length];

        for(int[] tmp : commands) {
            int i = tmp[0];
            int j = tmp[1];
            int k = tmp[2];

            int[] buf = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(buf);

            answer[idx++] = buf[k-1];
        }

        for(int i : answer) {
            System.out.println(i);
        }
    }
}
