package com.aor.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFilterer {
    public ListFilterer(GenericListFilter filter) {
        this.filter = filter;
    }
    private GenericListFilter filter;
    public List<Integer> filter(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (filter.accept(list.get(i)))
                result.add(list.get(i));
        }
        return result;
    }
}
