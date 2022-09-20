package juhwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(seriesN(N));
    }

    private static int seriesN(int n) {
        int a = 665;
        int count = 0;
        while (count != n) {
            a++;
            if (Integer.toString(a).contains("666")) {
                count++;
            }
        }
        return a;
    }
}
