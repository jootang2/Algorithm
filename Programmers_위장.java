package juhwan;

import java.util.HashMap;
import java.util.Iterator;

public class Programmers_위장 {
    public static void main(String[] args) {

        String[][] clothes = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };

        int answer = solution(clothes);

        System.out.println("answer = " + answer);


    }

    public static int solution(String[][] clothes) {
        //1. 옷을 종류별로 구분한다.
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] cloth : clothes){
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0)+1);
        }
            //2. 입지않는 경우를 추가한다.
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        while(it.hasNext()){
            answer *= it.next().intValue() + 1 ;
        }
            //3. 아무것도 입지않는 경우를 제외한다.

        return answer - 1;
    }
}

