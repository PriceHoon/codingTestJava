package org.example.level1;

import java.util.*;

public class Solution16 {

    public int solution(int[] arrays) {

        Map<Integer,Integer> countList = new HashMap<>();
        int[] sortedList = Arrays.stream(arrays).sorted().distinct().toArray();


        for(int i=0;i<sortedList.length;i++){
            int count = 0;
            for(int j=0;j<arrays.length;j++){
                if(sortedList[i]==arrays[j]){
                    count++;
                    countList.put(sortedList[i],count);
                }
            }
        }


        int maxValue = countList.get(sortedList[0]);
        int maxIndex = sortedList[0];

        for(int i=0;i<countList.size();i++) {

            if (countList.get(sortedList[i]) > maxValue) {
                maxValue = countList.get(sortedList[i]);
                maxIndex = sortedList[i];
            }
        }


        int numCount = 0;

      for(int count: countList.values()){
          if(count==maxValue){
              numCount++;
          }
      }

      if(numCount>1){
          return -1;
      }


        return maxIndex;
    }

    public static void main(String[] args) {
        Solution16 sol = new Solution16();
        System.out.println(sol.solution(new int[]{1,1,2,2,3,3,3}));
    }
}
