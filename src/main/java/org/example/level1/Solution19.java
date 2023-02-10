package org.example.level1;

public class Solution19 {

    public String solution(String s) {

        //문자열 s는 한 개 이상의 단어로 구성되어있다.
        //각 단어는 한개 이상의 공백으로 구문된다.
        //각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴해라!
        StringBuffer str = new StringBuffer();
        char [] sToChar = s.toCharArray();
        int index = 0;
        for(char ch : sToChar){

            if(ch==' '){
                str.append(ch);
                index = 0;
                continue;
            }

            if(index%2==0){
                if('a'<=ch && ch <= 'z' ){
                    str.append((char)(ch-32));
                    index++;
                }else{
                    str.append(ch);
                    index++;
                }

            }else{
                if('A'<=ch && ch <= 'Z' ){

                    str.append((char)(ch+32));
                    index++;
                }else{
                    str.append(ch);
                    index++;
                }

            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        Solution19 sol = new Solution19();
        System.out.println(sol.solution("try hello"));
    }
}
