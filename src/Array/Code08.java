package Array;

import java.util.Scanner;

public class Code08 {
    public static void main(String[] args) {
        /*
        *   주민등록번호 번호를 입력받아 char 배열에 저장한 후 출력하세요
        *   단, char 배열 저장시 성별을 나타내는 숫자를 *로 저장
        * */

        Scanner sc =new Scanner(System.in);
        System.out.print("주민등록번호(-포함) : ");
        String str = sc.nextLine();

        char[] arr = new char[str.length()];

        for (int i = 0; i < arr.length; i++) {
            if(i >= 8) {
                arr[i] = '*';
            } else {
                arr[i] = str.charAt(i);
            }
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
