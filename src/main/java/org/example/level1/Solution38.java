package org.example.level1;

import java.util.Arrays;

public class Solution38 {

    public int[] solution(int[] lottos, int[] win_nums) {

        //로또 ( 1 ~ 45 중 6개를 찍어서 맞히는 대표적인 로또 )
        //1등 : 6개 모두 일치
        //2등 : 5개 번호 일치
        //3등 : 4개 번호 일치
        //4등 : 3개 번호 일치
        //5등 : 2개 번호가 일치
        //6등 : 그외
        // 민우 로또 일부가 낙서가 되버림
        // 자신이 당첨 될 수 있는 최고 순위와 최저 순위를 알고 싶어짐
        // 알아 볼 수 없는 번호 : 0
        // 당첨 번호 주어질 때 가능한 최고 순위와 최저 순위

        int count = 0 ;
        int zeroCount = 0;
        int[] answer = new int[2];

        for(int my : lottos){
            if(my ==0){
                zeroCount++;
            }
            for(int win : win_nums){
                if(my == win){
                    count++;
                }

            }
        }

        switch (count){
            case 0 : answer[1]=6;break;
            case 1 : answer[1]=6;break;
            case 2 : answer[1]=5;break;
            case 3 : answer[1]=4;break;
            case 4 : answer[1]=3;break;
            case 5 : answer[1]=2;break;
            case 6 : answer[1]=1;break;

        }

        switch (count+zeroCount){
            case 0 : answer[0]=6;break;
            case 1 : answer[0]=6;break;
            case 2 : answer[0]=5;break;
            case 3 : answer[0]=4;break;
            case 4 : answer[0]=3;break;
            case 5 : answer[0]=2;break;
            case 6 : answer[0]=1;break;

        }

        return answer;
    }

    public static void main(String[] args) {
        Solution38 sol = new Solution38();
        System.out.println(sol.solution(new int[]{0,0,0,0,0,0},new int[]{38,19,20,40,15,25}));
    }
}
