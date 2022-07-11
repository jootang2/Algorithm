package juhwan;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class BOJ_9020 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);

        int testcase = Integer.parseInt(br.readLine());

        boolean[] prime =  get_Prime(10001);

        for(int i = 0; i <testcase; i++){
            int a = Integer.parseInt(br.readLine());
            int p = a/2;
            int q = a/2;
            while(true){
                if(prime[p] == false || prime[q] == false){

                    p--;
                    q++;

                }
                else{
                    System.out.println(p + " " + q);
                    break;
                }

            }
        }



//        System.out.println(list);




    }


    public static boolean[] get_Prime(int n) {

        boolean[] prime = new boolean[n + 1];
        int count = 0;
        // 소수가 아니면 0;

        prime[0] = prime[1] = false;

        for(int i = 2; i< prime.length; i++){
            prime[i] = true;
        }

        for (int i = 2; i < n; i++) {
            if (prime[i] == false) {
                continue;
            } // 소수 = 0
            for (int j = 2 * i; j <= n; j += i) {
                prime[j] = false;
            }
        } // 소수의 배수들 = 0
//        for (int i = 2; i <= n; i++) {
//            if (prime[i] != false) {
//
//            }
//        }
            return prime;
    }
}

