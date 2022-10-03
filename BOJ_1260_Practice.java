package juhwan;

import java.util.*;

public class BOJ_1260_Practice {
    static int N; //정점의 개수
    static int M; //간선의 개수
    static int start;
    static boolean[] check;
    static int[][] checked;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        start = sc.nextInt();
        check = new boolean[1001];
        checked = new int[1001][1001];

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            checked[x][y] = checked[y][x] = 1;
        }

        dfs(start);
        System.out.println(" ");

        check = new boolean[1001];

        bfs();
    }

    static void dfs(int i) {
        //탈출 조건
        check[i] = true;
        System.out.print(i + " ");
        //재귀
        for (int j = 1; j <= N; j++) {
            if (checked[i][j] == 1 && check[j] == false) {
                dfs(j);
            }
        }
    }

    static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        check[start] = true;
        System.out.print(start + " ");
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int j = 1; j <= N; j++){
                if(checked[temp][j] == 1 && check[j] == false){
                    queue.offer(j);
                    check[j] = true;
                    System.out.print(j + " ");
                }

            }
        }
    }


}
