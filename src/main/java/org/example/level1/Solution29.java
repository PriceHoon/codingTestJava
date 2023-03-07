package org.example.level1;

import java.util.*;

public class Solution29 {


//        //마라톤 경기에 사람들이 참여
//        // 마라톤에 참여한 선수들이 담긴 배열 participant, 완주한 선수들 이름이 담긴 배열 completion이 주어질 때
//        // 완준하지 못한 선수들의 이름을 리턴해라!
//        // 그냥 반복문을 돌기에는 시간 복잡도가 너무 클 것 같고, 동명이인 처리가 애매하다.
//        // 키 값으로 검색할 수 잇는 해쉬로 변환?
//        int index = 0;
//
//        for(String part : participant){
//            if(Arrays.stream(participant).filter(s->s.equals(part)).count()!=Arrays.stream(completion).filter(j-> j.equals(part)).count()){
//                return part;
//            }
//
//        }
//        return null;

        public String solution(String[] participant, String[] completion) {
            String answer = "";
            LinkedList<String> retire = new LinkedList<>(Arrays.asList(participant));
            retire.sort(Comparator.naturalOrder());
            Arrays.sort(completion);
            for (int i = 0 ; i < completion.length ; i++) {
                if (retire.get(0).equals(completion[i])) {
                    retire.remove(0);
                }
                else if (retire.get(1).equals(completion[i])) {
                    retire.remove(1);
                }
            }
            answer = retire.get(0);
            return answer;
        }




}
