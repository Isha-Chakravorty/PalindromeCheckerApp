import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){

        String input = "level";
        boolean ispalindrome = true;

        for(int i = 0; i < input.length() / 2; i++ ){
            if(input.charAt(i) != input.charAt(input.length() - 1 - i )){
                ispalindrome = false;
                break;
            }
        }
        System.out.println("UC2 Input: " + input);
        System.out.println("Palindrome: " + ispalindrome + "\n");

    }
}
