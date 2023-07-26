package brute_force;

import java.util.ArrayList;
import java.util.Scanner;

public class sty06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] NM = sc.nextLine().split(" ");
        int n = Integer.parseInt(NM[0]);
        int m = Integer.parseInt(NM[1]);

        String[] cardValueList = sc.nextLine().split(" ");

        ArrayList<Integer> card = new ArrayList<>();

        for (String num : cardValueList) {
            card.add(Integer.parseInt(num));
        }

        int max = 0;

        // 첫 번째 카드 순회는 n-2가지 진행
        for (int i = 0; i < n-2; i++) {
            // 두 번째 카드 순회는 첫번째 이후부터 n-1까지 순회
            for (int j = 0; j < n-1; j++) {
                // 세번째 카드는 두번째 이후부터 n까지 순회
                for (int k = 0; k < n; k++) {
                    int sum =card.get(i) + card.get(j) + card.get(k);

                    // 3장의 카드의 합이 m보다 작을 경우 max 값을 계산한다.
                    // max 와 sum 의 값을 비교하면서 점점 max 값은 m 의 값에 근접한다.
                    if(sum <= m) {
                        max = Math.max(max, sum);
                    }
                    // max 값이 m 과 같으면 가장 가까운 값이기 때문에 즉시 Loop 를 종료한다.
                    if(max == m) {
                        System.out.println(max);
                        return;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
