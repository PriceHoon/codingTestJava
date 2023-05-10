package org.example.level1;

import java.awt.print.Pageable;

public class Solution59 {

    public int[] solution(String[] park, String[] routes) {

        // 일단 시작 지점을 저장하자.
        int [] startPoint = new int[2];
        int index = 0;

        for(String pa : park){
            if(pa.contains("S")){
                startPoint[0] = pa.indexOf("S");
                startPoint[1] = index;
            }
            index++;
        }



        // park의 길이 => x : park[i]의 길이, y : park배열 전체의 길이


                for(String ro : routes){
                    String direction = ro.split(" ")[0];
                    int distance  = Integer.parseInt(ro.split(" ")[1]);

                    switch (direction){
                        case "N" :
                            if(startPoint[1] - distance >=0 && north(park,startPoint[0],startPoint[1],distance)){
                                startPoint[1] = startPoint[1] - distance;
                            }
                            break;
                        case "S" :
                            if(startPoint[1] + distance <= park.length-1 && south(park,startPoint[0],startPoint[1],distance)){
                                startPoint[1] = startPoint[1] + distance;
                            }
                            break;

                        case "W" :
                            if(startPoint[0] - distance >=0 && !park[startPoint[1]].substring(startPoint[0] - distance,startPoint[0]).contains("X")){
                                startPoint[0] = startPoint[0] - distance;
                            }
                            break;

                        case "E" :
                            if(startPoint[0] + distance <= park[startPoint[1]].length()-1 && !park[startPoint[1]].substring(startPoint[0],startPoint[0] + distance +1).contains("X")){
                                startPoint[0] = startPoint[0] + distance;

                            }
                            break;
                    }
                }


        int[] answer = {startPoint[1],startPoint[0]};
        System.out.println(startPoint[1] + " "+ startPoint[0]);
        return answer;
    }

    public boolean south(String[] pa,int startX,int startY,int dis){
        for(int i = startY; i <= startY + dis ;i++ ){
            if(pa[i].charAt(startX) == 'X'){
                return false;
            }
        }
        return true;
    }

    public boolean north(String[] pa,int startX,int startY,int dis){

        for(int i = startY; i >= startY - dis ;i-- ){
            if(pa[i].charAt(startX) == 'X' ){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Solution59 sol = new Solution59();
        System.out.println(sol.solution(new String[]{"XXX","XSX","XXX"},new String[]{"E 1"}));
    }
}
