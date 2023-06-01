package juhwan;

import java.util.Scanner;

public class 구현_ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= hour; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    String clock = Integer.toString(i) + Integer.toString(j) + Integer.toString(k);
                    if(clock.contains("3")){
                        sum ++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
