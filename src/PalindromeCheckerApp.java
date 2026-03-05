public static void uc10_CaseInsensitiveSpaceIgnored() {

    String input = "Never Odd Or Even";

    String processed = input.replaceAll("\\s+", "").toLowerCase();

    int start = 0;
    int end = processed.length() - 1;

    boolean isPalindrome = true;

    while (start < end) {

        if (processed.charAt(start) != processed.charAt(end)) {
            isPalindrome = false;
            break;
        }

        start++;
        end--;
    }

    System.out.println("UC10 Input : " + input);
    System.out.println("Processed String : " + processed);
    System.out.println("Is Palindrome? : " + isPalindrome + "\n");
}
