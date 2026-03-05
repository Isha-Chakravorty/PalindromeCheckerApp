import java.util.*;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Never Odd Or Even";

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("UC10 Input : " + input);
        System.out.println("Processed String : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
