package org.example.level1;

import java.util.Arrays;

public class Solution9 {

    public int solution(int[] d, int budget) {

        //1000원 부서 자원 -> 낮은금액이 아닌 그 1000원을 지원해줘야함!
        // 부서별 신청한 금액 들어있는 d배열, 예산 budget이 주어진다.
        // 최대 몇개의 부서에 물품을 지원할 수 있는지 구해라
        // 구상 : 작은 예산을 지원한 부서순으로 지원해주면 가장 많이 구할 수 있을 것..!

        Arrays.sort(d);
        int answer = 0;
        int res = budget;

        for(int dComponent : d){
            if(res < dComponent){
                break;
            }
            res-=dComponent;
            answer++;
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution9 sol = new Solution9();

        System.out.println(sol.solution(new int[]{2,2,3,3},10));
    }
}
