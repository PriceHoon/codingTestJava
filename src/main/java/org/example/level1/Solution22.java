package org.example.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution22 {

    public long solution(long n) {
        //n을 받는다.
        //n의 각 자릿수를 큰것부터 작은순으로 정렬한 새로운 정수를 리턴해라
        long res = n;
        List<Long> list = new ArrayList<>();

        while(true){
            if(res<10){
                list.add(res);
                break;
            }
            list.add(res%10);
            res=res/10;

        }


        List<Long> sorted_arr = list.stream().sorted().collect(Collectors.toList());
        StringBuffer str = new StringBuffer();

        for(int i =1;i<=sorted_arr.size();i++){

            str.append(sorted_arr.get(sorted_arr.size()-i));
        }
        return Long.parseLong(str.toString());
    }


    public static void main(String[] args) {

        Solution22 sol = new Solution22();
        System.out.println(sol.solution(101));
    }
}
