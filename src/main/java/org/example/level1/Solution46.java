package org.example.level1;

public class Solution46 {

    public int solution(String[] babbling) {

        // "aya","ye","woo","ma"네가지 발음을 조합해서 만들 수 있는 발음 밖에 하지 못한다.
        //

        int answer = 0;


        for(String bab : babbling){

            if(bab.length()<2) continue;

            if(subList(bab," ")){
                answer+=1;
            }
        }
        return answer;
    }

    public boolean subList(String component,String beforeCom){


        String before = beforeCom;

        if(component.startsWith("aya") && before!="aya"){
            return subList(component.substring(3,component.length()),"aya");
        }
        if(component.startsWith("ye") && before!="ye"){
           return subList(component.substring(2,component.length()),"ye");
        }
        if(component.startsWith("woo") && before!="woo"){
            return subList(component.substring(3,component.length()),"woo");
        }
        if(component.startsWith("ma") && before!="ma"){
            return subList(component.substring(2,component.length()),"ma");
        }
        if(component.length()!=0) return false;

        return true;

    }


    public static void main(String[] args) {
        Solution46 sol = new Solution46();
        System.out.println(sol.solution(new String[]{"aya", "maayama", "mama", "maa"}));
    }
}
