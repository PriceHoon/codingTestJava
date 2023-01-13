package org.example.level1;

import java.util.*;
import java.util.stream.Collectors;

public class Solution11 {

    public int solution(int k, int m, int[] score) {

        //사과는 상태에 따라 1~k점까지 점수로 분류(1최하,k최상)
        //사과 상자의 가격은 다음과 같이 결정된다.
        // 한 상자에 사과를 m개씩 포장한다.
        //상자에 담긴 사과 중 가장 낮은 점수 p점 인경우 사과 상자의 가격은 p * m입니다.
        // 과일 장수가 가능한 많은 사과를 팔았을 때 최대 이익을 구하고 싶다.

        int [] res = score;
        int sum = 0;

        Arrays.sort(res);
        List<Integer> list = new ArrayList<>();

        for(int re: res) {
            list.add(re);
        }

        Collections.reverse(list);

       for(int i=0;i<res.length/m;i++){
           sum+= list.get(m-1)*m;
           list = list.subList(m,list.size());
       }

        return sum;
    }

    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        System.out.println(sol.solution(3,4,new int[]{1,2,3,1,2,3,1})) ;
    }
}
