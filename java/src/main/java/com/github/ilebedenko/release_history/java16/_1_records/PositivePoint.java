package com.github.ilebedenko.release_history.java16._1_records;

public record PositivePoint(int x, int y) {

    public PositivePoint {
        if (x < 0 || y < 0)
            throw new IllegalArgumentException("Point.x or Point.y less than zero");
    }

    // конструктор без аргументов
    public PositivePoint() {
        this(0, 0);
    }

    // статичный фабричный метод
    static PositivePoint zero() {
        return new PositivePoint();
    }

    // обычный метод, которым можно дополнить запись
    public boolean isZero() {
        return x == 0 && y == 0;
    }
}
