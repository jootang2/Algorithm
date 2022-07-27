package juhwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_2798 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //카드개수
        int M = sc.nextInt(); // 딜러가 외치는 숫자
        int[] arr = new int[N]; // 입력된 카드가 담긴 배열
        int max = 0; // M에 최대한 가까운 카드 3장의 합
        ArrayList<Integer> list = new ArrayList<>(); // 3장의 합 들이 담긴 리스트
        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            arr[i] = number;
        }// 입력된 카드가 담긴 배열
        for (int i = 0; i < N - 2; i++) {
            int a = arr[i];
            for (int j = 1; j < N - 1; j++) {
                while(i>=j){
                    j++;
                }
                int b = arr[j];
                for (int k = 2; k < N; k++) {
                    while(j>=k){
                        k++;
                    }
                    int c = arr[k];
                    list.add(a+b+c);

                }
            }
        }
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)<=M){
                max = Math.max(max,list.get(i));
            }
        }
        System.out.println(max);


    }
}
