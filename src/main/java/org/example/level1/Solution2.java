package org.example.level1;

class Solution2 {
    boolean solution(String s) {

        //대문자 소문자가 섞여있는 문자열 s가 주어진다!
        // 문자열 s에 'p','y'의 개수를 비교해 같으면 트루, 틀리면 폴스! // 둘다 없으면 항상 트루!
        char[] reses = s.toLowerCase().toCharArray();
        int count_p = 0;
        int count_y = 0;


        for (char res : reses) {
            if (res == 'p') {
                count_p++;
            } else if (res == 'y') {
                count_y++;
            }
        }

        if (count_y == count_p) {
            return true;
        }


        return false;
    }
}
