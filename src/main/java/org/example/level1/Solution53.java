package org.example.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution53 {

    public int[] solution(String today, String[] terms, String[] privacies) {

        //개인 정보 약관에 따른 유효기간이 있고 지나면 파기 해야함
        // 모든 달은 28일까지 있다고 가정한다.
        // 오늘 날짜 -> today -> YYYY.MM.DD
        // 약관의 유효기간을 담은 terms -> 길이 1이상 20이하 -> 약관 종류 유효기간의 형태(A~Z)중복되지 않음(유효기간은 month)
        // 수집된 개인 정보를 담은 privacies


        List<Integer> list = new ArrayList<>();
        int index = 1;

        for(String pri : privacies){
            String pDay = pri.split(" ")[0];
           String pAlpha = pri.split(" ")[1];


           for(String te : terms){
               String tAlpha = te.split(" ")[0];
               if( pAlpha.equals(tAlpha) ){
                  String tDay= te.split(" ")[1];
                   if(Integer.parseInt(today.split("\\.")[0]) > Integer.parseInt(pDay.split("\\.")[0])) {
                       int totDay = (Integer.parseInt(today.split("\\.")[0]) - Integer.parseInt(pDay.split("\\.")[0])) * 12 + Integer.parseInt(today.split("\\.")[1]);
                       int subDay = Integer.parseInt(pDay.split("\\.")[1]) + Integer.parseInt(tDay);
                       if(totDay>subDay){
                           System.out.println("big"+totDay+" "+subDay);
                           list.add(index);
                       }else if(totDay==subDay && (Integer.parseInt(today.split("\\.")[2]) > Integer.parseInt(pDay.split("\\.")[2])-1)){
                           list.add(index);
                       }
                   }else{
                        int totDay =  Integer.parseInt(today.split("\\.")[1]);
                        int subDay = Integer.parseInt(pDay.split("\\.")[1]) + Integer.parseInt(tDay);
                       if(totDay>subDay){
                           System.out.println("small"+totDay+" "+subDay);
                           list.add(index);
                       }else if(totDay==subDay && (Integer.parseInt(today.split("\\.")[2]) > Integer.parseInt(pDay.split("\\.")[2])-1)){
                           list.add(index);
                       }
                   }
               }

           }
           index++;
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i< list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution53 sol = new Solution53();
        System.out.println(sol.solution("2020.01.01",new String[]{"Z 3", "D 5"},new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"}));
    }
}
