package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {

    public List<Integer> listHelper() { return Arrays.asList(-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9); }

    @Test
    public void filterPositives() {
        PositiveFilter positiveFilter = new PositiveFilter();
        ListFilterer listFilterer = new ListFilterer(positiveFilter);

        Assertions.assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9), listFilterer.filter(listHelper()));
    }

    @Test
    public void filterEvens() {
        DivisibleByFilter evenFilter = new DivisibleByFilter(2);
        ListFilterer listFilterer = new ListFilterer(evenFilter);

        Assertions.assertEquals(Arrays.asList(-2, 0, 2, 4, 6, 8), listFilterer.filter(listHelper()));
    }

    @Test
    public void filterDivBy3s() {
        DivisibleByFilter divBy3Filter = new DivisibleByFilter(3);
        ListFilterer listFilterer = new ListFilterer(divBy3Filter);

        Assertions.assertEquals(Arrays.asList(0, 3, 6, 9), listFilterer.filter(listHelper()));
    }
}
