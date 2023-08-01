package brute_force;

import java.util.Scanner;
import java.util.Stack;

public class sty08 {
    // 브루트 포스법으로 문자열을 검색하는 메서드
    static int bfMatch(String text, String pattern) {
        int pt = 0;     // text 커서
        int pp = 0;     // pattern 커서

        while (pt != text.length() && pp != pattern.length()) {
            if(text.charAt(pt) == pattern.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp +1;
                pp = 0;
            }
        }
        if(pp == pattern.length()) {
            return pt - pp;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원본 텍스트 : ");
        String text = sc.nextLine();

        System.out.println("검색할 패턴 : ");
        String pattern = sc.nextLine();

        int idx = bfMatch(text, pattern);

        if(idx == -1) {
            System.out.println("텍스트에 패턴이 없습니다.");
        } else {
            int len = 0;

            for (int i = 0; i < idx; i++) {
                len += text.substring(i, i + 1).getBytes().length;
            }
            len+= pattern.length();

            System.out.println((idx +1) + "번째 문자부터 일치");
            System.out.println("텍스트 : " + text);
            System.out.printf(String.format("패턴 : %%%ds\n", len), pattern);
        }
    }
}
