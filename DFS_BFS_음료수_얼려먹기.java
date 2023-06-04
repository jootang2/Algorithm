package juhwan;

import java.util.Scanner;

public class DFS_BFS_음료수_얼려먹기 {
    public static int n, m;
    public static int[][] array = new int[1000][1000];

    public static boolean DFS(int x, int y) {
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }
        if (array[x][y] == 0) {
            array[x][y] = 1;
            DFS(x - 1, y);
            DFS(x + 1, y);
            DFS(x, y + 1);
            DFS(x, y - 1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //세로길이
        m = sc.nextInt(); //가로길이

        for (int i = 0; i < n; i++) {
            String map = sc.next();
            for (int j = 0; j < m; j++) {
                array[i][j] = Integer.parseInt(String.valueOf(map.charAt(j)));
            }
        }

        int result = 0;
        for(int i = 0; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                if(DFS(i,j)){
                    result ++;
                }
            }
        }

        System.out.println(result);


    }


}
