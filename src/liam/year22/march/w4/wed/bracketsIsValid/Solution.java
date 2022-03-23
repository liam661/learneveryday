package liam.year22.march.w4.wed.bracketsIsValid;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/23 15:11
 **/
public class Solution {
    public boolean bracketsIsValid(String s){
        int len = s.length();
        //用来存]->[,}->{,)->(
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')','(');
        hashMap.put('}','{');
        hashMap.put(']','[');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < len; i++){
            Character ch = s.charAt(i);
            if(hashMap.containsKey(ch)){
               if(stack.isEmpty() || stack.peek() != hashMap.get(ch)){
                   return false;
               }
               stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
