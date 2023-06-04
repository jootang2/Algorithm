package test;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class test {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        int N = Integer.parseInt(br.readLine());

        int[][] array = new int[100][100];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            for (int j = A; j < A + 10; j++) {
                for (int k = B; k < B + 10; k++) {

                    if (array[j][k] == 0) {
                        array[j][k] = 1;
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);

    }
}
//
//package test;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.StringTokenizer;
//import java.util.Scanner;
//
//public class test {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
////        st = new StringTokenizer(br.readLine()," ");
//
////        Scanner sc =new Scanner(System.in);
//
//        int N = Integer.parseInt(br.readLine());
//        int[][] array = new int[100][100];
//
////        for(int i=0; i<10; i++){
////            for(int j=0; j<10; j++){
////                array [i][j] = 0;
////            }
////        }
////        기본적으로 0으로 초기화되어있음
////        ex) bool => false  ,
////        wrapper 기본형을 wrap 해서 객체 ,
////        기본형은 기본값이 있다,
////        객체는 기본값이 NULL
//
//
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            int X = Integer.parseInt(st.nextToken());
//            int Y = Integer.parseInt(st.nextToken());
//
//            for (int j = X; j < X + 10; j++) {
//                for (int k = Y; k < Y + 10; k++) {
//                    array[j][k] = 1;
//                }
//            }
//
//        }
//
//        int sum = 0;
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                sum += array[i][j];
//            }
//        }
//
//
////        print2d(array);
//
//        System.out.println(sum);
//
//
//    }
