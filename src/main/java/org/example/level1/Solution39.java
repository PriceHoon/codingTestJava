package org.example.level1;

import java.util.Arrays;

public class Solution39 {

    public int solution(int left, int right) {

        //두 정수 주어짐
        // 두 정수 사이의 약수 중

        int [] countA = new int[right-left+1];
        int answer = 0;

        for(int i = left ; i<=right;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    countA[i-left]+=1;
                }
            }

            if(countA[i-left]%2==0){
                answer+=i;
            }else{
                answer-=i;
            }
        }




        return answer;
    }

    public static void main(String[] args) {
        Solution39 sol = new Solution39();
        System.out.println(sol.solution(13,17));
    }
}
