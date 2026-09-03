public class 콜라츠추측 {
    public static void main(String[] args) {

        /*
         * 해당 문제는 오버플로우를 고려하지 않으면 해결할 수 없음
         * 문제에서 주어지는 매개변수 num의 타입은 int
         * 매개변수로 주어진 num을 그대로 사용하여 문제를 해결할 경우, 테스트 케이스의 num = 626331일 때 i=488에서 종료됨
         * 그러나 이는 오버플로우를 고려하지 않아 발생한 버그임
         * int 타입은 약 21억까지 표현할 수 있는데. num=626331일 때 연산 과정에서 약 72억까지 오르게 됨
         * 연산 값이 음수로 왜곡된 채로 계산되다가 하필 i=488일 때 num==1의 조건이 맞아떨어진 것
         *
         * 따라서 int 타입의 num이 아닌, long 타입의 longNum을 사용하면 버그 없이 500번의 반복문 조건을 초과하여 -1을 반환함
         */

        int num = 626331;

        long longNum = num;
        int answer = 0;

        if(longNum == 1) {
            System.out.println(answer);
            return;
        }

        for(int i=1 ; i<=500 ; i++){
            if(longNum % 2 == 0) {
                longNum /= 2;
            } else {
                longNum = longNum*3 + 1;
            }

            if(longNum == 1) {
                answer = i;
                System.out.println(answer);
                return;
            }
        }
        answer = -1;
        System.out.println(answer);
        return;
    }
}
