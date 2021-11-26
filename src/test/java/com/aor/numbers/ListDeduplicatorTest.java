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
        GenericListSorter listSorter = new ListSorter();
        List<Integer> distinct = deduplicator.deduplicate(helperList(), listSorter);
        // List<Integer> distinct = deduplicator.deduplicate(list);

        Assertions.assertEquals(helperExpected(), distinct);
        // Assertions.assertEquals(expected, distinct);
    }

    @Test
    public void deduplicate_bug_8726() {
        class StubListSorter implements GenericListSorter {
            @Override
            public List<Integer> sort(List<Integer> list) {
                return Arrays.asList(1, 2, 2, 4);
            }
        }
        ListDeduplicator listDeduplicator = new ListDeduplicator();
        GenericListSorter stubSorter = new StubListSorter();
        List<Integer> result = listDeduplicator.deduplicate(helperBug8726(), stubSorter);
        Assertions.assertEquals(result, Arrays.asList(1, 2, 4));
    }

    public List<Integer> helperList() {
        return Arrays.asList(1, 2, 4, 2, 5);
    }

    public List<Integer> helperExpected() {
        return Arrays.asList(1, 2, 4, 5);
    }

    public List<Integer> helperBug8726() { return Arrays.asList(1, 2, 4, 2); }
    /*
    @BeforeEach
    public void arrangementHelper() {
        list = Arrays.asList(1, 2, 4, 2, 5);
        expected = Arrays.asList(1, 2, 4, 5);
    }
 */

}
