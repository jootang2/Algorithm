package juhwan;

import java.util.Arrays;

public class Programmers_전화번호_목록 {
    public static void main(String[] args) {
        String[] phone_book = {"12","123","1235","88" , "215"};
        boolean answer = solution(phone_book);
        System.out.println("answer = " + answer);
    }

    private static boolean solution(String[] phone_book) {
       // 1. phone_book 정렬 => 오름차순
        Arrays.sort(phone_book);
       // 2. 앞번호가 뒷번호의 접두어인지 확인 => return false
        for(int i = 0 ; i < phone_book.length-1; i ++){
             if(phone_book[i+1].startsWith(phone_book[i])){
                 return false;
             }
        }
       // 3. return true

        return true;

    }
}
