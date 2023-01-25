package org.example.level1;

public class Solution14 {

    public String solution(int n) {

        //길이 n 수박수박수박수.. 같은패턴을 유지하는 문자열을 리턴하는 함수

        StringBuffer str = new StringBuffer();

        for(int i = 1 ; i<=n;i++){
            if(i%2==0){
                str.append("박");
                continue;
            }
            str.append("수");


        }

        return str.toString();
    }
}
