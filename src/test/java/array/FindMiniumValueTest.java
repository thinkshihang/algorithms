package array;

import org.junit.Before;
import org.junit.Test;
import static array.FindMiniumValue.searchMin;
import static org.junit.Assert.*;

/**
 * @author Hang on 2/21/2016.
 */
public class FindMiniumValueTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testSearchMin() throws Exception {
        int[] a = {3, 4, 5, 6, 7, 8, 1, 2};
        assertTrue(searchMin(a, 0, a.length - 1) == 1);

        int[] b = {2, 3, 0, 1};
        assertTrue(searchMin(b, 0, b.length - 1) == 0);

        assertFalse(searchMin(b, 0, b.length - 1) == 1);
    }
}