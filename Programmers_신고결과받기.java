package juhwan;

import java.util.*;

public class Programmers_신고결과받기 {
    public static void main(String[] args) {
        String[] A = {"muzi", "frodo", "apeach", "neo"};
        String[] B = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int n = 2;
        solution(A, B, n);
    }

    public static void solution(String[] id_list, String[] report_, int k) {

        Set<String> reportSet = new HashSet<String>(Arrays.asList(report_));
        int[] answer = new int[id_list.length];
        ArrayList<String[]> reportArray = new ArrayList<String[]>();
        Map<String, Integer> idNumMap = new HashMap<>();

        for(int n = 0; n < id_list.length; n ++){
            idNumMap.put(id_list[n] , n);
        }

        for(String reportRecord: reportSet){
            String reporter = reportRecord.split(" ")[0];
            String defendant = reportRecord.split(" ")[1];
            String[] recordArr = {reporter, defendant};
            reportArray.add(recordArr);
        }

        for(String member : id_list){
            int count = 0;
            for(String[] records : reportArray){
                if(member.equals(records[1])){
                    count ++ ;
                }
            }

            if(count >= k) {
                for(String[] records : reportArray){
                    if(member.equals(records[1])){
                        answer[idNumMap.get(records[0])]++;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}

