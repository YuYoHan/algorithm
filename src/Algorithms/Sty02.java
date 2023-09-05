package Algorithms;

public class Sty02 {
    // 단어 s의 가운데 글자를 반환하는 함수,
    // solution 을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
    public String solution(String s) {
        String ans = "";
        // String값으로 받아온 문자열 s를 split 메서드를 사용하여 String 배열에 한 문자씩 담아준다.
        String[] arr = s.split("");

        // 문자열 s의 길이가 2로 나누어 떨어질 때 (즉, 문자 갯수가 짝수 개일때) 가운데 두 글자를 반환해야 하므로
        if(s.length()%2 ==0) {
            // answer 에 s.length 가 4라면 arr 에서 그것을 2로 나눈것의 -1 번째 값을 반환한다.
            // 즉, arr[1]인 w를 반환하고 s.length/2 번째 값인 arr[2]의 값을 더해준다.
            // 그러면 answer은 “we”가 나오게 된다.
            ans = arr[(s.length()/2)-1]+arr[s.length()/2];
        } else {
            // 반면 문자의 갯수가 홀수개라면 가운데 한 글자만을 반환하면 되므로 s.length/2 번째 값을 반환하면 된다.
            ans = arr[s.length()/2];
        }
        return ans;
    }
}
