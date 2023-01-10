package org.example.level1;

public class Solution6 {

    public long solution(int price, int money, int count) {

        //놀이기구의 원래 이용료는 price
        //이 놀이기구를 N번째 이용한다면 원래 이용료의 N배를 받기로 했다.
        //놀이기구를 count번 타게되면 현재 자신의 금액에서 얼마가 모자라는지 리턴하는 함수
        //만약 금액이 부족하지 않다면 0을 리턴
        long myMoney = money;

        for(int i=1;i<=count;i++){
            myMoney -= (price * i);
        }

        if(myMoney < 0){
            return -(myMoney);
        }else{
            return 0;
        }


    }

    public static void main(String[] args) {
        Solution6 sol = new Solution6();

        System.out.println(sol.solution(3,20,4));
    }

}
