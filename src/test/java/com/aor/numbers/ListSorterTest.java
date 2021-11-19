package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListSorterTest {

    // List<Integer> list;
    // List<Integer> expected;

    @Test
    public void sort() {
        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(helperList());
        // List<Integer> sorted = sorter.sort(list);

        Assertions.assertEquals(helperExpected(), sorted);
        // Assertions.assertEquals(expected, sorted);
    }

    public List<Integer> helperList() {
        return Arrays.asList(3, 2, 6, 1, 4, 5, 7);
    }

    public List<Integer> helperExpected() {
        return Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    }

    /*
    @BeforeEach
    public void arrangementHelper() {
        list = Arrays.asList(3, 2, 6, 1, 4, 5, 7);
        expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    }
    */
}
