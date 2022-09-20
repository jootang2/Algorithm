package juhwan;
import java.util.Arrays;
public class Programmers_H_Index {
    public static void main (String[] args){
        int[] citations = {4,4,4};
        int answer = solution(citations);
        System.out.println("answer = " + answer);
    }
    public static int solution(int[] citations){
        //논문의 수
        int number = citations.length;
        //배열을 오름차순으로 정렬
        Arrays.sort(citations);

        for(int i = citations[number-1] ; i >= 0 ; i --){
            int count = 0 ;
            for(int j = number-1 ; j >= 0; j --){
                if(citations[j] >= i){
                    count++;
                }
                if(count >= i){
                    return i;
                }
            }
        }
        return 0;
    }
}
