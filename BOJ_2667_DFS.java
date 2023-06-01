package juhwan;

import java.util.*;

public class BOJ_2667_DFS {
    static boolean[][] visited;
    static int[][] map;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int count = 0; //단지 수
    static int number = 0; //단지 내 집의 수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        map = new int[N][N];
        visited = new boolean[N + 1][N + 1];
        for (int i = 0; i < N; i++) {
            String M = sc.next();
            for (int k = 0; k < N; k++) {
                map[i][k] = Integer.parseInt(String.valueOf(M.charAt(k))); // 지도의 배열
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && visited[i][j] == false) { // 방문하지 않은 집인 경우
                    count++;
                    number = 0;
                    dfs(i, j);
                    list.add(number);
                }
            }
        }
        Collections.sort(list);
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(list.get(i));
        }

    }

    public static void dfs(int i, int j) {
        //탈출조건
        map[i][j] = count;
        visited[i][j] = true;
        number++;

        //재귀로직
        for (int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if (x >= 0 && x < map.length && y >= 0 && y < map.length && map[x][y] == 1 && visited[x][y] == false) { // 상하좌우에 방문하지 않은 집이 있는 경우
                visited[x][y] = true;
                map[x][y] = count;
                dfs(x, y);
            }
        }
    }
}
