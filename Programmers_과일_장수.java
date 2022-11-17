package juhwan;

import java.util.Arrays;
import java.util.Collections;

public class Programmers_과일_장수 {
    public int solution(int k, int m, int[] score) {
        Integer[] scoreNew = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreNew, Collections.reverseOrder());
        int box = scoreNew.length/m;
        int answer = 0;
        for(int i = 1; i <= box ; i ++){
            answer+=scoreNew[m*i-1]*m;
        }
        return answer;
    }
}
