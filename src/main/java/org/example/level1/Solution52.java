package org.example.level1;

public class Solution52 {

    public int solution(String t, String p) {

        //숫자로 이루어진 문자열 t,p가 주어진다. t에서 p와 깉이가 같은 부분 문자열 중에서

        int answer = 0;

        for(int i =0; i<t.length();i++){

            if(i+p.length()<=t.length()&&(Long.parseLong(t.substring(i,i+p.length()))<=Integer.parseInt(p))){
                answer++;
            }

        }

        System.out.println();

        return answer;
    }

}
