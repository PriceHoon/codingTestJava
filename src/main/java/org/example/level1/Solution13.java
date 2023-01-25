package org.example.level1;

public class Solution13 {

    int left =10;
    int right = 12;
    int leftDistance = 0;
    int rightDistance = 0;
    StringBuffer resLR = new StringBuffer();

    public String solution(int[] numbers, String hand) {

        //처음 -> 왼쪽엄지: * , 오른쪽엄지 : #
        //엄지 손가락은 상하좌우 4가지 방향으로만 이동할 수 있음 키패드 이동 한칸은 거리로 1로 친다.
        // 왼쪽열 1,4,7을 입력할 때에는 왼손 엄지 사용
        // 오른쪽 열 3,6,9를 입력할 때는 오른손 엄지손가락 사용
        // 가운대열 2,5,8,0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 손가락 사용
        // 만약 두 엄지손가락의 거리가 같다면, 오른손 잡이 : 오른손 엄지, 왼손잡이 : 왼손 엄지 사용
        // 순서대로 누를번호 배열 numbers가 주어진다 , 왼손잡이 인지 오른손 잡이 인지 hand가 주어짐
        //각 번호를 누르는 손가락이 왼손인지 오른손인지 리턴해라.

        // 일단 배열을 순차적으로 진행하면서 왼손 오른손을 판단해서 넣어줘야하며, 현재 위치도 계속해서 업데이트 해줘야할듯..?



        for(int num : numbers){
            if(num == 0){
                num = 11;
            }
            if(num==1 ||num == 4 || num ==7){
                left = num;
                resLR.append("L");
                System.out.println("1,4,7?? num:"+left);
                continue;

            } else if (num ==3 ||num ==6 ||num ==9) {
                right = num;
                resLR.append("R");
                System.out.println("3,6,9?? num:"+right);
                continue;
            }

           if(num < left){
               leftDistance = ((left - num) / 3) + ((left - num) % 3);
           }else if(num >= left){
               leftDistance = ((num -left) / 3) + ((num -left) % 3);
           }

           if(num < right){
               rightDistance = ((right - num) / 3) + ((right - num) % 3);
           }else if(num >= right){
               rightDistance = ((num - right) / 3) + ((num - right) % 3);
           }

           getResult(hand,num,leftDistance,rightDistance);
            System.out.println("?? num:"+num+left+right);


        }


        return resLR.toString();
    }

    public void getResult(String hand,int num,int leftD,int rightD){

        if(leftD < rightD){
            resLR.append("L");
            left = num;
        } else if (leftD > rightD) {
            resLR.append("R");
            right = num;
        }else{
            if(hand.equals("right")){
                resLR.append("R");
                right = num;
                return;
            }
            resLR.append("L");
            left = num;
        }
    }

    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        System.out.println(sol.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2},"left"));
    }
}
