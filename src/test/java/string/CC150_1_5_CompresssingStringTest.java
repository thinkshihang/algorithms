package string;

import org.junit.Test;
import static org.junit.Assert.*;
import static string.CC150_1_5_CompressString.compress;

public class CC150_1_5_CompresssingStringTest {

    @Test
    public void testCcompress() {
        assertTrue(compress("abcd").equals("abcd"));
        assertTrue(compress("aaaaaabcccddddddd").equals("a6b1c3d7"));
    }
}
