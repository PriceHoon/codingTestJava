package org.example.level1;

public class Solution10 {

    public String solution(int[] food) {

        //칼로리가 낮은 순서대로 배치한 음식 배열 food
        //대회를 위한 음식의 배치를 나타내는 문자열을 리턴하게 해라
        StringBuffer str = new StringBuffer();

        for(int i=1;i< food.length;i++){

            for(int j=1;j<=food[i]/2;j++){

                str.append(i);
            }
        }
        String personOne = str.toString();
        str.append(0);
        String personTwo = str.reverse().toString();



        return personOne+personTwo;
    }

}
