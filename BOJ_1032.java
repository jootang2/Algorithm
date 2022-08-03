package juhwan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //입력의 개수
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().trim();
        } // 입력을 저장한 배열
        String[] result = new String[arr[0].length()]; // 결과값을 저장한 배열
        if (N == 1) {
            System.out.println(arr[0]);
        }        // 만약 N=1인 경우 그대로 출력;

        else{
            for (int j = 0; j < N - 1; j++) {
                for (int i = 0; i < arr[0].length(); i++) {
                    if (arr[j].charAt(i) == arr[j + 1].charAt(i)) {
                        if (result[i] == "?") {
                            continue;
                        }
                        else result[i] = String.valueOf(arr[j].charAt(i));
                    } else result[i] = "?";
                }
            }
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
            }
        }
    }
}
