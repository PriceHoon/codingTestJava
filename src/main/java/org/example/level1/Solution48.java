package org.example.level1;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.List;

public class Solution48 {

    public int solution(int[] ingredient) {

        int[] stack = new int[ingredient.length];
        int sp = 0;
        int answer = 0;
        for (int i : ingredient) {
            stack[sp++] = i;
            if (sp >= 4 && stack[sp - 1] == 1
                    && stack[sp - 2] == 3
                    && stack[sp - 3] == 2
                    && stack[sp - 4] == 1) {
                sp -= 4;
                answer++;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Solution48 sol = new Solution48();
        System.out.println(sol.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
    }
}
