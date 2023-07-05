package level2;

import java.util.Arrays;

public class Solution18 {

    public int solution(int k, int[] tangerine) {

        //가장 많이 나온숫자를 k만큼 담으면 될 것 같은데..
        //근데 원소가 10000000까지인데...이걸 다세..?

        Arrays.sort(tangerine);
        int [] tanNum = new int[tangerine[tangerine.length-1]+1];
        int tot = 0;
        int answer = 0;
        int index = tangerine[tangerine.length-1];

        for(int tan : tangerine){
            tanNum[tan]++;
        }
        Arrays.sort(tanNum);

        while(tot < k){
            tot+=tanNum[index];
            answer++;
            index--;
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution18 sol = new Solution18();
        System.out.println(sol.solution(2,new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }
}
