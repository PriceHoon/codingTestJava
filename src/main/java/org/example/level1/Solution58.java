package org.example.level1;

public class Solution58 {
    public int[] solution(String[] wallpaper) {

        // 최소한의 드래그!
        // 모든 바탕화면 파일을 포함하면서 드래그를 하려는 조건을 생각해보자.
        // 드래그시작의 위치 결정 = x : 파일이 있는 곳에서 가장 작은 x값, y : 파일이 있는 곳에서 가장 적은 y값
        // 드래그 끝점의 위치 결정 = x : 파일이 있는 곳에서 가장 먼 x값, y : 파일이 있는 곳에서 가장 큰 y값

        int[] answer = new int[4];


        int lnx = 51;
        int lny = 51;
        int rnx = 0;
        int rny = 0;
        int index = 0;

        for(String wx : wallpaper){
            if(wx.contains("#")){

               lnx = Math.min(lnx,index);
               lny = Math.min(lny,wx.indexOf('#'));

               rnx = Math.max(rnx,index);
               rny = Math.max(rny,wx.lastIndexOf('#'));

            }
            index++;
        }
      answer[0] = lnx;
      answer[1] = lny;
      answer[2] = rnx + 1;
      answer[3] = rny + 1;


        return answer;
    }


    public static void main(String[] args) {
        Solution58 sol = new Solution58();

        sol.solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."});
    }
}
