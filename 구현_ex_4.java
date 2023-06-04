package juhwan;


import java.util.Scanner;

public class 구현_ex_4 {
    /*
     * 1. 맵 생성
     * 2. 체크판 생성
     * 3. 왼쪽으로 회전하는 메소드 생성
     * 4. 가보지 않은 칸이 존재하는 경우 이동
     * 5. 회전 후 가보지 않은 칸이 없거나 바다인 경우 회전
     * 6. 네 방향 모두 갈 수 없는 경우 뒤로 이동
     * 7. 뒤가 바다로 막혀있는 경우 끝*/
    static int[][] map = new int[50][50];
    static int[][] check = new int[50][50];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int sight;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sight = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int count = 1;
        int turnTime = 0;
        check[x][y] = 1;

        while (true) {
            turnLeft();
            int nx = x + dx[sight];
            int ny = y + dy[sight];
            if (map[nx][ny] == 0 && check[nx][ny] == 0) {
                check[nx][ny] = 1;
                x = nx;
                y = ny;
                turnTime = 0;
                count++;
                continue;
            } else {
                turnTime++;
            }

            if (turnTime == 4) {
                nx = x - dx[sight];
                ny = y - dy[sight];
                if (map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                } else {
                    break;
                }
                turnTime = 0;
            }
        }

        System.out.println(count);

    }

    private static void turnLeft() {
        sight--;
        if (sight == -1) {
            sight = 3;
        }
    }
}
