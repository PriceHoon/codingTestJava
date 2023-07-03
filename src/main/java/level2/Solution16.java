package level2;

import java.awt.print.Pageable;
import java.util.Arrays;

public class Solution16 {

    public int solution(int[] arr) {


        Arrays.sort(arr);
        int tot = arr[0];

        for(int ar : arr){
            int max = sol(tot,ar);
            tot = max * (tot/max) * (ar/max);
            System.out.println(tot);

        }

        return tot;

    }

    public int sol(int a,int b){

        int first = Math.max(a,b);
        int second = Math.min(a,b);
        int res = 0;

        while(first%second!=0){
            res = first % second;
            first = second;
            second = res;
        }

        return second;



    }

    public static void main(String[] args) {

        Solution16 sol = new Solution16();
        System.out.println(sol.solution(new int[]{3,4,9,16}));
    }

}
