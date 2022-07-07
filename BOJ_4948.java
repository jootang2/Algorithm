package test;

import java.util.Scanner;

public class BOJ_4948 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        while(true) {


            int N = sc.nextInt();

            if (N == 0) {
                break;
            }

            get_Prime(N);
        }
        return;

    }

    public static void get_Prime(int n){

        int[] prime = new int[2*n+1];

        // 소수가 아니면 0;
        prime[0] = prime[1] = 0;

        for(int i =2; i<=2*n ; i++){
            prime[i] = i;
        } // 배열 초기화;

        for(int i=2; i< 2*n; i++){
            if(prime[i] == 0){
                continue;
            } // 소수 = 0
            for(int j=2*i; j<=2*n; j+=i){
                prime[j] = 0;
            }
        } // 소수의 배수들 = 0
        int count = 0;
        for(int i=n+1; i<=2*n; i++){
            if(prime[i] != 0){
                count ++;
            }
        }
        System.out.println(count);
    }

        }




//    public static void get_Prime(int n, int m){
//
//        int[] prime = new int[m+1];
//        int answer = 0;
//        // 소수가 아니면 0;
//        prime[0] = prime[1] = 0;
//
//        for(int i =2; i<=m ; i++){
//            prime[i] = i;
//        } // 배열 초기화;
//
//        for(int i=2; i< m; i++){
//            if(prime[i] == 0){
//                continue;
//            } // 소수 = 0
//            for(int j=2*i; j<=m; j+=i){
//                prime[j] = 0;
//            }
//        } // 소수의 배수들 = 0
//        for(int i=n; i<=m; i++){
//            if(prime[i] != 0){
//                System.out.println(prime[i]);
//            }
//        }
//    }
//