package juhwan;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS_ex_2 {

    public static int N, M;
    public static int[][] map = new int[201][201];
    public static int[] dx = {0, 0, 1, -1};
    public static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String mapInput = sc.next();
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(String.valueOf(mapInput.charAt(j)));
            }
        }
        System.out.println(bfs(0, 0));
    }

    public static int bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            x = node.getX();
            y = node.getY();
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || nx >= N || ny < 0 || ny >= M){
                    continue;
                }
                if(map[nx][ny] == 0){
                    continue;
                }
                if(map[nx][ny] == 1){
                    map[nx][ny] = map[x][y] + 1;
                    queue.offer(new Node(nx,ny));
                }
            }
        }
        return map[N-1][M-1];
    }
}

class Node {

    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

