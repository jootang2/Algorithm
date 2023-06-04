package juhwan;

import java.util.Scanner;

public class DFS_BFS_음료수_얼려먹기_practice {

    public static int n, m; //가로길이, 세로길이
    public static int[][] map = new int[1000][10000]; //맵


    public static boolean BFS(int x, int y) {
        //맵 바깥이면 return false;
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }
        //map[x][y] 가 0이면 1로 바꿔주고 주변 맵 BFS실행, return true;
        if (map[x][y] == 0) {
            map[x][y] = 1;
            BFS(x + 1, y);
            BFS(x - 1, y);
            BFS(x, y + 1);
            BFS(x, y - 1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String input = sc.next();
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(String.valueOf(input.charAt(j)));
            }
        }

        int result = 0;
        for(int i = 0 ; i < m; i ++){
            for(int j = 0 ; j < m ; j ++){
                if(BFS(i, j)){
                    result ++;
                }
            }
        }
        System.out.println(result);
    }
}
