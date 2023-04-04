package org.example.level1;

public class Solution45 {

    public int solution(int a, int b, int n) {

        //콜라 문제
        // 빈병 2개주면 콜라 1병주는 가게가 있다
        // 빈병이 2개 이하면 콜라 못받음
        // 빈병 a 가져가면 콜라 b병 주는 마트, 빈병 n개 갖다주면 몇병 받을 수 있나?
        int stock = 0;
        int coke = 0;

        stock+= ((n/a)*b) + n%a;
        coke+= ((n/a)*b);

        while(stock/a!=0){
            coke += (stock/a)*b;
            stock = ((stock/a)*b) + stock%a;
        }


        return coke;
    }

    public static void main(String[] args) {
        Solution45 sol = new Solution45();
        System.out.println(sol.solution(2,1,20));
    }
}
