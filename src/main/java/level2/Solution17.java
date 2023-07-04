package level2;

public class Solution17 {


    public long solution(int n) {

        //멀리 뛰기
        // 약간 피보나치 문제인 것 같다.(1칸 또는 2칸을 점프할 수 있다)
        // 1칸 , 2칸 , 3칸 ... 의 경우의 수를 전부 메모하며 더해야할 것 같다.
        //1칸 =1, 2칸 = 2, 3칸 = 3, 4칸 = 5

        long [] memo = new long[n+1];

        if(n==1) return 1;
        memo[1] = 1;
        memo[2] = 2;


        for(int i =3 ;i<=n;i++){
            memo[i] = (memo[i-1] + memo[i-2])%1234567;
        }

        return memo[n];

    }

    public static void main(String[] args) {
        Solution17 sol = new Solution17();
        System.out.println(sol.solution(1));
    }
}
