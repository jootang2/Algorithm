package juhwan;

import java.util.*;

public class BOJ_1260 {
    static int n; // 정점 개수
    static int m; // 간선 개수
    static int start; // 시작점
    static int[][] check; //간선 연결상태 확인
    static boolean[] checked; // 확인 여부

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();
        check = new int[1001][1001];
        checked = new boolean[1001];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            check[x][y] = check[y][x] = 1;
        }

        dfs(start);

        checked = new boolean[1001]; // 초기화
        System.out.println(); // 줄 바꿈

        bfs();
    }

    public static void dfs(int i) {
        //탈출 조건
        checked[i] = true;
        System.out.print(i + " ");

        //재귀
        for (int j = 1; j <= n; j++) {
            if(check[i][j] == 1 && checked[j] == false){
                dfs(j);
            }
        }
    }

    public static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        checked[start] = true;
        System.out.print(start + " ");

        while(!queue.isEmpty()){
            int temp = queue.poll();

            for(int j = 1; j <= n; j++){
                if(check[temp][j] == 1 && checked[j] == false){
                    queue.offer(j);
                    checked[j] = true;
                    System.out.print(j+ " ");
                }
            }
        }

    }
}
