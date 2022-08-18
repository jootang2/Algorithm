package juhwan;
public class Programmers_최소직사각형 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        solution(sizes);
    }

    private static void solution(int[][] sizes) {
        int width = 0;
        int length = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int a = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = a;
            }
        } // sizes의 원소 [n][m] => n이 더 큰 원소로 초기화;
        for (int i = 0; i < sizes.length; i++) {
            width = Math.max(width, sizes[i][0]);
            length = Math.max(length, sizes[i][1]);
        }
        System.out.println(width*length);
    }
}
