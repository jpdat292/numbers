package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {

    // List<Integer> list;
    // List<Integer> expected;

    @Test
    public void deduplicate() {
        ListDeduplicator deduplicator = new ListDeduplicator();
        List<Integer> distinct = deduplicator.deduplicate(helperList());
        // List<Integer> distinct = deduplicator.deduplicate(list);

        Assertions.assertEquals(helperExpected(), distinct);
        // Assertions.assertEquals(expected, distinct);
    }

    public List<Integer> helperList() {
        return Arrays.asList(1, 2, 4, 2, 5);
    }

    public List<Integer> helperExpected() {
        return Arrays.asList(1, 2, 4, 5);
    }
    /*
    @BeforeEach
    public void arrangementHelper() {
        list = Arrays.asList(1, 2, 4, 2, 5);
        expected = Arrays.asList(1, 2, 4, 5);
    }
 */

}
