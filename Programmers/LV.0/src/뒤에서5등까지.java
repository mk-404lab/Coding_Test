import java.util.Arrays;

public class 뒤에서5등까지 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        int[] answer = new int[5];

        Arrays.sort(num_list);

        /*
        * 내가 사용한 방식
        * 반복문을 사용해 처음부터 5개의 원소 옮기기

        for(int i=0 ; i<5 ; i++) {
            answer[i] = num_list[i];
            System.out.println(answer[i]);
        }

         */

        /*
        * 배열 복사 함수 Arrays.copyOfRange(original arr, from, to)를 사용하면 더 간단하게 해결 가능
         */

        answer = Arrays.copyOfRange(num_list, 0, 5);


    }
}
