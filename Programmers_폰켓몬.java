package juhwan;

import java.util.HashSet;
import java.util.Set;

public class Programmers_폰켓몬 {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 2};

        int answer = solution(nums);

        System.out.println("answer = " + answer);
    }

    private static int solution(int[] nums) {
        int n = nums.length / 2;
        Set<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numsSet.add(nums[i]);
        }
        if (numsSet.size() > n) {
            return n;
        } else return numsSet.size();
    }
}
