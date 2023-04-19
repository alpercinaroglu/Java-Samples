/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class Palindrome {

    public static void main(String[] args) {

        String[] testData = new String[]{"", " ", "a", "aa", "ab", "aba", "abba", "abca", "abba ", " abba", "a bb a"};

        for (String str : testData) {
            System.out.println("Is \"" + str + "\" palindrome? " + isPalindrome(str));
        }
    }

    /*
    This method finds if the given string is palindrome or not.

    To verify that the method is implemented correctly, we should test the following scenarios:
        - Zero-length Strings should be palindrome.
        - Single-character Strings should be palindrome.
        - Strings consisting of two identical characters should be palindrome.
        - Strings consisting of two different characters should not be palindrome.
        - Symmetrical strings longer than two characters should be palindrome.
        - Leading and trailing spaces should be ignored. (It will be checked from the requirements document.)
        - Spaces in the text should also be treated as a character.
     */
    public static boolean isPalindrome(String str) {

        str = str.trim();

        int lastIndex = str.length() - 1;

        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        else {
            for (int i=0; i<str.length()/2; i++) {
                if (str.charAt(i) != str.charAt(lastIndex-i)) {
                    return false;
                }
            }
            return true;
        }
    }
}
