package juhwan;

import java.util.*;
class Programmers_게임_맵_최단거리_BFS {

    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    int N, M;
    public int solution(int[][] maps) {
        int answer = 0;
        N = maps.length;  //X길이
        M = maps[0].length; //Y길이
        int [][] visited = new int [N][M];
        visited [0][0] = 1;
        BFS(maps, visited);
        answer = visited[N-1][M-1];
        if(answer == 0){
            return -1;
        }
        return answer;
    }

    public void BFS(int[][] maps , int[][] visited){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});

        while(!queue.isEmpty()){
            int[] now = queue.poll();
            for(int i = 0 ; i < 4 ; i ++){
                int x = now[0] + dx[i];
                int y = now[1] + dy[i];

                if(x >= 0 && x < N && y >= 0 && y < M && visited[x][y] == 0 && maps[x][y] == 1){
                    visited[x][y] = visited[now[0]][now[1]] + 1;
                    queue.add(new int[]{x,y});
                }
            }
        }
    }
}
