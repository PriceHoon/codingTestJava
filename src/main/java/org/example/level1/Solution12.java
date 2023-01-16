package org.example.level1;

import java.util.Arrays;

public class Solution12 {

    public int solution(int[] number) {

        //각 학생들은 정수 번호를 가지고 있다.
        // 3명의 학생의 정수 번호의 합이 0이 되면 이세명을 삼총사라 한다.
        // 정수의 배열 number가 주어질 때 삼총사가 될 수 있는 경우의 수를 리턴해라.
        //-2,3,0,2,-5
        //-2,0,2
        // 3,2,-5
        int answer = 0;

        for(int i=0;i<=number.length-3;i++){
            for(int j=i+1;j<number.length-1;j++){
                for(int k=j+1;k<number.length;k++){
                    if(number[i]+number[j]+number[k]==0){
                        answer++;
                         System.out.println(number[i]+" "+number[j]+" "+number[k]);

                    }

               }
            }
        }
        return answer;
    }
}
