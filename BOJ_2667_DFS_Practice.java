package juhwan;

import java.util.*;

public class BOJ_2667_DFS_Practice {
    static int[][] map;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {-1, 1, 0, 0};
    static boolean[][] visited;
    static int numberOfHouse; //집의 수
    static int count; //단지의 수
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String input = sc.next();
            for (int k = 0; k < N; k++) {
                map[i][k] = Integer.parseInt(String.valueOf(input.charAt(k)));
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && visited[i][j] == false) {
                    numberOfHouse = 0;
                    count++;
                    dfs(i, j);
                    list.add(numberOfHouse);
                }
            }
        }

        Collections.sort(list);
        System.out.println(count);
        for(int answer : list){
            System.out.println(answer);
        }

    }

    private static void dfs(int i, int j) {
        map[i][j] = numberOfHouse;
        visited[i][j] = true;
        numberOfHouse++;
        for (int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if(x >= 0 && x < map.length && y >= 0 && y < map.length && map[x][y] == 1 && visited[x][y] == false){
                visited[x][y] = true;
                map[x][y] = numberOfHouse;
                dfs(x, y);
            }
        }
    }
}
