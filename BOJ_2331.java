package juhwan;

import java.util.*;
public class BOJ_2331 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int P = sc.nextInt();
        ArrayList<Integer> number = new ArrayList<>();
        boolean[] check = new boolean[240000];
        number.add(A);
        check[A]= true;
        int answer;
        loop:
        while(true){
            int next = 0;
            String a = Integer.toString(number.get(number.size()-1));
            for(int i = 0 ; i < a.length(); i ++){
                int B = Integer.parseInt(String.valueOf(a.charAt(i)));
                next += Math.pow(B, P);
            }
            number.add(next);
            if(check[next] == true){
                answer = next;
                break loop;
            } else {
                check[next] = true;
            }
        }
        for(int i = 0 ; i < number.size()-1; i ++){
            if(number.get(i) == answer){
                System.out.println(i);
            }
        }
    }
}
