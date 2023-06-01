package juhwan;
import java.util.Scanner;
import java.util.Arrays;

public class BOJ_1920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[] arr = new int[M];
//    1. 입력받은 값을 정렬해서 배열에 저장
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            arr[i] = A;
        }
        Arrays.sort(arr);
//    2. 이분탐색
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            if (binarySearch(arr, A) >= 0) {
                sb.append(1).append("\n");
            } else sb.append(0).append("\n");
        }
        System.out.println(sb);
    }
    private static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            if (key < arr[middle]) {
                high = middle - 1;
            } else if (key > arr[middle]) {
                low = middle + 1;
            } else return middle;
        }
        return -1;
    }
}
