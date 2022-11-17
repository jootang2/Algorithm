package juhwan;

import java.util.*;

public class Programmers_기사단원의_무기 {
    public int solution(int number, int limit, int power) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (findPower(i) > limit) {
                sum += power;
            } else {
                sum += findPower(i);
            }
        }
        return sum;
    }

    public static int findPower(int number) {
        int count = 0;
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                count++;
            } else if (number % i == 0) {
                count += 2;
            }
        }
        return count;
    }
}
