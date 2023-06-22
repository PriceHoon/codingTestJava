package level2;

public class Solution12 {

    public static int[] solution(int brown, int yellow) {

        //노란색으로 만들 수 있는 정사각 or 직사각형을 구한다.
        //그 직사각형의 가로 세로의 길이에 각각 2씩 더해준다. 끝..(포함해야하니까..)
        int tot = brown + yellow;

       for(int i = 1 ; i <= (int)Math.sqrt(brown+yellow);i++){

           if(tot%i==0){
               if((i-2) * ((tot / i)-2) == yellow){
                   System.out.println(tot/i+" "+i);
                   return new int[]{tot/i,i};
               }
           }
       }
       return new int []{0,0};

    }

    public static void main(String[] args) {
        System.out.println(solution(10,2));
    }
}
