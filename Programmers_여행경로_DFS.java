package juhwan;

import java.util.*;

public class Programmers_여행경로_DFS {
    static boolean[] visited;
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[] answer = solution(tickets);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }

    public static String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        dfs(0, "ICN", "ICN", tickets);
        
        Collections.sort(list);
        
        return list.get(0).split(" ");
    }

    public static void dfs(int count, String start, String path, String[][] tickets) {
        //탈출조건
        if (count == tickets.length) {
            list.add(path);
            return;
        }
        //재귀로직
        for (int i = 0; i < visited.length; i++) {
            if(!visited[i] && start.equals(tickets[i][0])){
                visited[i] = true;
                dfs(count + 1 , tickets[i][1], path + " " + tickets[i][1] , tickets);
                visited[i] = false;
            }
        }
    }
}
