import java.util.*;
public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args){

        String input = "noon";
        Stack <Character> stack = new Stack<>();
        boolean ispalindrome = true;

        for(char ch : input.toCharArray()){
            stack.push(ch);
        }


        for(char ch : input.toCharArray()){
            if(ch != stack.pop()){
                ispalindrome = false;
            }
        }




        System.out.println("UC5 Input: " + input);
        System.out.println("Palindrome: " + ispalindrome + "\n");

    }
}
