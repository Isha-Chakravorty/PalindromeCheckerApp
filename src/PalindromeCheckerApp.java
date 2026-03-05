import java.util.*;

interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {

            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

public class UseCase12PalindromeCheckerApp {

    private PalindromeStrategy strategy;

    public UseCase12PalindromeCheckerApp(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String input) {
        return strategy.isPalindrome(input);
    }

    public static void main(String[] args) {

        String input = "racecar";

        UseCase12PalindromeCheckerApp checker1 =
                new UseCase12PalindromeCheckerApp(new StackStrategy());

        boolean result1 = checker1.check(input);

        System.out.println("Using Stack Strategy");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result1 + "\n");

        UseCase12PalindromeCheckerApp checker2 =
                new UseCase12PalindromeCheckerApp(new DequeStrategy());

        boolean result2 = checker2.check(input);

        System.out.println("Using Deque Strategy");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result2);
    }
}
