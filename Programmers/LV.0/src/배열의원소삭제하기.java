import java.util.ArrayList;
import java.util.List;

public class 배열의원소삭제하기 {
    public static void main(String[] args) {

        /*
        * 리턴할 배열의 크기를 알 수 없으므로 리스트 사용 후 배열로 전환 필요
        * int[] answer = list.toArray(new int[size]);
        * 위와 같이 사용하고자 했으나, 리턴할 배열 타입은 int - 리스트 선언은 제네릭 타입인 Integer
        * 따라서 toArray를 사용해 한 번에 전환 불가
        * for문을 사용해 리스트 원소 하나씩을 직접 answer 배열에 넣어주는 방법이 최선
         */

        int[] arr = {110, 66, 439, 785, 1};
        int[] delete_list = {377, 823, 119, 43};

        List<Integer> list = new ArrayList<>();

        for(int a : arr) {
            boolean duplicateFlag = false;
            for(int d : delete_list) {
                if(a == d) {
                    duplicateFlag = true;
                    break;
                }
            }
            if (!duplicateFlag) {
                list.add(a);
            }
        }

        int size = list.size();

        int[] answer = new int[size];
        for(int i=0 ; i<size ; i++) {
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }
    }
}
