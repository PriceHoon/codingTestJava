package org.example.level1;

public class Solution35 {
    public int solution(int[] a, int[] b) {


        //길이가 같은 1차원 배열 a,b가 매개변수로 주어짐

        int sum = 0;

        for(int i =0 ;i < a.length;i++){
            sum += a[i]*b[i];
        }
        return sum;
    }
}
