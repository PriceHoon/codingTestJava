package org.example.level1;

import java.awt.print.Pageable;
import java.util.LinkedList;
import java.util.List;

public class Solution55 {

    public String solution(String[] cards1, String[] cards2, String[] goal) {


        // 원하는 카드뭉치에서 순서대로 카드 한장씩 사용
        // 한번 사용한 카드는 다시 사용할 수 없음.
        List<String> card1List = new LinkedList<>();
        List<String> card2List = new LinkedList<>();
        List<String> goalList = new LinkedList<>();

        for(String one : cards1){
            card1List.add(one);
        }

        for(String two : cards2){
            card2List.add(two);
        }

        for(String goL : goal){
            goalList.add(goL);
        }

        for(String go : goal){
            if(card1List.size()!=0 && go.equals(card1List.get(0))){
                card1List.remove(0);
                goalList.remove(0);
                continue;

            } else if (card2List.size()!=0 && go.equals(card2List.get(0))) {
                card2List.remove(0);
                goalList.remove(0);
                continue;
            }
            return "No";
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Solution55 sol = new Solution55();
        System.out.println(sol.solution(new String[]{"i", "water", "drink"},new String[]{"want", "to"},new String[]{"i", "want", "to", "drink", "water"}));
    }
}
