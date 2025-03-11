package com.github.ilebedenko.release_history.java16._1_records;

/**
 * Records (записи) предоставляют упрощенный способ создания объектов неизменяемых классов и
 * используются только как readonly объекты.
 * <p>
 * В record объекте автоматически сгенерированы:
 * - final поля
 * - конструктор
 * - геттеры
 * - equals()
 * - hashCode()
 * - toString()
 * <p>
 * Особенности:
 * - нельзя добавить сеттеры и нестатические поля
 * - геттеры называются так же, как и поля, без префиксов get и is
 * - класс записи финальный
 * <p>
 * Являются хорошим инструментом для создания одноразовых контейнеров для данных без сложной логики
 */
public class Test {

    public static void main(String[] args) {
        Point point = new Point(2, -1);
        System.out.println(point);


        PositivePoint positivePoint = new PositivePoint(5, 15);
        System.out.println(positivePoint.x() + " " + positivePoint.y());

        PositivePoint zeroPoint = PositivePoint.zero();
        System.out.println(zeroPoint);
        System.out.println(zeroPoint.isZero());
    }
}
