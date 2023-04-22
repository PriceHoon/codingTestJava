package org.example.level1;

import java.util.ArrayList;
import java.util.List;

public class Solution50 {

    public int solution(String s) {

        //문자열 s가 입력 되었을 때 다음 규칙을 따라서 이 문자열을 여러 문자열로 분해하려한다.
        // 첫 글자를 읽는다 -> x
        // 이 문자열을 왼쪽에서 오른쪽으로 읽어 나가면서 x와x가 아닌 다른 글자들이 나온 횟수를 각각 센다.
        // 처음으로 두 횟수가 같아지는 순간 멈추고 , 지금까지 읽은 문자열을 분리한다.
        // s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복한다.
        // 남은 부분이 없다면 종료


        char [] ch = s.toCharArray();
        List<Character> list = new ArrayList<>();

        for(char c : ch){
            list.add(c);
        }


        int answer = 1;
        int countOne = 1;
        int countTwo = 0;
        char initNum = ch[0];


        for(int i =1; i < list.size()-1 ; i++){

            if(initNum==list.get(i)){
                System.out.println("eq"+list.get(i) + i);
                countOne++;
            }
            else if(initNum!=list.get(i)){
                System.out.println("Noeq"+list.get(i)+ i);
                countTwo++;
            }
            if(countTwo==countOne){
                list = list.subList(i+1,list.size());
                System.out.println(list);
                countTwo=0;
                countOne=1;
                initNum = list.get(0);
                i=0;
                answer++;
            }


        }



        return answer;
    }

    public static void main(String[] args) {

        Solution50 sol = new Solution50();
        System.out.println(sol.solution("banana"));
    }
}
