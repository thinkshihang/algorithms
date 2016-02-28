package search;

import org.junit.Before;
import org.junit.Test;

import static search.StandardBinarySearch.binaryResearch;
import static org.junit.Assert.*;

public class StandardBinarySearchTest {

    private int[] data = {1, 2, 3, 4, 5, 6, 7, 8};;

    @Test
    public void testBinaryResearch() throws Exception {
        assertTrue(binaryResearch(data, 8));
        assertTrue(binaryResearch(data, 1));
        assertFalse(binaryResearch(data, 9));
    }
}