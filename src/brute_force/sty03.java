package brute_force;

import java.util.Arrays;
import java.util.Scanner;

public class sty03 {
    public static void main(String[] args) {
        // 변수 설정은 앞에 자료형이 붙어야함
        int a = 10;

        // int형은 21억까지가능. -2,147,483,647~ 2,147,483,647
        // 10^9 = 10억, 2^31-1 = 2,147,483,647

        // char 형(문자)
        char A = 'A';

        System.out.println(A);
        System.out.println((int)A);
        System.out.println((char)97);

        //char형은 int형, int형은 char형으로 강제 형변환 가능
        // 해당 변환은 ASKII코드에 의해 정해짐
        // A: 65, a: 97, '0': 48


        // String 형(문자열)
        String str = "string";

        char r = str.charAt(3); // 문자열의 인덱스 원소(char)

        int length = str.length(); // 문자열의 길이
        String str2 = str.substring(0, 4); // 문자열의 부분문자열(시작인덱스, 끝인덱스+1)
        str.equals("string"); // 문자열 비교. true,fasle값을 반환

        String[] strArr = str.split("r"); // 특정기점을 기준으로 분할


        // 배열
        int[] arr = new int[10]; // 10칸의 공간에 인트를 저장
        String[] sarr = new String[10]; // 10칸의 공간에 스트링을 저장

        int Arrlen = arr.length; // 배열의 길이
        int first = arr[0]; // 배열의 시작

        //배열의 끝은?
        int last = arr[arr.length-1];

        // 배열내 원소 정렬법
        // 라이브러리 필요 import java.util.Arrays;
        Arrays.sort(arr); // arr배열 정렬

        //배열 사용법

        // 1. 1~10000 범위 중 해당 숫자(344) 사용여부 체크
        int[] arr2 = new int[10001];

        arr2[344] = 1; // 사용하면 1로 등록

        if(arr2[344] == 1){
            System.out.println("사용");
        }else{
            System.out.println("사용안함");
        }

        // 2. 1~10000중 t({1000,2000,3000})조건에 맞는 k(3)개 선택한 숫자들 저장
        int[] arr3 = new int[3];
        int[] t = {1000,2000,3000};
        int idx = 0;
        for(int i = 1; i <= 10000; i++){
            for(int j = 0; j < t.length; j++){
                if(i == t[j]){
                    arr3[idx++] = i;
                }
            }
        }

        //숫자 나머지, 몫

        int num = 97653;

        // 끝자리부터 해당 숫자를 구하는법
        while(num > 0){
            int n = num%10;
            System.out.println(n);
            num /= 10;
        }
        //3 4 5 7 9 가 나옴


        // 클래스 사용법
        CLA cla1 = new CLA(10,"철수");

        System.out.println(cla1.name); // 철수가 나옴
        System.out.println(cla1.number); // 10이 나옴


        //입력값 받기
        Scanner sc = new Scanner(System.in);
        int scn = sc.nextInt(); // int 하나 받기
        String scs = sc.nextLine(); // 한줄 받기


        // 출력
        System.out.println(scn);


        //입출력
    }

    public static class CLA{
        int number;
        String name;

        public CLA(int number, String name){
            this.number = number;
            this.name = name;
        }
    }
}
