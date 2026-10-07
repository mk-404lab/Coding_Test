public class 이웃한칸 {
    public static void main(String[] args) {

        /*
         * 해당 문제는 특별한 스킬 및 라이브러리 활용이 아닌 문제 해결을 위한 로직을 고민하는 것이 어려웠음

         * board[h][w] 타겟을 기준으로 상,하,좌,우의 좌표를 배열로써 정리해둠
         * 이후 반복문을 통해 타겟 기준 상,하,좌,우의 값이 올바른 범위인지 체크
         * 범위는 0 이상, board.length 미만이어야 함
         * 올바른 범위 내에 존재할 때 타겟과 상,하,좌,우 좌표의 색이 같은지 검사
         */

        String[][] board = {  {"blue", "red", "orange", "red"},
                            {"red", "red", "blue", "orange"},
                            {"blue", "orange", "red", "red"},
                            {"orange", "orange", "red", "blue"}};
        int h = 1;
        int w = 1;

        int n = board.length;
        int answer = 0;
        int dh[] = {-1, 1, 0, 0};   // 상, 하, 좌, 우의 좌표
        int dw[] = {0, 0, -1, 1};   // 문제 속 이미지를 보면 board[h][w] 기준 아래의 좌표가  h-1임을 주의하자

        for(int i=0 ; i<=3 ; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if((0 <= h_check && h_check < n) && (0 <= w_check && w_check < n)) {
                answer += board[h][w].equals(board[h_check][w_check]) ? 1 : 0;
            }
        }

        System.out.println(answer);
    }
}
