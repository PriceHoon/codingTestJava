package org.example.level1;

public class Solution26 {
    public double solution(int[] arr) {

        //정수 담고 있는 배열 arr
        //평균을 리턴해라
        int res = 0;
        for(int s : arr){
            res+=s;
        }

        double answer = res/(double)arr.length;
        return answer;
    }
}
