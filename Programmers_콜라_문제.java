package juhwan;

public class Programmers_콜라_문제 {
    /*
   1. n개의 빈 병, a개를 가져다 줄 때, b개로 교환 : 교환받는 병의 개수 => n/a*b
   2. 가지고 있는 병의 수 => n - n/a
   */
    public int solution(int a, int b, int n) {
        boolean flag = false;
        int answer = 0;

        while (!flag) {
            answer += n / a * b;
            n = n - n / a * a + n / a * b;

            if (n < a) {
                flag = true;
            }
        }

        return answer;
    }
}
