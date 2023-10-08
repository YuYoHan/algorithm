package Algorithms;

import java.util.Vector;

public class Sty04 {
    // 중복 제거

    public int[] result(int[] arr) {
        int[] ans = {};
        Vector v = new Vector<Integer>();
        v.add(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[i +1]) {
                v.add(arr[i+1]);
            }
        }

        ans = new int[v.size()];

        for (int i = 0; i < v.size(); i++) {
            int n = (int)v.get(i);
            ans[i] = n;
        }
        return ans;
    }
}
