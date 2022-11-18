package juhwan;

import java.util.ArrayList;
import java.util.List;

public class Programmers_숫자_카드_나누기 {
    public int solution(int[] arrayA, int[] arrayB) {
        int minA = findMin(arrayA);
        int minB = findMin(arrayB);
        List<Integer> divisorA = new ArrayList<>();
        List<Integer> divisorB = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        addDivisor(arrayA, minA, divisorA);
        addDivisor(arrayB, minB, divisorB);

        findAnswer(divisorA, arrayB, answer);
        findAnswer(divisorB, arrayA, answer);
        if (answer.isEmpty()) {
            return 0;
        }
        int max = 0;
        for (int M : answer) {
            max = Math.max(M, max);
        }


        return max;
    }

    private void findAnswer(List<Integer> divisorA, int[] arrayB, List<Integer> answer) {
        for (int divisor : divisorA) {
            for (int i = 0; i < arrayB.length; i++) {
                if (arrayB[i] % divisor != 0) {
                    if (i == arrayB.length - 1) {
                        answer.add(divisor);
                    }
                    continue;
                } else {
                    break;
                }
            }
        }
    }

    private void addDivisor(int[] arrayA, int minA, List<Integer> divisorA) {
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % minA == 0) {
                if (i == arrayA.length - 1) {
                    divisorA.add(minA);
                    if (minA == 1) {
                        break;
                    }
                    minA--;
                    i = -1;
                }
            } else {
                minA--;
                i = -1;
            }
            continue;
        }
    }

    private int findMin(int[] array) {
        int min = 100000000;
        for (int A : array) {
            min = Math.min(min, A);
        }
        return min;
    }
}
