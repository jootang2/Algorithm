package juhwan;

import java.util.Arrays;

public class Programmers_로또의_최고순위와_최저순위 {
    public static void main(String[] args) {

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        solution(lottos, win_nums);

    }

    private static void solution(int[] lottos, int[] win_nums) {
        int countZero = 0;
        int countLottos = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                countZero++;
            }
        }
        // lottos의 0 원소의 개수;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] != 0) {
                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        countLottos++;
                    }
                }
            }
        }
        // 0을 제외한 숫자 중 맞춘 숫자의 개수


        int max = countZero + countLottos;
        int min = countLottos;


        if (max == 6) {
            max = 1;
        } else if (max == 5) {
            max = 2;
        } else if (max == 4) {
            max = 3;
        } else if (max == 3) {
            max = 4;
        } else if (max == 2) {
            max = 5;
        } else max = 6;

        if (min == 6) {
            min = 1;
        } else if (min == 5) {
            min = 2;
        } else if (min == 4) {
            min = 3;
        } else if (min == 3) {
            min = 4;
        } else if (min == 2) {
            min = 5;
        } else min = 6;

        int[] answer = {max, min};
        System.out.println(Arrays.toString(answer));
    }
}

