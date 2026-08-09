import java.util.Arrays;

public class n번째원소까지 {
    public static void main(String[] args) {

        // copyOfRange(original, 시작 인덱스, 끝 인덱스) 사용법

        int[] num_list = { 2, 1, 7, 5};
        int n = 2;

        int[] answer = {};

        answer = Arrays.copyOfRange(num_list, 0, n);

        for (int i : answer) {
            System.out.println(i);
        }
    }
}
