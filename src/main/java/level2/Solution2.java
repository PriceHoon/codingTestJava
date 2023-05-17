package level2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution2 {

    public static String solution(String s) {

        //방법 1 . 우선순위 큐를 사용한다.
        //방법 2 . 숫자를 오름차순으로 정렬한다.
        //방법 3 . Math함수를 사용한다.


        StringBuffer str = new StringBuffer();

        int min = Integer.parseInt(s.split(" ")[0]);
        int max = Integer.parseInt(s.split(" ")[0]);

       for(int i = 0 ; i < s.split(" ").length ; i ++ ){

           min = Math.min(min,Integer.parseInt(s.split(" ")[i]));
           max = Math.max(max,Integer.parseInt(s.split(" ")[i]));
       }

       str.append(min);
       str.append(" ");
       str.append(max);

        return str.toString();
    }

    public static void main(String[] args) {

        System.out.println(solution("11 21 31 41"));
    }
}
