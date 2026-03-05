
import java.util.*;
public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args){

        String input = "civic";
        Queue<Character> queue = new LinkedList<>();
        Stack <Character> stack = new Stack<>();
        boolean ispalindrome = true;

        for(char ch : input.toCharArray()){
            queue.add(ch);
            stack.push(ch);
        }

        while(!queue.isEmpty()){
            if(queue.remove()!=stack.pop()){
                ispalindrome = false;
            }
        }




        System.out.println("UC6 Input: " + input);
        System.out.println("Palindrome: " + ispalindrome + "\n");

    }
}
