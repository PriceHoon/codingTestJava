package org.example.level1;

public class Solution5 {

    public int solution(int num) {

        //콜라츠 추측
        //주어진 수가 1이될 때 까지 다음 작업 반복하면 모든 수를 1로 만들 수 있다는 추측
        //1. 입력한 수가 짝수라면 2로 나눈다.
        //2. 입력한 수가 홀수라면 3을 곱하고 1을 더한다
        //3. 결과로 나온 수에 같은 작업을 1이 될 때 까지 반복한다!
        // 4. 반복한 작업 수가 500번 넘으면 -1 반환
        // 처음에 res 를 int로 잡았을 때 곱하기 3 하는 작업에서 int의 자료형 범위를 넘어가서 오류가 생겼다... long타입 캐스팅..!
        long res = (long) num;
        int count = 0;
        while (true) {

            if (res == 1) {
                break;
            }

            if (count > 500) {
                return -1;
            }

            if (res % 2 == 0) {
                res = res / 2;
                count++;
            } else {
                res = (res * 3) + 1;
                count++;
            }

        }
        return count;

    }

}
