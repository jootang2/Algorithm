package juhwan;

import java.util.Arrays;

public class Programmers_완주하지_못한_선수 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String answer = solution(participant, completion);
        System.out.println("answer = " + answer);
    }

    private static String solution(String[] participant, String[] completion) {
        String answer="";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if(participant[i] != completion[i]){
                answer = participant[i];
                break;
            } else
                answer = participant[completion.length];
        }
        return answer;
    }
}
