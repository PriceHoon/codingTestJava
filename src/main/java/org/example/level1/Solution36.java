package org.example.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution36 {
    public String solution(String new_id) {

        //카카오 아이디규칙에 맞지 않는 아이디를 입력했을 때 입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 것
        // 카카오 아이디 규칙
        // 아이디길이 3이상 15이하
        // 아이디는 알파벳 소문자,숫자,-,_,. 문자만 사용할 수 있다.
        // 단 .는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없다.

        //1. new_id의 모든 문자를 소문자로 치환한다.
        //2. new_id에서 소문자,숫자,-,_,.를 제외한 모든 문자를 제거한다.
        //3. new_id에서 .가 2번이상 연속된 부분을 하나의 마침표로 치환한다.
        //4. new_id에서 .가 처음이나 끝에 위치한다면 제거합니다.--
        //5. new_id가 빈 문자열 이라면,new_id에"a"를 대입합니다.--
        //6. new_id의 길이가 16이상이라면 ,new_id 의 첫 15개문자를 제외한 나머지 문자를 제외한 나머지 문자들을 모두 제거합니다.
        // 만약 제거 후 .가 new_id의 끝에 위치한다면 끝에 위치한 .를 제거합니다.
        //7. new_id의 길이가 2자 이하라면,new_id의 마지막문자를 new_id의 길이가 3이 될 떄 까지 반복해서 끝에 붙입니다.

        String step_one = new_id.toLowerCase();//1. 소문자 치환완료
        char[] step_two = step_one.toCharArray();
        List<Character> step_two_del = new ArrayList<>();

        int index =0;

        for(char two : step_two){

            if(step_two_del.isEmpty() &&((two>='a'&&two<='z')||(two>='0' && two<='9') || two=='-' || two =='_' || two=='.')){
                step_two_del.add(two);
                index++;
                continue;
            }
            if((two>='a'&&two<='z')||(two>='0' && two<='9') || two=='-' || two =='_' || two=='.'){
                if(two=='.' && step_two_del.get(index-1)=='.'){

                }else{
                    step_two_del.add(two);
                    index++;
                }

            }

        }


        if(step_two_del.size()>=3){
            if(step_two_del.get(0)=='.') step_two_del.remove(0);
            if(step_two_del.size()!=0&&step_two_del.get(step_two_del.size()-1)=='.') step_two_del.remove((step_two_del.size()-1));
        }

        if(step_two_del.size()<3){
            if(step_two_del.size()==0){
                step_two_del.add('a');
                step_two_del.add('a');
                step_two_del.add('a');
            }
            if(step_two_del.get(0)=='.') step_two_del.remove(0);
            if(step_two_del.size()!=0&&step_two_del.get(step_two_del.size()-1)=='.') step_two_del.remove((step_two_del.size()-1));
            if(step_two_del.size()==0){
                step_two_del.add('a');
                step_two_del.add('a');
                step_two_del.add('a');
            }
            for(int i=0;i<3-step_two_del.size();i++){

                step_two_del.add(step_two_del.get(step_two_del.size()-1));
            }
        }


       if(step_two_del.size()>15){
           step_two_del =  step_two_del.subList(0,15);

           if(step_two_del.get(0)=='.') step_two_del.remove(0);
           if(step_two_del.get(step_two_del.size()-1)=='.') step_two_del.remove((step_two_del.size()-1));
       }

       if(step_two_del.size()<3){
           for(int i=0;i<3-step_two_del.size();i++){

               step_two_del.add(step_two_del.get(step_two_del.size()-1));
           }
        }

       StringBuffer str = new StringBuffer();

       for(char ch : step_two_del){
           str.append(ch);
       }
        return str.toString();
    }

    public static void main(String[] args) {
        Solution36 sol = new Solution36();

        System.out.println( sol.solution("abcdefghijklmn.p"));
        System.out.println(".bat.y.abcdefghijklm".length());
    }
}
