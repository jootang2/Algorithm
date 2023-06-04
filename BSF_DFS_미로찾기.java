package juhwan;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Nodu {
    private int x;
    private int y;

    public Nodu(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}

public class BSF_DFS_미로찾기 {

    public static int n, m;
    public static int[][] map = new int[201][201];

    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static int BFS(int x, int y){
        Queue<Nodu> q = new LinkedList<>();
        q.offer(new Nodu(x, y));
        while(!q.isEmpty()){
            Nodu nodu = q.poll();
            x = nodu.getX();
            y = nodu.getY();
            for(int i = 0; i < 4; i ++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx <= -1 || nx >= n || ny <= -1 || ny >= m) continue;
                if(map[nx][ny] == 0) continue;
                if(map[nx][ny] == 1){
                    map[nx][ny] = map[x][y] + 1;
                    q.offer(new Nodu(nx,ny));
                }
            }
        }

        return map[n-1][m-1];
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

        System.out.println(BFS(0,0));
    }
}
