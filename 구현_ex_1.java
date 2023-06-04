package juhwan;

import java.util.Scanner;

public class 구현_ex_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] movePlans = sc.nextLine().split(" ");

        int x = 1;
        int y = 1;

        for(int i=0; i < movePlans.length; i++){
            if(movePlans[i].equals("R")){
                if(y < N){
                    y += 1;
                }
            } else if(movePlans[i].equals("L")){
                if(y <= N && y > 1){
                    y -= 1;
                }
            } else if(movePlans[i].equals("U")){
                if(x <= N && x > 1){
                    x -= 1;
                }
            } else if(movePlans[i].equals("D")){
                if(x < N){
                    x += 1;
                }
            }
        }
        System.out.println(x + " " + y);
    }
}
