package string;

import static org.junit.Assert.*;
import static string.CC150_1_1_CheckUniqueCharacters.*;

/**
 * @author Hang on 2/20/2016.
 */
public class CC150_1_1_CheckUniqueCharactersTest {

    @org.junit.Test
    public void testIsUniqueCharacter1() throws Exception {
        assertFalse(isUniqueCharacter1("abcdedsdfasd1234124asdfasdfasdfasdf"));
        assertFalse(isUniqueCharacter1("abcdefgg"));
        assertTrue(isUniqueCharacter1("abcdefg"));
        assertTrue(isUniqueCharacter1(""));
    }

    @org.junit.Test
    public void testIsUniqueCharacter2() throws Exception {
        assertFalse(isUniqueCharacter2("abcdedsdfasd1234124asdfasdfasdfasdf"));
        assertFalse(isUniqueCharacter2("abcdefgg"));
        assertTrue(isUniqueCharacter2("abcdefg"));
        assertTrue(isUniqueCharacter2(""));
    }
}