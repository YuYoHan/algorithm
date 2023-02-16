package Array;

import java.util.Scanner;

public class Code05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("입력 " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("검색할 값 : ");
        int search = sc.nextInt();

        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            if(search == arr[i]) {
                System.out.println("인덱스 : " + i);
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("일치하는 값이 존재하지 않습니다. ");
        }
    }
}
