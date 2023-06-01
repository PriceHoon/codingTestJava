package level2;

public class Solution6 {


    public static int[] solution(String s) {

        int zeroCount = 0;
        int oneCount = 0;
        int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeroCount += 1;
                }
                if (s.charAt(i) == '1') {
                    oneCount += 1;
                }
            }
            count++;

            while(oneCount!=1){

                int res = oneCount;
                oneCount = 1;
                while(res!=1){
                    if(res%2==0){
                        res = res/2;
                        zeroCount+=1;
                    }else{
                        res = res/2;
                        oneCount+=1;
                    }
                }
                count++;
            }


        return new int[]{count,zeroCount};
    }


    public static void main(String[] args) {

        System.out.println(solution("01110"));
    }
}
