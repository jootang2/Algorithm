package juhwan;

public class Programmers_타겟_넘버 {
    static int[] numbers= {1,1,1,1,1};
    static int target = 3;
    static int answer = 0;
    public static void main(String[] args) {

        answer = solution(numbers, target);
        System.out.println("answer = " + answer);
    }

    public static int solution(int[] numbers, int target){

        dfs(0,0);
        return answer;
    }
    public static void dfs(int index , int sum){
        //탈출조건
        if(index == numbers.length){
            if(sum == target){
                answer++;
            }
            return;
        }
        //수행동작
        dfs(index+1 , sum+numbers[index]);
        dfs(index+1 , sum-numbers[index]);
    }
}
