package level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution14 {

    public static int solution(int[] people, int limit) {

        Arrays.sort(people);
        int answer = 0;
        int index = 0 ;
        int len = people.length-1;

        while(index<=len){
            if(people[index]+people[len]<=limit){
                answer++;
                len--;
                index++;
            }else{
                answer++;
                len --;
            }

        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{70, 50, 80, 50},100));
    }

}
