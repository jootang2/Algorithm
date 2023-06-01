package juhwan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Programmers_베스트_앨범 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        int[] answer = solution(genres, plays);
        System.out.println("answer : " + Arrays.toString(answer));
    }

    public static int[] solution(String[] genres, int[] plays) {
        // 1. 장르별 플레이수를 매치시킨 해시맵 생성
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        // 2. 해시맵의 key 값을 arrayList 생성
        ArrayList<String> genre = new ArrayList<>();
        for (String key : map.keySet()) {
            genre.add(key);
        }
        System.out.println("genre = " + genre);
        // 3. key값에 해당하는 value의 내림차순으로 리스트 정렬
        Collections.sort(genre, ((o1, o2) -> map.get(o2) - map.get(o1)));
        System.out.println("map = " + map);
        System.out.println("genre = " + genre);
        // 4. 해당장르의 음악 중 play수가 가장 큰 인덱스를 찾는다
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < genre.size(); i++) {
            String g = genre.get(i);

            int max = 0;
            int firstIndex = -1;
            for (int j = 0; j < genres.length; j++) {
                if (g.equals(genres[j]) && max < plays[j]) {
                    max = plays[j];
                    firstIndex = j;
                }
            }
        // 5. 두번째로 큰 인덱스를 찾는다.
            max = 0;
            int secondIndex = -1;
            for (int j = 0; j < genres.length; j++) {
                if (g.equals(genres[j]) && max < plays[j] && j != firstIndex) {
                    max = plays[j];
                    secondIndex = j;
                }
            }
            list.add(firstIndex);
        // 6. 두번째 인덱스는 존재하지 않을 수도 있다.
            if (secondIndex >= 0) list.add(secondIndex);
        }


        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
