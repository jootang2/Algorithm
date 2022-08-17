package juhwan;

import java.util.ArrayList;

public class Programmers_같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0};

        solution(arr);
    }

    private static void solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 1) {
                arrList.add(arr[0]);
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    arrList.add(arr[i]);
                    i = j - 1;
                    if (j == arr.length - 1) {
                        arrList.add(arr[j]);
                    }
                    break;
                }
                if (j == arr.length - 1) {
                    arrList.add(arr[j]);
                }
                break;
            }
        }
        System.out.println(arrList);
    }
}
