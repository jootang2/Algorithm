package juhwan;

import java.util.ArrayList;
import java.util.List;

public class Programmers_카펫 {
    public static int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        List<Integer> list = new ArrayList<>();
        for (int i = 3; i < sum; i++) {
            int check = (i-2) * (sum/i -2);

            if (sum % i == 0) {
                list.add(i);
                list.add(sum / i);
            }

            if (check == yellow) {
                break;
            }
        }

        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());

        int[] answer = {list.get(list.size() - 1), list.get(list.size() - 2)};
        return answer;
    }
}
