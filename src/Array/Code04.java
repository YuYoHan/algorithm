package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {
        // 입력한 배열 길이만큼 문자열 배열 선언 및 할당, 초기화
        Scanner sc = new Scanner(System.in);

        System.out.println("배열의 크기 입력 : ");
        String[] arr = new String[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "번째 문자열 : ");
            arr[i] = sc.next();
        }

        while (true) {
            System.out.print("값을 더 입력하시겠습니까? (Y/N)  ");
            String plus = sc.next();

            if(plus.toUpperCase().equals("Y")) {
                System.out.println("추가할 개수 : ");
                String[] arr2 = new String[arr.length + sc.nextInt()];
                System.arraycopy(arr, 0, arr2, 0, arr.length);

                for (int i = arr.length; i < arr2.length; i++) {
                    System.out.print(i + 1 + "번째 문자열 : ");
                    arr2[i] = sc.next();
                }
                arr = arr2;
            } else if (plus.toUpperCase().equals("N")) {
                System.out.println(Arrays.toString(arr));
                break;
            } else {
                System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
                continue;
            }
        }
        sc.close();
    }
}
