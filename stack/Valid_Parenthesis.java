package stack;

import java.util.LinkedList;

class Valid_Parenthesis {
    public static boolean isValid(String s) {
        if (s.length() == 1)
            return false;
        LinkedList<Integer> stack = new LinkedList<>();
        stack.addFirst((int) s.charAt(0));
        int curr;
        int top = 0;
        for (int i = 1; i < s.length(); i++) {
            curr = (int) s.charAt(i);
            if (stack.size() > 0) {
                top = stack.getFirst();
                if (top == curr - 1 || top == curr - 2)
                    stack.removeFirst();
                else
                    stack.addFirst(curr);

            } else
                stack.addFirst(curr);

        }

        return (stack.size() == 0);
    }

    public static void main(String[] args) {
        String s = "(()";
        boolean res = isValid(s);
        System.out.println(res);

    }
}