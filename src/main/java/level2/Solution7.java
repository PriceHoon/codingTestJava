package level2;

import com.sun.security.jgss.GSSUtil;

public class Solution7 {
    public static int solution(int n) {

        //주어진 자연수를 연속한 자연수의 덧셈으로 만들 수 있는 경우의 수를 구하는 문제

        int tot = 0;
        int count = 1;
        int startNum = 1;

        for(int i = startNum;i <= n/2 +1 ; i ++){


            if(n==1 || n == 2) return 1;
            tot+=i;

            if(tot==n){
                count++;
                tot = 0;
                i = startNum;
                startNum++;
                System.out.println(i);
            } else if (tot > n) {
                tot = 0;
                i = startNum;
                startNum++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(1));
    }
}
