package org.example.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution41 {

    public int[] solution(String[] id_list, String[] report, int k) {


        String [] reporting = new String[report.length];
        String [] reported = new String[report.length];

        int[] answer = new int[id_list.length];

        for(int i = 0; i<report.length;i++){
           reporting[i] = report[i].split(" ")[0];
           reported[i] = report[i].split(" ")[1];
        }


        Map<String, String> list = new HashMap<>();

        for(int i = 0; i<id_list.length;i++){
            for(int j = 0 ; j< report.length;j++){
                if(id_list[i].equals(reported[j])){
                    list.put(reporting[j],reported[j]);
                }
            }
            if(list.size()>=k){
                for(int u = 0;u<id_list.length;u++){
                    if(list.containsKey(id_list[u])){
                        answer[u]+=1;
                    }
                }

            }

            list.clear();
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution41 sol = new Solution41();

        sol.solution(new String[]{"muzi", "frodo", "apeach", "neo"},new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"},2 );
    }
}
