package Array;

import java.util.Scanner;

public class Code09 {
    public static void main(String[] args) {
        /*
        *   3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
            중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
            단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
            다시 정수를 받도록 하세요.
        * */
        Scanner sc = new Scanner(System.in);

        int input;
        int[] arr;
        int num = 1;

        while (true) {
            System.out.print("정수 : ");
            input = sc.nextInt();

            if(input <3 || input %2 ==0) {
                System.out.println("다시 입력하세요");
            } else  {
                arr = new int[input];

                for (int i = 0; i < arr.length; i++) {
                    if(i < arr.length /2) {
                        arr[i] = num++;
                    } else {
                        arr[i] = num--;
                    }
                    if (i < arr.length -1) {
                        System.out.print(arr[i] + ", ");
                    } else {
                        System.out.println(arr[i]);
                    }
                    break;
                }
            }
        }
    }
}
