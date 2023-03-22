package org.example.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution33 {

    public int[] solution(int[] numbers) {

        //정수배열 numbers가 주어진다. numbers에서 서로다른 인덱스에 있는 두수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 리턴

        List<Integer> sumList = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(!sumList.contains(numbers[i]+numbers[j])){
                    sumList.add(numbers[i]+numbers[j]);
                }
            }
        }


        //int


        int temp = 0;
        for(int i=0;i<sumList.size();i++){
            for(int j=0;j<sumList.size();j++){
                if(j+1<sumList.size()){
                    if(sumList.get(j)>sumList.get(j+1)){
                        temp = sumList.get(j+1);
                        sumList.set(j+1, sumList.get(j));
                        sumList.set(j,temp);
                    }
                }


            }
        }

      int [] answer = new int[sumList.size()];

        for(int i=0;i<sumList.size();i++){
            answer[i] = sumList.get(i);
        }



        return answer;
    }

    public static void main(String[] args) {
        Solution33 sol = new Solution33();

        System.out.println(sol.solution(new int[]{5,0,2,7}));
    }
}
