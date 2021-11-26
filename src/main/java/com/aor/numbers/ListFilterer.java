package com.aor.numbers;

import java.util.List;

public class ListFilterer {
    public ListFilterer(GenericListFilter filter) {
        this.filter = filter;
    }
    private GenericListFilter filter;
    public List<Integer> filter(List<Integer> list) {
        return list;
    }
}
