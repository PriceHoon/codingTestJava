package org.example.level1;

class Solution {
    public String solution(String s) {
        //문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수!
        //s는 대소문자로만 구성되어 있으며, 대소문자는 소문자보다 작은 것으로 간주한다.
        char [] resAlphas = s.toCharArray();
        int count = s.length();
        char compare ;

        while(count > 0) {
           for(int i = 0 ; i < resAlphas.length-1;i++){
               if(resAlphas[i] < resAlphas[i+1]){
                   compare = resAlphas[i];
                   resAlphas[i] = resAlphas[i+1];
                   resAlphas[i+1] = compare;
               }
           }
            count--;
        }

        return String.valueOf(resAlphas);
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("Zbcdefg"));


    }
}