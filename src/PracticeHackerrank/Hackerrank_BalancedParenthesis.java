package PracticeHackerrank;
import java.util.Scanner;
import java.util.Stack;

public class Hackerrank_BalancedParenthesis {
    public static void main(String[] args) {
        Stack<Character> myStack = new Stack<Character>();
        Scanner sc = new Scanner(System.in);

        String expression = sc.nextLine();
        boolean isBalanced = checkBalancedParenthesis(myStack,expression);
        if(isBalanced){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }
    public static boolean checkBalancedParenthesis(Stack<Character> s,String exp){
        if(exp.length() == 0){
            return false;
        }
        for(int i = 0;i < exp.length();i++){
            char ch = exp.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
                continue;
            }

            if(s.isEmpty()){
                return false;
            }
            char check = s.pop();
            switch (ch){
                case ')':
                    if(check == '{' || check == '['){
                        return false;
                    }
                    break;
                case '}':
                    if(check == '(' || check == '['){
                        return false;
                    }
                    break;
                case ']':
                    if(check == '(' || check == '{'){
                        return false;
                    }
                    break;
            }
        }
        return s.isEmpty();
    }
}
