package org.example.level1;

public class Solution37 {

    public int solution(int[] absolutes, boolean[] signs) {

        int [] an = new int[absolutes.length];
        int sum = 0;

        for(int i =0;i<absolutes.length;i++){
            if(signs[i]==true){
                an[i] = absolutes[i];
            }else{
                an[i] = -absolutes[i];
            }
        }

        for(int j : an){
            sum+=j;
        }

        return sum;
    }
}
