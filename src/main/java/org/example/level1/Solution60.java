package org.example.level1;

public class Solution60 {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {


        //
        int[] answer = new int[photo.length];

        for(int i = 0; i < photo.length ; i++){
            int num = 0 ;

            for(int j = 0 ; j < photo[i].length;j++){

                for(int k = 0 ; k < name.length ; k++){

                    if(photo[i][j].equals(name[k])){
                        num+=yearning[k];
                    }
                }
            }
            answer[i] = num;

        }

        return answer;

    }

    public static void main(String[] args) {
        Solution60 sol = new Solution60();
        System.out.println(sol.solution(new String[]{"may", "kein", "kain", "radi"},new int[]{5, 10, 1, 3},new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}}));
    }
}
