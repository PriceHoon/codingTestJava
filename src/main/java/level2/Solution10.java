package level2;

import java.util.Stack;

public class Solution10 {

    public static int solution(String s)
    {

        //짝지어 진 숫자를 제거하는 문제 = 괄호 맞추기나 인형뽑기랑 비슷한듯 = 스텍 자료구조 사용하면 좋을듯

        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < s.length();i++){
            if(!st.empty() && st.peek()==s.charAt(i)){
                st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }

        if(st.isEmpty()) return 1;
        else return 0;


    }

    public static void main(String[] args) {
        System.out.println(solution("cdcd"));
    }
}
