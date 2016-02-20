package string;

/**
 * Implement an algorithm to determine if a string has all unique character.
 * What if you cannot use additional data structures?
 *
 * 1. Make sure if the string only contains ASCII or Unicode characters
 * 2. Make sure if extra space are allowed
 *
 * @author Hang on 2/20/2016.
 *
 */
public class CC150_1_1_CheckUniqueCharacters {

    /**
     * Brute force
     * @param s source string
     * @return true if all characters are identical; otherwise return false.
     *
     * time complexity O(N^2)
     * space complexity O(1)
     */
    public static boolean isUniqueCharacter1(String s) {
        // if s only contains ASCII characters
        int length = s.length();
        if (length > 256) {
            return false;
        }

        for (int i = 0; i < length - 1; ++i) {
            for (int j = i + 1; j < length; ++j) {
                if(s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Sloution II : additional space are allowed
     *
     * @param s source string
     * @return true if all characters are identical; otherwise return false.
     *
     * time complexity O(N)
     * space complexity O(256)
     */
    public static boolean isUniqueCharacter2(String s) {
        final int MAX_LENGTH = 256;
        boolean[] exists = new boolean[MAX_LENGTH];     // ATTENTION: FIXED SIZE ARRAY DECLARATION SYNTAX

        int length = s.length();
        for (int i = 0; i < length; ++i) {
            if (exists[s.charAt(i)]) {
               return false;
            }

            exists[s.charAt(i)] = true;
        }

        return true;
    }

    /**
     * Solution III : bit vector
     * @param s
     * @return
     */
    public static boolean isUniqueCharacter3(String s) {
        // TODO: to be implemented
        return false;
    }

    public static void main(String[] args) {
        if (!isUniqueCharacter1("abcdedsdfasd1234124asdfasdfasdfasdf")) {
            System.out.println("abcdedsdfasd1234124asdfasdfasdfasdf" + " is not all unique characters");
        }

        if (!isUniqueCharacter1("abcdefgg")) {
            System.out.println("abcdefgg" + " is not all unique characters");
        }

        if (isUniqueCharacter1("abcdefg")) {
            System.out.println("abcdefg" + " is all unique characters");
        }

        if (!isUniqueCharacter2("abcdedsdfasd1234124asdfasdfasdfasdf")) {
            System.out.println("abcdedsdfasd1234124asdfasdfasdfasdf" + " is not all unique characters");
        }

        if (!isUniqueCharacter2("abcdefgg")) {
            System.out.println("abcdefgg" + " is not all unique characters");
        }

        if (isUniqueCharacter2("abcdefg")) {
            System.out.println("abcdefg" + " is all unique characters");
        }
    }
}
