public class PCCE_창고정리 {
    public static void main(String[] args) {

        /*
         * PCCE 1회 기출 문제
         * 초기 clean_storage 크기 설정부터 내가 생각한 것과 달라 다른 사고가 되지 않았음
         * 물건이 합쳐질 경우 기존의 배열 크기와 동일하면 안된다는 생각에 사로잡혀
         * 최대 크기를 고려하면 모두 다른 물건을 저장할 수 있어야 함을 생각하지 못함
         * 물론 처음부터 최대 크기를 할당하는 것은 불필요할 수 있지만, 마지막 최댓값을 찾는 반복문에서
         * clean_storage의 비어있는 전체를 탐색하는 것이 아닌, num_item만큼만 탐색하기 때문에 비교적 괜찮다.
         */

        String[] storage = {"pencil", "pencil", "pencil", "book"};
        int[] num = {2, 4, 3, 1};
        String answer = "";

        int num_item = 0;   // clean_storage에 저장된 서로 다른 물건의 개수
        String[] clean_storage = new String[storage.length];    // 서로 다른 물건을 저장할 변수, 만약 storage에 담긴 물건이 모두 다를 경우를 대비하여 크기 설정
        int[] clean_num = new int[num.length];

        for (int i = 0; i < storage.length; i++) {
            int clean_idx = -1;     // 현재 정리할 물건이 처음 나온 것인지, 이미 저장되어 있는지 확인하기 위한 변수

            for (int j = 0; j < num_item; j++) {
                if (storage[i].equals(clean_storage[j])) {
                    clean_idx = j;
                    break;
                }
            }

            if (clean_idx == -1) {
                clean_storage[num_item] = storage[i];
                clean_num[num_item] = num[i];
                num_item++;
            } else {
                clean_num[clean_idx] += num[i];
            }
        }

        int num_max = -1;
        for (int i = 0; i < num_item; i++) {
            if (clean_num[i] > num_max) {
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        System.out.println(answer);
    }
}
