package Array;

import java.util.Scanner;

public class Code06 {
    public static void main(String[] args) {
        // 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇개 들어가 있는지
        // 개수와 몇번째 인덱스에 위치하는지 인덱스를 출력

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("문자 : ");
        char ch = sc.next().charAt(0);


        char[] arr = new char[str.length()];
        String index = "";
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
            if(ch == arr[i]) {
                index += i + " ";
                count++;
            }
        }
        System.out.println(str + "에" + ch +"가 존재하는 위치(인덱스) : " + index);
        System.out.println(ch + "개수 : " + count);

        sc.close();
    }
}
