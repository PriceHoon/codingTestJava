package org.example.level1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution31 {

    public int solution(int n, int[] lost, int[] reserve) {

        int answer1 = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        int re_lost_count=0;

        List<Integer> correctListLost = new LinkedList<>();
        List<Integer> correctListReserve = new LinkedList<>();

        for(int re : reserve) {
            for (int lo : lost) {

                if(re == lo){
                    correctListLost.add(lo);
                    correctListReserve.add(re);
                    re_lost_count+=1;
                }
            }
        }



        for(int re : reserve){
            for(int lo : lost){

                if(re-1<=lo && lo<=re+1){
                    if(correctListLost.contains(lo)){
                        continue;
                    }
                    if(correctListReserve.contains(re)){
                        continue;
                    }
                    answer1+=1;
                    correctListLost.add(lo);
                    correctListReserve.add(re);
                }
            }
        }


        answer1+= n-lost.length+re_lost_count;
        return answer1;

    }

    public static void main(String[] args) {
        Solution31 sol = new Solution31();
        System.out.println(sol.solution(4,new int[]{2,3},new int[]{3,4}));
    }
}
