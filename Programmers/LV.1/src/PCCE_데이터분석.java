import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PCCE_데이터분석 {
    public static void main(String[] args) {

        /*
         * 문제에서 주어지는 ext, sort_by가 동일한 선택지를 공유하는 상황 -> 하나의 배열에 정리해서 필요에 따라 인덱스를 사용할 수 있도록 함
         * 배열 -> 리스트 : Arrays.asList(배열명).indexOf("찾고 싶은 단어")
         * 리스트 -> 배열 : 리스트명.toArray(new int[0][0])
         *
         * List<int[]> list = new ArrayList<>() 와 같이 리스트가 단순 객체 타입만 저장할 수 있는 게 아닌, 배열 자체도 저장 가능
         *
         * Arrays.sort(배열명, Comparator.comparingInt(int[] a) -> a[정렬할 컬럼 인덱스])
         */

        int[][] data = {
                {1, 20300104, 100, 80},
                {2, 20300804, 847, 37},
                {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        String[] fields = {"code", "date", "maximum", "remain"};

        int idx = Arrays.asList(fields).indexOf(ext);           // indexOf()는 리스트에 사용할 수 있는 함수, 배열은 불가
        int sortIdx = Arrays.asList(fields).indexOf(sort_by);   // 리스트의 indexOf()를 사용하지 않을 경우 for문 반복을 통해 ext와 동일한 인덱스를 탐색해야 됨

        List<int[]> list = new ArrayList<>();   // 리스트에 배열을 담을 수 있을 거라고 생각하지 못했음

        for(int[] d : data) {
            if(d[idx] < val_ext) {
                list.add(d);
            }
        }

        int[][] answer = list.toArray(new int[0][0]);
        /* 리스트.toArray(new int[0][0]) -> 내가 가진 리스트를 배열로 변경할 때 int형 2차원 배열로 만들어 달라는 템플릿을 제공하는 것
         * 사이즈를 정확히 넣지 않고 [0][0]으로 넣는 것은 단지 형태만 제공하면 될 뿐, 정확한 크기는 자바가 자동으로 계산하기 때문
        */
        Arrays.sort(answer, Comparator.comparingInt((int[] a) -> a[sortIdx]));

        for (int[] ints : answer) {
            for (int i = 0; i < 4; i++) {
                System.out.print(ints[i] + ", ");
            }
            System.out.println();
        }

        /*
         * 람다식을 이용해 2차원 배열을 정렬하는 방법
         * 원형(오름차순) : Arrays.sort(정렬할 배열, Comparator.comparingInt(int[] a) -> a[정렬할 기준 컬럼 인덱스]))
         * 내림차순 : Arrays.sort(정렬할 배열, Comparator.comparingInt(int[] a) -> a[정렬할 기준 컬럼 인덱스]).reversed())
         * 동순위 존재시 추가 조건 :Arrays.sort(정렬할 배열, Comparator.comparingInt(int[] a) -> a[정렬할 기준 컬럼 인덱스]).thenComparingInt(a -> a[두 번째 정렬 기준 컬럼 인덱스]))
         */
    }
}
