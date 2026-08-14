
public class n개간격의원소들 {
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 2;
        int idx = 0;

        int N = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;

        int[] answer = new int[N];

        for(int i=0 ; i<num_list.length ; i += n) {
            answer[idx] = num_list[i];
            System.out.println(answer[idx++]);
        }

    }
}
