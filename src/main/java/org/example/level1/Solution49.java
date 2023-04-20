package org.example.level1;

public class Solution49 {

    public int solution(int number, int limit, int power) {

        //기사에게 1번부터 number까지의 번호가 있음
        // 기사들이 무기 구매하려함
        // 기사는 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매하려함
        // 공격력의 제한 수치 limit을 정하고, 그거보다 큰 공격력을 가진 무기를 구매해야 하는 기사는 협약 기관에서 정한 공격력을 가지는 무기를 구매해야함
        // 무기 공격력 1당 1kg의 철이 필요함
        // 무기점에서 만들어야 할 철의 무게를 구하려 함


        int weight = 1;

        for(int i=2;i<=number;i++){
            int count = 2;
            for(int j=2;j<=(int)Math.sqrt(i);j++){
                if(i%j==0 && (j!=i/j)){
                    count+=2;
                }
                else if(i%j==0 && (j==i/j)){
                    count+=1;
                }
                if(count>limit){
                    weight += power;
                    break;
                }


            }
            if(count <= limit) {
                weight += count;
            }
        }
        return weight;
    }


    public static void main(String[] args) {
        Solution49 sol = new Solution49();

        System.out.println(sol.solution(10,3,2));
    }
}
