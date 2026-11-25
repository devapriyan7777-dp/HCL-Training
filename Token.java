import java.util.*;
public class Token {
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        ArrayList<Integer> stack = new ArrayList<>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.remove(stack.size() - 1);
                int a = stack.remove(stack.size() - 1);
                int result = 0;
                if (token.equals("+")) {
                    result = a + b;
                }
                else if (token.equals("-")) {
                    result = a - b;
                }
                else if (token.equals("*")) {
                    result = a * b;
                }
                else if (token.equals("/")) {
                    result = a / b;
                }
                stack.add(result);
            }
            else {
                int num = Integer.parseInt(token);
                stack.add(num);
            }
        }
        System.out.println("Final Result: " + stack.get(0));
    }
}


