package juhwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1009 {
    public static void main(String[] args) throws IOException {
//test
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 수
        int[] arr = new int[T];


        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int data = units(a, b);
            System.out.println(data);
        }
    }

    private static int units(int a, int b) {
        int result = a % 10;

        if (a % 10 == 0) {
            return 10;
        } else if (a % 10 == 2) {
            if (b % 4 == 1) {
                return 2;
            }
            if (b % 4 == 2) {
                return 4;
            }
            if (b % 4 == 3) {
                return 8;
            } else {
                return 6;
            }
        } else if (a % 10 == 3) {
            if (b % 4 == 1) {
                return 3;
            }
            if (b % 4 == 2) {
                return 9;
            }
            if (b % 4 == 3) {
                return 7;
            } else {
                return 1;
            }
        } else if (a % 10 == 4) {
            if (b % 2 == 1) {
                return 4;
            } else {
                return 6;
            }
        } else if (a % 10 == 7) {
            if (b % 4 == 1) {
                return 7;
            }
            if (b % 4 == 2) {
                return 9;
            }
            if (b % 4 == 3) {
                return 3;
            } else {
                return 1;
            }
        } else if (a % 10 == 8) {
            if (b % 4 == 1) {
                return 8;
            }
            if (b % 4 == 2) {
                return 4;
            }
            if (b % 4 == 3) {
                return 2;
            } else {
                return 6;
            }
        } else if (a % 10 == 9) {
            if (b % 2 == 1) {
                return 9;
            } else {
                return 1;
            }
        }


        return result;
    }
}
