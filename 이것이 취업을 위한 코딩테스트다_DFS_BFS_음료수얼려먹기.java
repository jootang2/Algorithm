package juhwan;

import java.util.Scanner;

public class DFS_BFS_ex_1 {
    /**/
    static int N;
    static int M;
    static int[][] map = new int[1000][1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); //세로 길이
        M = sc.nextInt(); // 가로 길이

        for (int i = 0; i < N; i++) {
            String ice = sc.next();
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(String.valueOf(ice.charAt(j)));
            }
        }

        int answer = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (dfs(i, j)) {
                    answer++;
                }
            }
        }

        System.out.println(answer);

    }

    private static boolean dfs(int i, int j) {
        if (i <= -1 || i >= N || j <= -1 || j >= M) {
            return false;
        }
        if (map[i][j] == 0) {
            map[i][j] = 1;
            dfs(i - 1, j);
            dfs(i + 1, j);
            dfs(i, j + 1);
            dfs(i, j - 1);
            return true;
        }
        return false;
    }
}
