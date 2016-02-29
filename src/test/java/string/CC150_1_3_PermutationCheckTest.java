package string;

import org.junit.Test;
import static string.CC150_1_3_PermutationCheck.isPermutation_1;
import static string.CC150_1_3_PermutationCheck.isPermutation_2;

import static org.junit.Assert.*;

public class CC150_1_3_PermutationCheckTest {

    @Test
    public void testIsPermutation_1_withCorrectData() throws Exception {
        assertTrue(isPermutation_1("abcdd", "dadbc"));
    }

    @Test
    public void testIsPermutation_1_withInCorrectData() throws Exception {
        assertFalse(isPermutation_1("abcd", "aabc"));
    }

    @Test
    public void testIsPermutation_2_withCorrectData() throws Exception {
        assertTrue(isPermutation_2("aabbcd", "cbdaba"));
    }

    @Test
    public void testIsPermutation_2_withInCorrectData() throws Exception {
        assertTrue(isPermutation_2("abcdd", "ddacb"));
    }
}