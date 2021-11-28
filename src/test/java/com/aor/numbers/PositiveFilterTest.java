package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositiveFilterTest {
    PositiveFilter positiveFilter = new PositiveFilter();
    // why not create methods to be tested as static?

    @Test
    public void positiveTest() {
        Assertions.assertEquals(true, positiveFilter.accept(1));
    }

    @Test
    public void notPositiveTest() {
        Assertions.assertEquals(false, positiveFilter.accept(-1));
    }

    @Test
    public void nullNumberTest() {
        Assertions.assertEquals(false, positiveFilter.accept(0));
    }
}
