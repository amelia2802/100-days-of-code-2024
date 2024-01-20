/*  Valid Parentheses | Code Challenge
    New code challenge! This is a great way to practice your coding skills and get feedback from the community. We will post a new challenge roughly every 2 days. Good luck!
    Description
    Write a function called 'isValidParentheses' that takes a string containing only the characters '(', ')', '{', '}', '[' and ']' as an argument and returns true if the parentheses in the string are valid, or false otherwise.
    Rules
    You must post your code in the code challenge channel
    The parentheses in the string are considered valid if they are properly closed and nested.
    An empty string is considered valid.
    Example
    isValidParentheses('(){}[]') => true
 * 
 */
import java.util.*;

public class validParentheses {

    public static boolean isValidParentheses(String ip_str){
        Deque<Character> stack = new ArrayDeque<Character>();

        for(int i=0;i<ip_str.length();i++){
            char ch = ip_str.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
                continue;
            }
            else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } 
            else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } 
            else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } 
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the paranthesis to check:");
        String input_str=sc.nextLine();

        System.out.println(isValidParentheses(input_str.replaceAll("\\s","")));
        sc.close();
    }
}
