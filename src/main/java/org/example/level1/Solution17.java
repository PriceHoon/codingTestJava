package org.example.level1;

public class Solution17 {

    //어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식
    //AB 1밀면 = BC , 3밀면 DE가 된다. z +1 = a

    public String solution(String s, int n) {

        char[] input = s.toCharArray();
        StringBuffer str = new StringBuffer();

        for(char alpha : input){
            if(alpha==' '){
                str.append(alpha);
                continue;
            }
            if('a'<=alpha && 'z'>=alpha){
                if(alpha > 'z'-n){
                    str.append((char)('a'+(alpha-('z'-n+1))));
                }else{
                    str.append((char)(alpha+n));
                }
            }else{
                if(alpha > 'Z'-n){
                    str.append((char)('A'+(alpha-('Z'-n+1))));
                }else{
                    str.append((char) (alpha+n));
                }
            }

        }



        return str.toString();
    }

    public static void main(String[] args) {
        Solution17 sol = new Solution17();
        System.out.println(sol.solution("a B z",4));
    }
}
