package org.example.level1;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution7 {

    public int[] solution(int n, int m) {

        //두 수를 입력 받아 최대공약수와 최소공배수를 반환하는 함수
        //배열의 맨 앞에 최대공약수, 그 다음 최소공배수를 넣어 반환하면된다.

        int max_num = 1;
        int min_num;

        int compare = (n > m) ? n : m;

        for(int i=1;i<compare;i++){
            if(n%i==0 && m%i==0){
                max_num = i;
            }
        }
        min_num = (n*m)/max_num;


        int[] answer = {max_num,min_num};
        return answer;
    }


}
