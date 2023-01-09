package org.example.level1;

public class Solution3 {

    public String solution(String[] seoul) {


        //문자열 배열 seoul 중 Kim의 위치 x를 찾아 김서방은 x에 있다는 문자열 반환하기

        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                return "김서방은"+i+"에 있다";
            }
        }
        return "error";
    }
}
