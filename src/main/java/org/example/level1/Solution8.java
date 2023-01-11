package org.example.level1;

import java.util.ArrayList;
import java.util.List;

public class Solution8 {

    public int solution(int n) {

        //자연수 n이 매개변수로 주어진다
        // n을 3진법 상에서 앞뒤로 뒤집은 후 , 이를 다시 10진법으로 표현한 수 리턴

        List<Integer> threeNumList = new ArrayList<>();

        int res = n;
        int answer = 0;

        while(res >= 3){
            threeNumList.add(res%3);
            res = res / 3;
        }
          threeNumList.add(res);
        int powCount = threeNumList.size();

       for(int i =0;i<threeNumList.size();i++){
            answer += threeNumList.get(i) * Math.pow(3,powCount-1);
            powCount--;
       }

        return answer;
    }

    public static void main(String[] args) {
        Solution8 sol = new Solution8();

        System.out.println(sol.solution(125));
    }
}
