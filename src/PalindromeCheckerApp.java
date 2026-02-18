import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1: Welcome Message
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.\n");

        // UC2: Hardcoded palindrome
        uc2_HardcodedPalindrome();

        // UC3: Reverse string method
        uc3_StringReverse();

        // UC4: Character array method
        uc4_CharArrayMethod();

        // UC5: Stack method
        uc5_StackMethod();

        // UC6: Queue + Stack method
        uc6_QueueStackMethod();

        // UC7: Deque method
        uc7_DequeMethod();
    }

    // UC2
    public static void uc2_HardcodedPalindrome() {

        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC2 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome + "\n");
    }


    // UC3
    public static void uc3_StringReverse() {

        String input = "level";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {

            reversed += input.charAt(i);
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("UC3 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome + "\n");
    }


    // UC4
    public static void uc4_CharArrayMethod() {

        String input = "radar";

        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("UC4 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome + "\n");
    }


    // UC5
    public static void uc5_StackMethod() {

        String input = "noon";

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC5 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome + "\n");
    }


    // UC6
    public static void uc6_QueueStackMethod() {

        String input = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {

            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {

            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC6 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome + "\n");
    }


    // UC7
    public static void uc7_DequeMethod() {

        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {

            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC7 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome + "\n");
    }
}
