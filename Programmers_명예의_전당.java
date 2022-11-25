package juhwan;

import java.util.*;

public class Programmers_명예의_전당 {
    /*
    1. 만약 k가 score의 길이보다 큰 경우
        1-1. 순서대로 명예의 전당에 하나씩 추가
        1-2. 명예의 전당 리스트를 오름차순으로 정렬
        1-3. answer 배열에 명예의 전당 중 가장 작은 수 추가
        1-4. score의 길이만큼 반복
    2. k가 score의 길이보다 크지 않은 경우
        2-1. k번째 까지는 명예의 전당 리스트에 점수 추가 후 정렬
        2-2. answer 배열에 명예의 전당 중 가장 작은 수 추가
        2-3. k만큼 반복
        2-4. k번째 이후는 기존의 명예의 전당 리스트 중 가장 작은 수와 비교해서
             새로 들어온 점수가 더 작으면 기존의 가장 작은 수 삭제, 새로 들어온 점수 추가
        2-5. 명예의 전당 리스트 재 정렬
        2-6. answer 배열에 가장 작은 수 추가
        2-7. score의 길이만큼 반복

    */
    public int[] solution(int k, int[] score) {
        List<Integer> honor = new ArrayList<>();
        int[] answer = new int[score.length];

        if (k > score.length) {

            for (int i = 0; i < score.length; i++) {
                honor.add(score[i]);
                Collections.sort(honor);
                answer[i] = honor.get(0);
            }

            return answer;
        } else {

            for (int i = 0; i < k; i++) {
                honor.add(score[i]);
                Collections.sort(honor);
                answer[i] = honor.get(0);
            }

            for (int i = k; i < score.length; i++) {

                if (honor.get(0) < score[i]) {
                    honor.remove(0);
                    honor.add(score[i]);
                    Collections.sort(honor);
                    answer[i] = honor.get(0);
                } else {
                    answer[i] = honor.get(0);
                }
            }

            return answer;
        }
    }
}
