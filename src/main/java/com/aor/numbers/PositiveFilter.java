package com.aor.numbers;

public class PositiveFilter implements GenericListFilter {
    @Override
    public boolean accept(Integer number) {
        return false;
    }
}
