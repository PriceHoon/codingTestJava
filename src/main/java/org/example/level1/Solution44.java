package org.example.level1;

import javax.lang.model.type.ArrayType;
import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution44 {

    public String solution(String X, String Y) {

        //듀 정수 x,y의 임의의 자리에서 공통으로 나타나는 정수 k(0~9)들을 이용하여 만들 수 있는 가장 큰 수 = 짝꿍
        // 짝꿍 없으면 -1 , 0이면 0

        StringBuffer str = new StringBuffer();
        char [] x = X.toCharArray();
        char [] y = Y.toCharArray();


        int [] anX = new int []{0,0,0,0,0,0,0,0,0,0};
        int [] anY = new int []{0,0,0,0,0,0,0,0,0,0};

        for(char xL : x ){
            anX[xL-'0']+=1;
        }

        for(char yL : y ){
            anY[yL-'0']+=1;
        }

        for(int i = anX.length-1;i>=0;i--){
            if(anX[i]!=0 && anY[i]!=0){
                if (anX[i] <= anY[i]) {
                    for(int j = 0;j<anX[i];j++){
                        str.append(i);
                    }
                }else{
                    for(int j = 0;j<anY[i];j++){
                        str.append(i);
                    }
                }
            }
        }

        if(str.length()==0){
            return "-1";
        }

        if(str.charAt(0)=='0'){
            return "0";
        }

        return str.toString();

    }

    public static void main(String[] args) {
        Solution44 sol = new Solution44();
        System.out.println(sol.solution("5525","1255"));
    }
}
