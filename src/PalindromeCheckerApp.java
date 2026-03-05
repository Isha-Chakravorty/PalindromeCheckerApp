public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args){

        String input = "madam";
        char[] charArray = input.toCharArray();
        boolean ispalindrome = true;
        int startIndex = 0;
        int endIndex = input.length() - 1;
        while(startIndex < endIndex){
            if (charArray[startIndex] != charArray[endIndex]) {
                ispalindrome = false;
                break; }
            startIndex++;
            endIndex--;

        }
        System.out.println("UC4 Input: " + input);
        System.out.println("Palindrome: " + ispalindrome + "\n");

    }
}
