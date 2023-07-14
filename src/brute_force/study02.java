package brute_force;

// 조합 예제
public class study02 {
    static  int n = 4;
    static int[] nums = {1,2,3,4};

    // pos : 현재 위치
    // cnt : 갯수
    // val : 중간 값
    static int solve(int pos, int cnt, int val) {
        if(cnt == 2) return val;
        if(pos == n) return -1;

        int ret = 0;
        ret = Math.max(ret, solve(pos + 1, cnt +1, val + nums[pos]));
        // 선택 안함
        // 선택을 안했기 때문에 cnt, val이 변화가 없다
        ret = Math.max(ret, solve(pos +1, cnt, val));

        return ret;
    }

    public static void main(String[] args) {
        System.out.println(solve(0,0,0));
    }
}
