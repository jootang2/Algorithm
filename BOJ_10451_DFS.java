package juhwan;

import java.util.*;

public class BOJ_10451_DFS {
    static int[] map;
    static boolean[] visited;
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); //Test 수
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // 순열의 크기
            visited = new boolean[N+1];
            map = new int[N+1];
            for (int j = 1; j <= N; j++) {
                int p = sc.nextInt(); // 순열
                map[j] = p;
            }
            count = 0;
            for(int j = 1; j <= N; j ++){
                if(!visited[j]){
                    visited[j] = true;
                    dfs(j);
                    count++;
                }

            }
            System.out.println(count);
        }
    }
    
    public static void dfs(int i){
        int next = map[i];
        if(!visited[next]){
            visited[next] = true;
            dfs(next);
        }
    }
}
