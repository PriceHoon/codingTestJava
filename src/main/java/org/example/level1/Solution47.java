package org.example.level1;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Solution47 {

    public int[] solution(int k, int[] score) {



        int[] minScores = new int[score.length];

        if(k<score.length) {
            int[] answer = new int[k];
            int min = score[0];
            for (int i = 0; i < k; i++) {
                answer[i] = score[i];
                minScores[i] = Math.min(min,score[i]);
            }

            Arrays.sort(answer);

            for(int j = k ; j < score.length; j++){
                if(score[j]>answer[0]){
                    answer[0] = score[j];
                    Arrays.sort(answer);
                }
                minScores[j] = answer[0];
            }
        }else{
            int min = score[0];
            for(int i = 0; i<score.length;i++){
                minScores[i] = Math.min(min,score[i]);
                min = minScores[i];
            }

        }
        return minScores;
    }

    public static void main(String[] args) {
        Solution47 sol = new Solution47();
        System.out.println(sol.solution(9,new int[]{10, 30, 40, 3, 0, 20, 4}));
    }

}
