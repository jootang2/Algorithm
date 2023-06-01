package juhwan;

public class Programmers_푸드_파이트_대회 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        for (int j = 1; j < food.length; j++) {
            if (food[j] > 1) {
                for (int i = 0; i < food[j] / 2; i++) {
                    sb.append(j);
                }
            }
        }
        sb1.append(sb);
        sb1.append("0");

        StringBuffer buffer = new StringBuffer(sb.toString());
        String reverse = buffer.reverse().toString();

        sb1.append(reverse);

        String answer = sb1.toString();
        return answer;
    }
}
