package org.example.level1;

import java.awt.print.Pageable;
import java.util.*;

public class Solution61 {
    public String[] solution(String[] players, String[] callings) {

        // 앞에 선수를 추월 할 때 선수 이름을 부른다.
        // 1. calling 의 길이와 players의 최대 길이가 긴데 과연 계속 재배치하게 되면 런타임 오류가 나지 않을까?
        // 2. calling에서 같은 것끼리 묶어서 놓은 후 index를 계산하면 안될까? -> 안될 것 같음, 그러면 불림으로써 밀려나는 선수를 계산하지 못함
        // 3. 초반에 주어진 대로 선수 마다의 index를 담아놓고, 가감하면 될듯??

        //List<Integer> plIndex = new ArrayList<>();



        Map<String,Integer> initPlayerList = new HashMap<>();
        Map<Integer,String> initPlayerList2 = new HashMap<>();
        //int[] indexList = new int[players.length];
        String[] answer = new String[players.length];


        int index = 0;

        for(String play : players){
            initPlayerList.put(play,index);
            initPlayerList2.put(index,play);
            index ++ ;
        }

        for(String cal : callings){
            if(initPlayerList.get(cal)!=0){
                initPlayerList.put(initPlayerList2.get(initPlayerList.get(cal)-1),initPlayerList.get(cal));
                initPlayerList.put(cal,initPlayerList.get(cal)-1);
                initPlayerList2.put(initPlayerList.get(cal)+1,initPlayerList2.get(initPlayerList.get(cal)));
                initPlayerList2.put(initPlayerList.get(cal),cal);
            }
        }

        for(int i =0 ; i < initPlayerList2.size();i++){
            answer[i] = initPlayerList2.get(i);
        }


        return answer;
    }


    public static void main(String[] args) {

        Solution61 sol = new Solution61();

        System.out.println(sol.solution(new String[]{"mumu", "soe", "poe", "kai", "mine"},new String[]{"kai", "kai", "mine", "mine"}));
    }
}
