package org.example.level1;

public class Solution57 {

    public int solution(int n, int m, int[] section) {

        int index = 0;
        int answer = 0;

        if(section.length<2) return 1;

     for(int se : section){
         if(index < se){
             answer+=1;
             index = se+m-1;
         }
     }

       return answer;

    }

    public static void main(String[] args) {
        Solution57 sol = new Solution57();
        System.out.println(sol.solution(8,4,new int[]{2,3,6}));
    }
}
