class Solution {
    public boolean isValid(String s) {
        char[] sArray = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < sArray.length; i++){
            if(sArray[i] == ')'){
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(!stack.isEmpty() && sArray[i] == '}'){
                if(stack.peek()=='{'){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(!stack.isEmpty() && sArray[i] == ']'){
                if(stack.peek()=='['){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(sArray[i]);
            }
        }
        return stack.isEmpty();
    }

}
