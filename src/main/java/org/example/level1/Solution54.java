package org.example.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution54 {

    public String solution(String s, String skip, int index) {
        // 두 문자열 s, skip, 그리고 자연수 index가 주어질 때 다음 규칙에 따라 문자열을 만들려한다.

        // 문자열 s의 알파벳을 index만큼 뒤의 알파벳으로 바꿔준다.
        // index만큼 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아간다.
        // skip에 있는 알파벳은 제외하고 건너뛴다.

        char[] sList = s.toCharArray();
        char[] skipList = skip.toCharArray();
        List<Character> skList = new ArrayList<>();
        for (char skk : skipList) {
            skList.add(skk);
        }
        StringBuffer str = new StringBuffer();

        for (char sL : sList) {
            int indexTwo = index;
            while (indexTwo > 0) {

                sL += 1;
                if(sL > 'z') sL = 'a';

                if (skList.contains(sL)) {
                    continue;
                }

                    indexTwo-=1;
                }
            str.append(sL);
            System.out.println(sL);

            }

        return str.toString();
    }


    public static void main(String[] args) {
        Solution54 sol = new Solution54();

        sol.solution("zzzzzz", "abcdefghijklmnopqrstuvwxy", 6);
    }

}
