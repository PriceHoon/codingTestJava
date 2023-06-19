package level2;

public class Solution11 {


    public  int[] solution(int n, String[] words) {

        //n : 끝말잇기에 참여하는 사람 수
        //words : 끝말잇기에 사용된 단어 배열

        int []nArr = new int[n+1];
        int index = 1;

        for(int i = 0; i < words.length ; i++){
            if(index > n) index = 1;
            nArr[index]+=1;

            if(i!=0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                System.out.println(index+" "+nArr[index]);
                return new int[]{index,nArr[index]};
            }else if(i!=0 && checkDuple(words,words[i],i)){
                System.out.println(index+" "+nArr[index]);
                return new int[]{index,nArr[index]};
            }
            index++;
        }

        return new int[]{0,0};
    }

    public  boolean checkDuple(String [] words, String word,int index){

        for(int i = 0 ; i < index;i++){
            if(words[i].equals(word)) return true;
        }
        return false;
    }
}
