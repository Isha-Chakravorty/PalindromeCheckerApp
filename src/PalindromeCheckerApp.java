import java.util.*;

public class UseCase13PalindromeCheckerApp {

    public static boolean stackMethod(String input) {

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

    public static boolean dequeMethod(String input) {

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

    public static boolean twoPointerMethod(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "racecar";

        long startTime1 = System.nanoTime();
        boolean result1 = stackMethod(input);
        long endTime1 = System.nanoTime();
        long stackTime = endTime1 - startTime1;

        long startTime2 = System.nanoTime();
        boolean result2 = dequeMethod(input);
        long endTime2 = System.nanoTime();
        long dequeTime = endTime2 - startTime2;

        long startTime3 = System.nanoTime();
        boolean result3 = twoPointerMethod(input);
        long endTime3 = System.nanoTime();
        long twoPointerTime = endTime3 - startTime3;

        System.out.println("Input : " + input + "\n");

        System.out.println("Stack Method Result : " + result1);
        System.out.println("Execution Time : " + stackTime + " ns\n");

        System.out.println("Deque Method Result : " + result2);
        System.out.println("Execution Time : " + dequeTime + " ns\n");

        System.out.println("Two Pointer Method Result : " + result3);
        System.out.println("Execution Time : " + twoPointerTime + " ns");
    }
}
