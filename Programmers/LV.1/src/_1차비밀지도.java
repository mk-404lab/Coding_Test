public class _1차비밀지도 {
    public static void main(String[] args) {

        /*
         * Integer.toBinaryString()     정수를 이진수로 계산하는 과정 생략 가능, | 연산 사용하여 두 수의 직접 비교 불필요
         * String.format()
         * object.replaceAll()
         *
         * 위 세 개의 함수를 알고 있을 때 가장 편하게 해결 가능
         */
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            /*
             * toBinaryString()을 사용할 경우 앞에 붙은 0을 자동으로 제거해버리는 문제 발생
             * 따라서 문자열 포맷팅을 사용하여 표현할 문자의 수를 지정해줘야 됨
             * "%5s" => 5칸의 문자열을 출력하라는 뜻
             */
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }

        for (String s : answer) {
            System.out.println(s);
        }
    }
}
