package level2;

import java.util.Arrays;

public class Solution5 {

    public static int solution(int []A, int []B)
    {

        int min = 0;
        int j = A.length;

        //A배열과 B배열에서 임의로 한개씩 뽑아 곱해서 배열 길이만큼 더한 값의 최소값을 구하는 문제 => 모든 케이스마다 다를 수 있으므로 전부 구해서 최소값을 찾아야함 DP같은 느낌
        //아니면 A에서 최소를 뽑고, B에서 최대를 뽑아서 곱 누적을 시키면 되려나?

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0 ; i < A.length ;i ++){
            min+= A[i] * B[j-1];
            j--;
        }

        return min;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,4,2},new int[]{5,4,4}));
    }
}
