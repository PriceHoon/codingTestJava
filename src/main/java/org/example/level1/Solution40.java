package org.example.level1;

import java.util.Arrays;

public class Solution40 {

    public int solution(int[][] sizes) {

        //명함 지갑 만들기
        // 가장 큰 가로 80, 세로 70
        // 명함의 가로와 세로가 들어있는 2차원 배열 사이즈가 주어진다.
        // 일단 가로의 길이는 최대값이 맞을 것 같다.
        // 세로의 길이의 최대값을 가진 부분의 세로 길이가 최대 길이보다 작다면, 그 부분의 가로와 세로를 바꾼 후 세로의 최대값을 구한다.

        int x = 0;
        int y = 0;
        int max = 0;
        int temp = 0;
        int []yList = new int[sizes.length];
        for (int i =0;i<sizes.length;i++){
           x =  Math.max(x,sizes[i][0]);
        }

        for (int i =0;i<sizes.length;i++){
            y = Math.max(y,sizes[i][1]);
        }

        max= Math.max(x,y);


        for (int i =0;i<sizes.length;i++){
            for (int j =0;j<sizes.length;j++){
                temp = Math.max(temp,Math.min(sizes[i][0],sizes[i][1]));
            }
        }

        return max*temp;
    }

    public static void main(String[] args) {
        Solution40 sol = new Solution40();
        System.out.println(sol.solution(new int[][]{{60,50},{30,70},{60,30},{80,40}}));
    }
}
