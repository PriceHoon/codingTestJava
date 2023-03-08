package org.example.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution30 {

    public int[] solution(int[] answers) {

        //모의 고사
        // 수포자 3명이 모의고사 수학 문제를 찍으려고 한다.
        // 1번문제부터 마지막 문제까지 정답이 순서대로 들은 배열 answers가 주어질 때 가장 많은 문제를 맞힌사람은 누구인지 배열에 담아 리턴
        //1번 : 1,2,3,4,5.. 반복
        //2번 : 2,1,2,3,2,4,2,5..반복
        //3번 : 3,3,1,1,2,2,4,4,5,5 .. 반복
        int index = 0;
        int f_count = 0;
        int tw_count = 0;
        int th_count = 0;


        int [] one = new int[]{1,2,3,4,5};
        int [] two = new int[]{2,1,2,3,2,4,2,5};
        int [] three = new int[]{3,3,1,1,2,2,4,4,5,5};

        for(int an : answers){

            if(an == one[index]){
                f_count+=1;
            }
            if(index== one.length-1){
                index = 0;
                continue;
            }
            index++;
        }

        index = 0;

        for(int an : answers){

            if(an == two[index]){
                tw_count+=1;
            }
            if(index== two.length-1){
                index = 0;
                continue;
            }
            index++;
        }

        index = 0;

        for(int an : answers){

            if(an == three[index]){
                th_count+=1;
            }
            if(index== three.length-1){
                index = 0;
                continue;
            }
            index++;
        }
        int [] sor = new int[]{f_count,tw_count,th_count};
        int [] sor2 = Arrays.stream(sor).sorted().toArray();
        Long count = Arrays.stream(sor).filter(s -> s==sor2[2]).count();
        Arrays.stream(sor2).forEach(s-> System.out.println(s));

        if(count==1){
            if(sor2[2]==f_count) return new int[]{1};
            if(sor2[2]==tw_count) return new int[]{2};
            if(sor2[2]==th_count) return new int[]{3};
        } else if (count ==2) {
            if(sor2[2]==f_count && sor2[2] ==tw_count) return new int[]{1,2};
            if(sor2[2]==f_count && sor2[2] ==th_count) return new int[]{1,3};
            if(sor2[2]==tw_count && sor[0] ==th_count) return new int[]{2,3};
        } else if(count==3){
            if(sor2[2]!=0){
                return new int[]{1,2,3};
            }
        }
        return new int[]{};

    }

    public static void main(String[] args) {
        Solution30 sol = new Solution30();

       Arrays.stream(sol.solution(new int[]{1,2,5,5,2})).forEach(s-> System.out.println(s));
    }
}
