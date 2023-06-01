package juhwan;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_ex_1 {
    /*
     * 1. 주어진 배열에서 최댓값을 구한다.
     * 2. 최댓값을 K번 더한다.
     * 3. 두번째로 큰 값을 한번 더해준다.
     * 4. 1~3번을 덧셈의 횟수가 M번이 될 때까지 반복
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        boolean flag = true;
        int count = 0;
        int sum = 0;
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        while (flag) {
            for (int i = 0; i < K; i++) {
                sum += numbers[numbers.length - 1];
                count++;
            }

            sum += numbers[numbers.length - 2];
            count++;

            if (count == M) {
                flag = false;
            }
        }
        System.out.println(sum);
    }
}
