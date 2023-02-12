package org.example.level1;

public class Solution20 {

    public int solution(int n) {

       int total = n%10;
       int res = n;
       int div = 10;

       while (res>=10 && div <= n){

            total+=(res%(div*10))/div;
            div*=10;
       }

       return total;

    }

    public static void main(String[] args) {
        Solution20 sol = new Solution20();

        System.out.println(sol.solution(987));
    }

}
