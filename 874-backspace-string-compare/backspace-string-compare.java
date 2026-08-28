import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> stack1 = buildStack(s);
        Stack<Character> stack2 = buildStack(t);

        return stack1.equals(stack2);
    }

    private Stack<Character> buildStack(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        return stack;
    }
}