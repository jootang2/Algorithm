//BFS, DFS 예제
package juhwan;

import java.util.*;

public class BOJ_2178_BFS {
    static int N; //도착위치 //행의 수
    static int M; //도착위치 //열의 수
    static int[][] maps; //미로
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new int[N][M];
        maps = new int[N][M];
        for (int i = 0; i < N; i++) {
            String maze = sc.next();
            for (int j = 0; j < maze.length(); j++) {
                maps[i][j] = Integer.parseInt(String.valueOf(maze.charAt(j)));
            }
        }
        visited[0][0] = 1;
        bfs();
        System.out.println(visited[N-1][M-1]);
    }

    static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = now[0] + dx[i];
                int y = now[1] + dy[i];

                if (x >= 0 && y >= 0 && x < N && y < M && visited[x][y] == 0 && maps[x][y] == 1) {
                    visited[x][y] = visited[now[0]][now[1]] + 1;
                    queue.offer(new int[] {x,y});
                }
            }
        }
    }
}
