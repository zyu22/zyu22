import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();

            if(str.equals(".")) break;

            sb.append(stack(str)).append("\n");
        }

        System.out.println(sb.toString());
    }

    static String stack(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == '(' || ch == '[') {
                stack.push(ch);
            } else if(ch == ')') {
                if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
                else return "no";
            } else if(ch == ']') {
                if(!stack.isEmpty() && stack.peek() == '[') stack.pop();
                else return "no";
            }
        }

        if(!stack.empty()) return "no";
        return "yes";
    }
}
