package org.example.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution51 {

    public int[] solution(String s) {

        // 문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 글자가 어디있는지 알고 싶다.
        //
        int[] answer = new int[s.length()];
        List<Character> findList = new ArrayList<>();
        char [] ch = s.toCharArray();
        findList.add(ch[0]);
        answer[0]= -1;

        for(int i = 1 ; i < s.length() ; i ++){

            if(findList.contains(ch[i])){
                answer[i] = i-findList.lastIndexOf(ch[i]);
            }else{
                answer[i] = -1;
            }
            findList.add(ch[i]);

        }

        return answer;
    }

    public static void main(String[] args) {
        Solution51 sol = new Solution51();
        System.out.println(sol.solution("banana"));
    }
}
