package org.example.level1;

public class Solution23 {

    public long solution(long n) {
        //임이의 정수 n이 어떤수의 제곱근인지 구하는 식
        // 그 수가 x의 제곱근이라면 x+1의 제곱을 리턴

        double answer = Math.sqrt(n);

        if(Math.ceil(answer)!=(long) answer){
            return -1;
        }
//        long answer = -1;
//
//        if(n%2==0){
//            for(int i=2;i<n;i+=2){
//                if(i*i==n){
//                    answer = (i+1)*(i+1);
//                }
//            }
//        }else{
//            for(int i=1;i<n;i+=2){
//                if(i*i==n){
//                    answer = (i+1)*(i+1);
//                }
//            }
//        }
        return ((long)answer+1)*((long)answer+1);
    }

    public static void main(String[] args) {
        Solution23 sol = new Solution23();
        System.out.println(sol.solution(13));
    }
}
