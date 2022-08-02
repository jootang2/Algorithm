package juhwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        int n = N / 100;
        for (int i = 0; i < 100; i++) {
            if ((n * 100 + i) % F == 0) {
                if (i < 10) {
                    System.out.print(0);
                }
                System.out.println(i);
                break;
            }
        }
    }
}
