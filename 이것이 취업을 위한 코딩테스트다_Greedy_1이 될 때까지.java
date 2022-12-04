package juhwan;

import java.util.Scanner;

public class Greedy_ex_3 {
    /*
    * 1. N이 K로 나누어 떨어지는지 확인
    * 2. 나누어 떨어진다면 N을 K로 나눈다.
    * 3. 나누어 떨어지지 않는다면 N-1
    * 4. 1이 될 때 까지 1~3 반복
    * 5. 사칙연산을 한 횟수를 반환
    * 6. N이 K보다 큰 경우(1~5번)
    * 7. N이 K보다 작은 경우에는 count에 (N-1)만큼 더한다.
    */
    static int count = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        rule(N,K);

        System.out.println(count);


    }

    private static void rule(int N, int K){
        if(N > K){
            if(N == 1){
                return;
            } else {
                if(N % K == 0){
                    N = N/K;
                    count ++;
                    rule(N,K);
                } else {
                    N = N-1;
                    count ++;
                    rule(N,K);
                }
            }
        } else {
            count += (N-1);
        }

    }
}
