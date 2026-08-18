public class 이어붙인수 {
    public static void main(String[] args) {
        int[] num_list = {5, 7, 8, 3};
        int answer = 0;     //result = 393 (351 + 42)

        /*
        * 내 풀이 방식
        * 정수를 문자열 변수에 이어붙이기
        * 마지막에 문자열 변수값을 정수로 변환하여 덧셈


        String oddNum = "";
        String evenNum = "";

        for (int i : num_list) {
            if (i % 2 == 0) {
                evenNum += i;
            } else {
                oddNum += i;
            }
        }

        answer = Integer.parseInt(evenNum) + Integer.parseInt(oddNum);

        System.out.println(answer);

         */

        /*
        * 기존 변수에 10씩 곱한 후 각 원소를 더해버리는 방식
         */
        int evenNum = 0;
        int oddNum = 0;

        for (int i : num_list) {
            if(i % 2 == 0) {
                evenNum *= 10;
                evenNum += i;
            } else {
                oddNum *= 10;
                oddNum += i;
            }
        }

        answer = evenNum + oddNum;
        System.out.println(answer);
    }
}
