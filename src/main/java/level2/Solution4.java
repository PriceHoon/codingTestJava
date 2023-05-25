package level2;

import java.util.Stack;

public class Solution4 {
     static boolean solution(String s) {

         Stack<Character> sStack = new Stack<>();
         char [] sArray = s.toCharArray();


         for(int i = 0;i < sArray.length; i++){
             if(sStack.size()!=0 && sArray[i]==')' && sStack.peek()=='('){
                 sStack.pop();
             }else{
                 sStack.push(sArray[i]);
             }
         }


         if(sStack.size()==0) return true;

         return false;


    }

    public static void main(String[] args) {
        System.out.println(Solution4.solution("(()("));
    }
}
