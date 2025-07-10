import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test cases for the TopKFrequentElements util class.
 */
public class TopKFrequentElementsTest {

    @Test
    void testTypicalCase() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> result = TopKFrequentElements.topKFrequent(nums, k);
        assertEquals(2, result.size());
        assertTrue(result.containsAll(Arrays.asList(1, 2)));
    }

    @Test
    void testAllUniqueElements() {
        int[] nums = {1, 2, 3, 4};
        int k = 2;
        List<Integer> result = TopKFrequentElements.topKFrequent(nums, k);
        assertEquals(2, result.size());
        assertTrue(Arrays.asList(1, 2, 3, 4).containsAll(result));
    }

    @Test
    void testSingleElementRepeated() {
        int[] nums = {7, 7, 7, 7};
        int k = 1;
        List<Integer> result = TopKFrequentElements.topKFrequent(nums, k);
        assertEquals(Collections.singletonList(7), result);
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int k = 1;
        List<Integer> result = TopKFrequentElements.topKFrequent(nums, k);
        assertTrue(result.isEmpty());
    }

    @Test
    void testKIsZero() {
        int[] nums = {1, 2, 3};
        int k = 0;
        List<Integer> result = TopKFrequentElements.topKFrequent(nums, k);
        assertTrue(result.isEmpty());
    }

    @Test
    void testKGreaterThanUniqueItems() {
        int[] nums = {1, 2, 2, 3};
        int k = 10;
        List<Integer> result = TopKFrequentElements.topKFrequent(nums, k);
        assertEquals(3, result.size());
        assertTrue(result.containsAll(Arrays.asList(1, 2, 3)));
    }

    @Test
    void testKGreaterThanListSize() {
        int[] nums = {5, 5, 6};
        int k = 10;
        List<Integer> result = TopKFrequentElements.topKFrequent(nums, k);
        assertEquals(2, result.size());
        assertTrue(result.containsAll(Arrays.asList(5, 6)));
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-1, -1, -2, -2, -3};
        int k = 2;
        List<Integer> result = TopKFrequentElements.topKFrequent(nums, k);
        assertEquals(2, result.size());
        assertTrue(result.containsAll(Arrays.asList(-1, -2)));
    }

    @Test
    void testTieBreakerUnspecifiedOrder() {
        int[] nums = {1, 2, 3, 4};
        int k = 2;
        List<Integer> result = TopKFrequentElements.topKFrequent(nums, k);
        assertEquals(2, result.size());
        assertTrue(Arrays.asList(1, 2, 3, 4).containsAll(result));
    }
}
