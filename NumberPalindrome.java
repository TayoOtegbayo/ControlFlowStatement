public class NumberPalindrome {
    public static void main (String[] args){
        isPalindrome(300);
    }
    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int lastDigit = palindrome % 10;
            reverse = reverse * 10 + lastDigit;
            palindrome = palindrome / 10;
        }

        // The integer is palindrome if integer and reverse are equal
        return number == reverse; //
    }

}
