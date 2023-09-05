package Algorithms;

public class Sty01 {
    /*
    *   2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
    *   두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
    *   요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다.
    * */

    // weeks 배열을 만들어 1월 1일이 금요일이라 하였으니 금요일부터 목요일까지 순서대로 요일을 입력한다.
    String[] weeks = {"FRI", "SAT", "SUN", "MON", "TUE","WED", "THU"};

    // month 배열을 만들어 차례대로 1월, 2월, 3월....순으로 각 달의 일수를 입력해준다.
    // 조건사항에 2016년이 윤년이라고 하였으니 2월은 29일이 되어 month[1]은 29가 된다.
    int[] month = { 31,29,31,30,31,30,31,31,30,31,30,31};

    public String solution(int a, int b) {
        String ans = "";
        int day = 0;

        // a의 값이 5 일때 for문 내부는 0, 1, 2, 3 까지 총 4회 반복하게 된다.
        // 이것은 1월, 2월, 3월, 4월의 일 수를 모두 더하는 과정이다.
        for (int i = 0; i < (a-1); i++) {
            day += month[i];
        }
        // 여기에 b의 값 24에서 1을 뺀 값인 23을 더해준다. 1을 왜 빼느냐 하면
        // 이 계산식대로라면 5월 1일부터 시작하기 때문에 24를 온전히 더해주게 되면
        // 계산 결과 5월 25일의 요일이 나오게 되므로 1을 빼주도록 한다.
        day +=(b-1);
        day %= 7;
        // 이렇게 구한 숫자를 7로 나눈 나머지 값에 해당하는 요일을 weeks 배열에서 빼내오면 된다.
        ans = weeks[day];

        return ans;
    }

    public static void main(String[] args) {
        Sty01 sty01 = new Sty01();
        sty01.solution(5, 30);
    }
}
