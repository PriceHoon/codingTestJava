package org.example.level1;

import java.util.ArrayList;
import java.util.List;

public class Solution56 {

    public int[] solution(String[] keymap, String[] targets) {

        List<Integer> answers = new ArrayList<>();

        for(String tar : targets){
            int count = 0;
            for(int i =0;i<tar.length();i++){
                int minIndex = 200;
                int zeroCount = 0;
                for(int j = 0; j < keymap.length;j++){
                    if(!keymap[j].contains(String.valueOf(tar.charAt(i)))){
                        zeroCount++;
                        continue;
                    }
                    minIndex = Math.min(minIndex,keymap[j].indexOf(tar.charAt(i))+1);


                }
                if(zeroCount == keymap.length){
                    answers.add(-1);
                    count = -1;
                    break;
                }
                count+=minIndex;
            }
            if(count!=-1)  {answers.add(count);}

        }


        int[] answer = new int[targets.length];

        for(int k = 0;k< answers.size() ; k ++){
            answer[k] = answers.get(k);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution56 sol = new Solution56();
        System.out.println(sol.solution(new String[]{"ABACD","BCEFD"},new String[]{"ABCD","AABB"}));
    }
}
