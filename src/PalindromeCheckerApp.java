import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for(int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        while(deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if(first != last) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "a man a plan a canal panama";

        String lowerCaseInput = input.toLowerCase();
        String noSpace = lowerCaseInput.replaceAll("\\s","");

        boolean result = isPalindrome(noSpace);

        System.out.println("UC7 Input: " + input);
        System.out.println("LowerCase converted Input: " + lowerCaseInput);
        System.out.println("NoSpace converted Input: " + noSpace);
        System.out.println("Palindrome: " + result + "\n");
    }
}
