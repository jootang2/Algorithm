package juhwan;

import java.util.Scanner;

class 구현_ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[][] map = new int[8][8];
        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

        int column = (char) (input.charAt(0)) - 96;
        int row = Integer.parseInt(String.valueOf(input.charAt(1)));
        int answer = 0;

        for(int i=0; i < 8; i++){
            int nextRow = row + dy[i];
            int nextColumn = column = dx[i];
            if(nextRow >= 1 && nextRow <=8 && nextColumn >=1 && nextColumn <= 8){
                answer ++;
            }
        }
        System.out.println(answer);
    }
}
