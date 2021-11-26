package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {

    // List<Integer> list;

    @Test
    public void sum() {
        ListAggregator aggregator = new ListAggregator();
        // int sum = aggregator.sum(list);
        int sum = aggregator.sum(helper());

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {
        ListAggregator aggregator = new ListAggregator();
        // int max = aggregator.max(list);
        int max = aggregator.max(helper());

        Assertions.assertEquals(5, max);
    }

    @Test
    public void min() {
        ListAggregator aggregator = new ListAggregator();
        // int min = aggregator.min(list);
        int min = aggregator.min(helper());
        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {
        ListAggregator aggregator = new ListAggregator();
        ListDeduplicator deduplicator = new ListDeduplicator();
        // int distinct = aggregator.distinct(list);
        int distinct = aggregator.distinct(helper(), deduplicator);

        Assertions.assertEquals(4, distinct);
    }

    @Test
    public void max_bug_7263() {
        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(bug7263Test());

        Assertions.assertEquals(-1, max);
    }
/*
    @Test
    public void distinct_bug_8726() {
        class StubListDeduplicator implements GenericListDeduplicator {
            @Override
            public List<Integer> deduplicate(List<Integer> list, GenericListSorter genericListSorter) {
                return Arrays.asList(1, 2, 4);
            }
        }
        ListAggregator aggregator = new ListAggregator();
        StubListDeduplicator stubDeduplicator = new StubListDeduplicator();

        int distinct = aggregator.distinct(bug8726Test(), stubDeduplicator);

        Assertions.assertEquals(3, distinct);
    }
*/
    @Test
    public void distinct_bug_8726() {
        GenericListDeduplicator mockDeduplicator = Mockito.mock(GenericListDeduplicator.class);
        Mockito.when(mockDeduplicator.deduplicate(Mockito.anyList(), Mockito.anyObject())).thenReturn(Arrays.asList(1, 2, 4));
        ListAggregator aggregator = new ListAggregator();

        int distinct = aggregator.distinct(bug8726Test(), mockDeduplicator);

        Assertions.assertEquals(3, distinct);
    }

    public List<Integer> helper() {
        return Arrays.asList(1, 2, 4, 2, 5);
    }

    public List<Integer> bug7263Test() {
        return Arrays.asList(-1, -4, -5);
    }

    public List<Integer> bug8726Test() {
        return Arrays.asList(1, 2, 4, 2);
    }

    /*
    @BeforeEach
    public void helper2() {
        list = Arrays.asList(1, 2, 4, 2, 5);
    }
    */

}
