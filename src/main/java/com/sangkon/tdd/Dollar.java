package com.sangkon.tdd;

import java.util.Objects;

public class Dollar {
    private int amount;

    public Dollar(int amount) {

        this.amount = amount;
    }

    public Dollar times(int number) {

        return new Dollar(this.amount * number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
