package juhwan;

import java.util.Scanner;

public class BOJ_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arrX = new int[N];
        int[] arrY = new int[N];
        int[] rank = new int[N];


        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            arrX[i] = X;
            arrY[i] = Y;
        }
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (arrX[i] < arrX[j] && arrY[i] < arrY[j]) {
                    count++;
                }
            }
            rank[i] = count + 1;
        }
        for (int i = 0; i < N; i++) {

            System.out.print(rank[i] + " ");
        }
    }
}
