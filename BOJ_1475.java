package juhwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class BOJ_1475 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNumber = br.readLine();
        int count = 0;

        int[] roomNumber_ = new int[roomNumber.length()];
        int[] counter = new int[10];

        for (int i = 0; i < roomNumber.length(); i++) {
            roomNumber_[i] = Integer.parseInt(String.valueOf(roomNumber.charAt(i)));
        }

        for (int i = 0; i < roomNumber.length(); i++) {
            counter[roomNumber_[i]]++;
        }

        double A = (double)(counter[6] + counter[9])/2;

        int max = 0;
        int counterIndex = 0;
        for( int i=0; i<10 ; i++) {
            max = Math.max(max, counter[i]);
        }

        for(int i=9;i>=0; i--){
            if(counter[i] == max){
                counterIndex = i;
                }
            }



        if(counterIndex == 6){

            if(counter[6] == counter[7]){
                System.out.println(counter[7]);
            }
            else if(counter[6] == counter[8]){
                System.out.println(counter[8]);
            }

            else{

                System.out.println((int)Math.ceil(A));
            }


            }

        else if( counterIndex == 9){
            System.out.println((int)Math.ceil(A));
        }

        else{

            System.out.println(max);
        }



    }
}


