package brute_force;

// 순열 예제
public class study01 {

    static int n = 4;
    static int[] nums = {1, 2, 3, 4};

    // 갯수, 사용된 숫자, 중간 값
    static int solve(int cnt, int used, int val) {
        // 선택한 숫자가 2개면 종료하고 지금까지의 계산 결과를 반환
        if(cnt == 2) return val;

        int ret = 0;
        for (int i = 0; i < n; i++) {
            if((used & 1 << i) != 0) continue;
            ret = Math.max(ret, solve(cnt +1, used | 1 << i, val * 10 + nums[i]));
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(solve(0,0,0));
    }
}
