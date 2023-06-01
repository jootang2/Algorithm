package juhwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10870 {
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = Fibonacci(N);

        System.out.println(result);



    }
    public static int Fibonacci (int N){
        if(N == 0){
            return 0;
        }
        if(N == 1){
            return 1;
        }
        return Fibonacci(N-1) + Fibonacci(N-2);
    }
}
