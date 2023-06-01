package juhwan;

import java.util.ArrayList;
import java.util.List;

public class Programmers_모의고사 {
    public static int[] solution(int[] answers) {
        //1. 1번 수포자
        //2. 2번 수포자
        //3. 3번 수포자
        //4. 최댓값
        //5. 리스트에 추가
        //6. 배열로 변환 후 반환
        int member1 = 0;
        int member2 = 0;
        int member3 = 0;
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        List<Integer> memberList = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            if (person1[i % 5] == answers[i]) {
                member1++;
            }
            if (person2[i % 8] == answers[i]) {
                member2++;
            }
            if (person3[i % 10] == answers[i]) {
                member3++;
            }
        }

        int max = Math.max(Math.max(member1, member2), member3);

        if (member1 == max) {
            memberList.add(1);
        }
        if (member2 == max) {
            memberList.add(2);
        }
        if (member3 == max) {
            memberList.add(3);
        }

        int[] answer = new int[memberList.size()];

        for(int i = 0; i < answer.length; i ++){
            answer[i] = memberList.get(i);
        }

        return answer;
    }
}
