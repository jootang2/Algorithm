package juhwan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_햄버거_만들기 {
    /*
        1.takeOut에 주어진 배열을 하나씩 추가한다.
        2.takeOut의 사이즈가 3이상이 되면 1231이 포함되는 지 확인한다.
        3.만약 포함된다면 answer++, takeOut은 뒤에서부터 4개 숫자를 지우고 다시 반복
    */
    public int solution(int[] ingredient) {
        int[] burger = {1, 2, 3, 1};
        int answer = 0;
        List<Integer> takeOut = new ArrayList<>();
        for (int i = 0; i < ingredient.length; i++) {
            int[] temp = new int[4];
            takeOut.add(ingredient[i]);

            if (takeOut.size() > 3) {
                temp[0] = takeOut.get(takeOut.size() - 4);
                temp[1] = takeOut.get(takeOut.size() - 3);
                temp[2] = takeOut.get(takeOut.size() - 2);
                temp[3] = takeOut.get(takeOut.size() - 1);

                if (Arrays.equals(temp, burger)) {
                    answer++;
                    takeOut.remove(takeOut.size() - 1);
                    takeOut.remove(takeOut.size() - 1);
                    takeOut.remove(takeOut.size() - 1);
                    takeOut.remove(takeOut.size() - 1);
                }
            }
        }
        return answer;
    }
}

