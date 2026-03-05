public class UseCase9PalindromeCheckerApp {



    public static boolean isPalindrome(String input, int start,int end){
        if(start >= end) {
            return true;
        }
        if(input.charAt(start) != input.charAt(end)) {
            return false;
        }

        return isPalindrome(input, start+1, end-1);
    }

    public static void main(String[] args) {

        String input = "level";

        boolean result = isPalindrome(input, 0, input.length()-1);

        System.out.println("UC9 Input: " + input);
        System.out.println("Palindrome: " + result + "\n");

    }
}
