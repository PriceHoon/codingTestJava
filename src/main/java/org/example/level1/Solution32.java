package org.example.level1;

import java.lang.reflect.Array;
import java.util.*;

public class Solution32 {

    public int[] solution(int N, int[] stages) {

        //새로운 게임의 문제점 : 기존 유저와 신규유저의 스테이지 격차가 심하다.
        // 이문제를 어떻게 해결? -> 동적으로 게임의 시간을 늘려서 난이도를 조절하자!
        // 실패율을 구하는 부분에서 위기에 빠졌다.
        // 실패율 : 스테이지에 도달했으나 아직 클리어 하지 못한 유저의 수 / 스테이지에 도달한 플레이어의 수
        // 전체 스테이지의 갯수 : N , 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 남긴 배열 stages가 주어질 때, 실패율이 가장 높은 스테이지 부터 내림차순으로 리턴
        int [] bottom = new int[N];
        int [] top =new int[N];
        double [] failPercent = new double[N];
        int temp = 0;

        int [] answer = new int[N];
        Arrays.sort(stages);

        for(int i=0;i<N;i++){

            for(int st : stages){
                if(i+1<=st){
                    bottom[i]+=1;
                }
            }
        }


        for(int i=0;i<N;i++){

            for(int st : stages){
                if(st==N+1){
                    continue;
                }
                if(i+1==st){
                    top[i]+=1;
                }
            }
        }

        for(int i=0;i<N;i++){
            answer[i] = i+1;
            failPercent[i] = (double) top[i]/bottom[i];
        }

        double tempMax = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N - i; j++) {
                if (failPercent[j - 1] < failPercent[j]) {
                    tempMax = failPercent[j - 1];
                    failPercent[j - 1] = failPercent[j];
                    failPercent[j] = tempMax;

                    temp = answer[j - 1];
                    answer[j - 1] = answer[j];
                    answer[j] = temp;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution32 sol = new Solution32();
        System.out.println(sol.solution(5, new int[]{2,1,2,6,2,4,3,3}));
        Arrays.stream(sol.solution(5, new int[]{2,1,2,6,2,4,3,3})).forEach(s-> System.out.println(s));
    }
}
