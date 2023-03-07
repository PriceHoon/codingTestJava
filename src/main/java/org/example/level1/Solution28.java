package org.example.level1;

import java.util.ArrayList;
import java.util.List;

public class Solution28 {

    //다트게임을 출시하려고한다.
    // 다트게임은 총 3번의 기회
    // 각 기회마다 얻을 수 있는 점수 ( 0 ~ 10 )
    // 점수와 함께 Single(S),Double(D),Triple(T)영역이 존재하고, 당첨시 1제곱 2제곱 3제곱 점수로 계산
    // 옵션으로 스타상(*), 아차상(#) 존재 -> 스타상 당첨시 해당 점수와 바로 전에 얻은 점수를 각각 2배로 만든다.
    // 아차상 당첨시 해당 점수가 마이너스 된다.
    // 스타상이 첫번째에도 나올 수 있음! -> 이 경우 첫번째 점수만 두배가 된다.
    // 스타상의 효과는 다른 스타상의 효과와 중첩될 수 있다.->이 경우 중첩된 스타상의 점수는 4배가된다.
    // 스타상의 효과는 아차상과 중첩될 수 있다. 이 경우 중첩된 아차상의 점수는 -2배가 된다.
    // S D T 은 점수마다 하나씩 존재한다.
    // 스타상, 아차상은 점수마다 둘중하나만 존재할 수 있으며, 존재하지 않을수도있다!

    // 옵션이 존재할 수도 안할수도 있으니 그 때 마다 케이스를 나눠서 작성해야할까?
    //
    public static int solution(String sb) {
        //StringBuilder sb = new StringBuilder();
        //sb.append(dartResult);
        int length = sb.length();

        int[] number = new int[3];
        int count = 0;
        int num = 0;
        String a = "";
        while(count<length){
            if(sb.charAt(count) != 'S' && sb.charAt(count) != 'D' && sb.charAt(count) != 'T' && sb.charAt(count) != '#' && sb.charAt(count) != '*'){
                a += sb.charAt(count);
            }
            else{
                if(sb.charAt(count)=='S'){
                    number[num] = (int) Math.pow(Integer.parseInt(a), 1);
                    a = "";
                    num++;
                }
                else if(sb.charAt(count)=='D'){
                    number[num] = (int) Math.pow(Integer.parseInt(a), 2);
                    a = "";
                    num++;
                }
                else if(sb.charAt(count)=='T'){
                    number[num] = (int) Math.pow(Integer.parseInt(a), 3);
                    a = "";
                    num++;
                }
                else if(sb.charAt(count)=='*'){
                    number[num-1]*=2;
                    if(num-2>=0){
                        number[num-2]*=2;
                    }
                }
                else if(sb.charAt(count)=='#'){
                    number[num-1]*=-1;
                }
            }
            count++;
        }

        return(number[0]+number[1]+number[2]);
    }

    public static void main(String[] args) {
        Solution28 sol = new Solution28();
        System.out.println(sol.solution("1D#2S*3S"));
    }
}
