package string;

import java.util.Arrays;

public class CC150_1_3_PermutationCheck {

    public static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);   // O(nlog(n))
        return new String(content);
    }

    /**
     * Solution I: Compare strings after sorting
     * @param s : first string
     * @param t : second string
     * @return true if the specified two strings are permutation
     *
     * time complexity: O(nlog(n))
     * space complexity: O(n)
     */
    public static boolean isPermutation_1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        return sort(s).equals(sort(t));
    }

    /**
     * Solution II: check if the two strings have identical character counts
     * @param s
     * @param t
     * @return
     *
     * time complexity: O(n)
     * space complexity: O(1)
     */
    public static boolean isPermutation_2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[256];
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            letters[c]++;
        }

//        char[] content = s.toCharArray();
//        for (char c : content) {
//            letters[c]++;
//        }

        for (int i = 0; i < t.length(); ++i) {
            if (--letters[t.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }
}
