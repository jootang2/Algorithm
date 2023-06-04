package juhwan;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_ex_2 {
    /*
     * 1. 각 행에서 가장 작은 수를 구한다.
     * 2. 구한 수 중에서 가장 큰 수를 반환
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] numbers = new int[N][M];
        int[] answerList = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            Arrays.sort(numbers[i]);
            answerList[i] = numbers[i][0];
        }

        Arrays.sort(answerList);

        System.out.println(answerList[answerList.length - 1]);
    }
}
