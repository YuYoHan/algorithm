package Algorithms.리스트배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long[] s = new long[suNo + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i <= suNo ; i++) {
            s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(s[j] - s[i-1]);
        }
    }
}
