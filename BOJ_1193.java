package juhwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int crossNumber = 0;
        int maxNumber = 0;
        for (int i = 1; true; i++) {
            maxNumber += i;
            if (maxNumber >= N) {
                crossNumber = i;
                System.out.println(i);
            break;
            }

        }

        System.out.println(maxNumber);

        int A = maxNumber-N;
        if(crossNumber % 2 == 0){
            System.out.println(crossNumber-A + "/" + (1+A));
        }
        else {
            System.out.println((1+A) + "/" + (crossNumber-A) );
        }
    }
}
