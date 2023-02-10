package Array;

public class Code03 {
    // 리스트 형태의 클래스는 equals라는 메서드가 있지만 Array 클래스에는 직접 구현해야한다.
    // 만약 Array구조에 equals를 사용한다면 Object 클래스의 equals를 사용하게 되어서 단순히 인스턴스만 비교해준다.
    /* 배열을 비교하는 클래스 먼저 두 배열이 달라야한다면 다음과 같은 상태를 만족해야한다.
    *
    *   1. 두 배열의 length가 다르다.
    *   2. 각각의 원소 값이 다르다.
    *
    * */
    static boolean isEqueals(int[] a, int[] b) {
        if(a.length != b.length) {
            return false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if(a[i] != b[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arrayA = {1,2,3,4,5};
        int[] arrayB = {1,2,3,4,5};

        System.out.println(isEqueals(arrayA, arrayB)); // true
    }
}
