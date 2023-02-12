package org.example.level1;

public class Solution18 {

    public int solution(int n) {

        //정수 n을 입력받아 약수를 모두 더한 값을 리턴하는 함수
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                answer+=i;
            }

        }
        return answer;
    }
}
