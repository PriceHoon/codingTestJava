package level2;

public class Solution8 {

    public static int solution(int n) {

        String nB = Integer.toBinaryString(n);
        int nBCount = 0;
        int plus = 1;

        for(int i = 0 ; i < nB.length(); i++){
            if(nB.charAt(i)=='1') nBCount++;
        }

        while(true){
            int plusCount = 0 ;
            String nBPlus = Integer.toBinaryString(n + plus);
            for(int j = 0 ; j < nBPlus.length() ; j ++){
                if(nBPlus.charAt(j)=='1') plusCount++;
            }

            if(nBCount == plusCount) return n + plus;
            plus++;
        }


    }


    public static void main(String[] args) {

        System.out.println(solution(78));
    }
}
