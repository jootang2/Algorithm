package juhwan;
import java.util.Arrays;
import java.util.Comparator;

public class Programmers_가장_큰_수 {
    public static void main(String [] args){
        int[] numbers = {6,10,2};
        String answer = solution(numbers);
        System.out.println("answer = " + answer);
    }

    public static String solution(int[] numbers) {
        //1.int[] => string[] 으로 전환
        String[] strArr = new String[numbers.length];
        for(int i = 0 ; i < numbers.length; i ++){
            strArr[i] = Integer.toString(numbers[i]);
        }
        //2.Arrays.sort 기준을 두 문자를 합친 값을 비교해서 정렬 ( 내림차순으로 )
        Arrays.sort(strArr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        //3.정렬된 배열 합치기
        String answer="";
        for(int i = 0 ; i < strArr.length; i ++){
            answer += strArr[i];
        }
        //4.첫번째 자리에 0이 오는 경우 예외
        if(answer.charAt(0) == '0'){
            return "0";
        } else return answer;
    }
}
