public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args){

        String input = "level";
        boolean ispalindrome = true;

        for(int i = input.length() - 1 ; i >= 0 ; i-- ){
            if(input.charAt(i) != input.charAt(input.length() - i - 1)){
                ispalindrome = false;
            }
        }
        System.out.println("UC3 Input: " + input);
        System.out.println("Palindrome: " + ispalindrome + "\n");

    }
}
