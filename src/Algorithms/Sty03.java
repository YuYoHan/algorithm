package Algorithms;

public class Sty03 {
    // 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
    // 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

    public int result(int n) {
        int ans = 0;

        // while문을 사용하여 조건은 n이 0보다 클 때로 하여
        // n이 0이 되면 while문을 끝내도록 설정하였고,
        // while문 내에는 n을 10으로 나눈 나머지를 answer에 계속 더하게 하였다.
        while (n > 0) {
            // 만약 n이 123이라면 while문의 처음에는 answer에 123을 10으로 나눈
            // 나머지인 3이 더해지게 된다. 그 후에는 n을 10으로 나눈 몫을 n으로 재설정하면 n은 12가 된다.
            // while문 두 번째에는 12를 10으로 나눈 나머지인 2가
            // answer에 더해져 5가 되고 n은 12를 10으로 나눈 몫인 1이 된다.
            // while문 마지막에는 1을 10으로 나눈 나머지인 1이
            // answer에 더해져 6이 되고 n은 1을 10으로 나눈 몫인 0이 된다.
            ans += n % 10;
            n = n / 10;
        }
        // n이 0이 되어 while문은 종료되고 answer은 6을 반환한다.
        return ans;
    }
}
