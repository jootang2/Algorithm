package juhwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1; i<N; i++){
            if(divideSum(i) == N){
                arr.add(i);
            }
        }

        if(arr.size() == 0) {
            System.out.println(0);
        }
        else
        System.out.println(arr.get(0));
    }

    private static int divideSum(int n) {
        String num = Integer.toString(n);
        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        return n+sum;
    }
}
