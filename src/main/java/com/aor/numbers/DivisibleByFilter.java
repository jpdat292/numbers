package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter {
    public DivisibleByFilter(Integer number) {
        this.number = number;
    }
    private Integer number;
    @Override
    public boolean accept(Integer number) {
        return false;
    }
}
