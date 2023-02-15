package org.example.level1;

import java.util.Arrays;

public class Solution21 {

    public int[] solution(long n) {

        //자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해라!
        String nStr = String.valueOf(n);
        char [] nChar = nStr.toCharArray();
        char res =' ';
        int[] answer = new int[nChar.length];


        for(int i =0;i<nChar.length;i++){
            answer[i] = nChar[nChar.length-i-1] - '0';
        }
        return answer;
    }

    public static void main(String[] args) {

        Solution21 sol = new Solution21();
        Arrays.stream(sol.solution(12345)).forEach(s-> System.out.println(s));
    }
}
