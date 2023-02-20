package org.example.level1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution24 {

    public int[] solution(int[] arr) {

        //정수를 저장한 배열 arr에서 가장 작은 수를 제외한 배열을 리턴해라!
        int res = arr[0];
        List<Integer> sortList = new ArrayList<>();

        for(int a : arr){
            if(res>a){
                res=a;
            }
        }

        for(int a : arr){
            if(res!=a){
                sortList.add(a);
            }
        }

        if(sortList.size()==0){
            return new int[]{-1};
        }

        int [] s = new int[sortList.size()];

        for(int i=0;i<sortList.size();i++){
            s[i] = sortList.get(i);
        }

        return s;
    }


    public static void main(String[] args) {

        Solution24 sol = new Solution24();
        Arrays.stream(sol.solution(new int[]{4, 3, 2, 1})).forEach(System.out::println);
    }
}
