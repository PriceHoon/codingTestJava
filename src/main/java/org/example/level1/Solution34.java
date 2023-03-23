package org.example.level1;

import java.util.Stack;

public class Solution34 {

    public int solution(int[][] board, int[] moves) {

        //크레인 인형뽑기 게임
        // 1x1 크기의 칸 사이즈, NxN크기의 정사각형 격자 위쪽에 크레인 있음
        // 오른쪽에 바구니가 있음
        // 각 칸에 인형이들어있으며 없는 칸은 빈칸이다
        // 크레인으로 각 격자의 맨위에 있는 인형부터 들어올릴 수 있다.
        // 집어올린 인형은 바구니 아래쪽 부터 쌓입니다.
        // 만약 같은 모양의 인형이 연속2개쌓이게 되면 사라짐
        // 크레인이 인형을 못집어 담는 경우는 없으나, 빈칸에 갔을 경우 아무일도 안일어남
        // 바구니는 모든이형이 들어갈 만큼 크다고 가정
        // 크레인을 작동시켜 없앤 인형의 수는 총 몇개인지 반환해라
        Stack<Integer> bucket = new Stack<>();
        int count = 0;

        for(int i=0;i<moves.length;i++){
            if(bucket.size()>1){
                int pop = bucket.pop();
                if(bucket.peek()==pop){
                    bucket.pop();
                    count+=2;
                }else {
                    bucket.push(pop);
                }
            }
            for(int j=0;j<board.length;j++){
                if(board[j][moves[i]-1]!=0){
                    bucket.push(board[j][moves[i]-1]);
                    board[j][moves[i]-1]=0;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution34 sol = new Solution34();
        System.out.println(sol.solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}},new int[]{1,5,3,5,1,2,1,4}));
    }
}
