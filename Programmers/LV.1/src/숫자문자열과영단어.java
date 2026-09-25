public class 숫자문자열과영단어 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        int answer = 0;

        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0 ; i<strArr.length ; i++) {
            s = s.replaceAll(strArr[i], String.valueOf(i));
        }

        answer = Integer.parseInt(s);
        System.out.println(answer);

    }
}
