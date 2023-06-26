package level2;


public class Solution13 {


    public static int solution(int n, int a, int b)
    {


        //n = 참여자수
        //a = a번 참가자
        //b = b번 참가자

        //나누기 2 해서 round돌리면 되는데 문제는 같은 대진일 때 -1, +1로는 잡을 수 없다..
        //a가 b보다 번호가 작은 경우 = a+1 = b 가 되는경우
        //b가 a보다 번호가 작은 경우 = b+1 = a 가 되는 경우
        int a_res = a ;
        int b_res = b;
        int count = 0;

        while(true){

            if(a_res%2==0 && a_res-1==b_res){
                return count+1;
            }else if(a_res%2!=0 && a_res+1 == b_res)return count+1;

            a_res =(int) Math.round(a_res/2.0);
            b_res = (int) Math.round(b_res/2.0);

            count++;
            if(count>n/2) break;
        }


        return 0;

    }

    public static void main(String[] args) {

        System.out.println(solution(8,4,5));
    }

}
