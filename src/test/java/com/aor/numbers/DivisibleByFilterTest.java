package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivisibleByFilterTest {
    @Test
    public void divisibleTest() {
        DivisibleByFilter divisibleByFilter = new DivisibleByFilter(2);
        Assertions.assertEquals(true, divisibleByFilter.accept(4));
    }

    @Test
    public void notDivisibleTest() {
        DivisibleByFilter divisibleByFilter = new DivisibleByFilter(4);
        Assertions.assertEquals(false, divisibleByFilter.accept(9));
    }
}
