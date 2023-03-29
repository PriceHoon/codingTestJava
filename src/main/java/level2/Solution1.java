package level2;

import java.util.*;

public class Solution1 {


    int solution(int[][] land) {



        for (int i=1; i<land.length; i++) {

            land[i][0]+= Math.max(land[i-1][1],Math.max(land[i-1][2],land[i-1][3]));
            land[i][1]+= Math.max(land[i-1][0],Math.max(land[i-1][2],land[i-1][3]));
            land[i][2]+= Math.max(land[i-1][0],Math.max(land[i-1][1],land[i-1][3]));
            land[i][3]+= Math.max(land[i-1][0],Math.max(land[i-1][1],land[i-1][2]));
        }

        int answer = 0;
        for (int i=0; i<4; i++) {

            answer = Math.max(answer,land[land.length-1][i]);
        }



        return answer;
    }


    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        System.out.println(sol.solution(new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1}}));
    }
}
