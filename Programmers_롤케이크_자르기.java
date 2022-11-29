package juhwan;

import java.util.*;

public class Programmers_롤케이크_자르기 {
    /*
        1. 형 Map에 (토핑종류 : 토핑개수) 입력
        2. 동생 Set에 토핑 추가
        3. 형 Map에서 토핑종류에 따른 값 -1
        4. Map에서 토핑종류의 값이 0 => 토핑종류 삭제
        5. Set의 size와 Map의 size가 같은 경우 answer +1
        6. 2~5 : 주어진 topping의 배열의 길이만큼 반복
    */
    public int solution(int[] topping) {
        Map<Integer, Integer> old = new HashMap<>();
        Set<Integer> young = new HashSet<>();
        int answer = 0;
        for (int toppingKind : topping) {
            if (old.containsKey(toppingKind)) {
                old.replace(toppingKind, old.get(toppingKind) + 1);
            } else {
                old.put(toppingKind, 1);
            }
        }

        for (int i = 0; i < topping.length; i++) {
            young.add(topping[i]);

            old.replace(topping[i], old.get(topping[i]) - 1);

            if (old.get(topping[i]) == 0) {
                old.remove(topping[i]);
            }

            if (young.size() == old.size()) {
                answer++;
            }

        }

        return answer;
    }
}
