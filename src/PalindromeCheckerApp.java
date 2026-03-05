import java.util.*;
public class UseCase8PalindromeCheckerApp {
    public static void main(String[] args){

        String input = "refer";
        LinkedList<Character> list = new  LinkedList<>();
        for (char c : input.toCharArray()) {
            list.addFirst(c);
        }
        boolean isPalindrome = true;
        while(list.size()>1){
            if(list.removeLast()!=list.removeFirst()){
                isPalindrome = false;
            }
        }
        System.out.println("UC8 Input: " + input);
        System.out.println("Palindrome: " + isPalindrome + "\n");

    }
}
