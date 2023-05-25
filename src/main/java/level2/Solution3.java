package level2;

public class Solution3 {

    public static String solution(String s) {

        //단어를 구분할 필요가 있음 -> 공백 하나로 구분하려 했지만 -> 공백이 여러개일 수 있음 -> 하나로 구분안됨
        //근데 단어를 구분해야 첫 단어가 소문자인지 뭔지 구분할 수 있을텐데..
        // 최대 200자니까 배열로 푸는게 맞을듯?
        //
        String lowerS = s.toLowerCase(); // 일단 전부 소문자로 바꾸고 시작
        char[] sList = lowerS.toCharArray();//
        StringBuffer str = new StringBuffer();

        int startFlag = 0;

        for(char sL : sList){
            if(startFlag==0 && sL!=' ' && sL > '9'){
                startFlag=1;
                str.append((char)(sL-32));
            }else if(startFlag==0 && sL!=' ' && sL < '9'){
                startFlag=1;
                str.append(sL);
            }
            else if(sL==' '){
                startFlag=0;
                str.append(sL);
            }else{
                str.append(sL);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
    }
}
