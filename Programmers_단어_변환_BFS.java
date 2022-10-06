package juhwan;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Programmers_단어_변환_BFS {
    static String[] words;
    static String begin;
    static String target;
    static boolean[] visited;

    static class Item {
        String str;
        int move;

        Item(String str, int move) {
            this.str = str;
            this.move = move;
        }
    }

    public static void main(String[] args) {
        words = new String[]{"hot", "dot", "dog", "lot", "log", "cog"};
        begin = "hit";
        target = "cog";
        visited = new boolean[words.length];
        int answer = solution(begin, target, words);
        System.out.println("answer = " + answer);
    }

    public static int solution(String begin, String target, String[] words) {
        if (Arrays.asList(words).contains(target)) {
            return dfs();
        } else return 0;
    }

    public static int dfs() {
        Queue<Item> queue = new LinkedList<>();
        queue.offer(new Item(begin, 0));

        while (!queue.isEmpty()) {
            Item item = queue.poll();
            if (item.str.equals(target)) {
                return item.move;
            }

            for (int i = 0; i < words.length; i++) {
                if (possible(item.str, words[i]) && !visited[i]){
                    visited[i] = true;
                    queue.offer(new Item(words[i], item.move+1));
                }
            }
        }
        return 0;
    }

    public static boolean possible(String A, String B) {
        int count = 0;
        for (int i = 0; i < B.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                count++;
            }
        }
        if (count == 1) {
            return true;
        } else return false;
    }
}


//1. 배열에 타겟 단어가 들어가 있는 지 확인
//2. BFS
//2.1 queue에 처음 문자 추가
//2.2 queue가 빌 때 가지 반복
//2.3 visited 가 false && possible : true 인 경우
// visited => true , queue.offer(다음 단어)