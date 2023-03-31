package org.example.level1;

public class Solution42 {

    public int solution(int n) {

        for(int i =1;i<n;i++){
            if(n%i==1){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution42 sol = new Solution42();
        System.out.println(sol.solution(12));
    }
}
