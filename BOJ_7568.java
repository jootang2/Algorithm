package juhwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_7568 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arrX = new int[N];
        int[] arrY = new int[N];
        int[] rank = new int[N];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

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
