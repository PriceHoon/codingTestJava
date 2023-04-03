package org.example.level1;

import java.util.HashMap;
import java.util.Map;

public class Solution43 {

    public String solution(String[] survey, int[] choices) {

        //성격 유형 검사지를 만든다
        // 1~4번 지표로 결정됨
        // 성격유형은 총 16가지가 나올 수 있지?
        // 검사지에는 총 n개의 질문이 있고, 7개의 선택지가 있음 (매우 비동의 ~ 매우 동의)
        Map<String,Integer> list = new HashMap<>();

       list.put("R",0);
       list.put("T",0);
       list.put("C",0);
       list.put("F",0);
       list.put("J",0);
       list.put("M",0);
       list.put("A",0);
       list.put("N",0);


       for(int j = 0;j<survey.length;j++){
           if(choices[j]<4){
               switch (choices[j]){
                   case 1:
                       list.replace(survey[j].substring(0,1),list.get(survey[j].substring(0,1))+3);
                       break;
                   case 2:
                       list.replace(survey[j].substring(0,1),list.get(survey[j].substring(0,1))+2);
                       break;
                   case 3:
                       list.replace(survey[j].substring(0,1),list.get(survey[j].substring(0,1))+1);
                       break;
               }
           }else if(choices[j]>4){

               switch (choices[j]){
                   case 5:
                       list.replace(survey[j].substring(1,2),list.get(survey[j].substring(1,2))+1);
                       break;
                   case 6:
                       list.replace(survey[j].substring(1,2),list.get(survey[j].substring(1,2))+2);
                       break;
                   case 7:
                       list.replace(survey[j].substring(1,2),list.get(survey[j].substring(1,2))+3);
                       break;
               }
           }
       }

       StringBuffer str = new StringBuffer();
       if(list.get("R")>=list.get("T")){
           str.append("R");
       }else{
           str.append("T");
       }

        if(list.get("C")>=list.get("F")){
            str.append("C");
        }else{
            str.append("F");
        }

        if(list.get("J")>=list.get("M")){
            str.append("J");
        }else{
            str.append("M");
        }

        if(list.get("A")>=list.get("N")){
            str.append("A");
        }else{
            str.append("N");
        }

        return str.toString();
    }


    public static void main(String[] args) {
        Solution43 sol = new Solution43();
        System.out.println(sol.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"},new int[]{5, 3, 2, 7, 5}));
    }
}
