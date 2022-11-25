package juhwan;

import java.util.*;

public class Programmers_귤_고르기 {
/*
    1. tangerine의 원소 중, 중복되는 원소의 개수를 validate에 추가
    2. validate를 내림차순으로 정렬
    3. validate의 원소를 순서대로 더하다가 k의 값을 넘어가면 그때의 인덱스 출력
*/
    public int solution(int k, int[] tangerine) {
        List<Integer> validate = new ArrayList<>();
        Arrays.sort(tangerine);
        makeValidateList(validate, tangerine);
        Collections.sort(validate, Collections.reverseOrder());

        int sum = 0;
        int answer = 0;
        for (int i = 0; i < validate.size(); i++) {
            sum += validate.get(i);
            if (sum >= k) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }

/*
    1. tangerine의 배열을 돌면서 같은 값이 있으면 count ++, 더 이상 없으면 validate에 추가
    2. 같은 원소의 개수만큼 i의 값 증가
    3. 마지막 원소의 경우 count 후 validate에 추가
*/
    private void makeValidateList(List<Integer> validate, int[] tangerine) {
        for (int i = 0; i < tangerine.length; i++) {
            int count = 0;
            for (int j = i; j < tangerine.length; j++) {
                if (tangerine[i] == tangerine[j]) {
                    count++;
                    if (j == tangerine.length - 1) {
                        validate.add(count);
                    }
                } else {
                    validate.add(count);
                    break;
                }
            }
            i = i + count - 1;
        }
    }
}
