//  Valid Parentheses

import java.util.*;

class Solution11 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char arr[] = new char[s.length()];
        arr = s.toCharArray();
        // stack.push(arr[0]);
        // System.out.println(stack.peek());
        for(int i = 0; i < s.length(); i ++){
            if(arr[i] == '(' || arr[i] == '[' || arr[i] == '{'){
                stack.push(arr[i]);
            }
            else if(arr[i] == ')'){
                if(stack.peek() == '('){
                    stack.pop();
                    // stack.pop();
                }
                // else{
                //     // stack.push(arr[i]);
                //     continue;
                // }
            }
            else if(arr[i] == '}'){
                if(stack.peek() == '{'){
                    stack.pop();
                    // stack.pop();
                }
                // else{
                //     // stack.push(arr[i]);
                //     continue;
                // }
            }
            else if(arr[i] == ']'){
                if(stack.peek() == '['){
                    stack.pop();
                    // stack.pop();
                }
                // else{
                //     // stack.push(arr[i]);
                //     continue;
                // }
            }
        }
        // if (stack.empty()) {
        //     return true;
        // }
        // else {
        //     return false;
        // }
        // int i = 0;
        // while(!stack.empty()){

        // }
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == '(') {
        //         stack.push(')');
        //     } else if(arr[i] == '{') {
        //         stack.push('}');
        //     } else if(arr[i] == '['){
        //         stack.push(']');
        //     } else if(stack.pop() != arr[i]){
        //         return false;
        //     } else {
        //         return true;
        //     }
        // }
        if (stack.empty()) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Solution11 s = new Solution11();
        System.out.println(s.isValid("{[]}"));
    }
}