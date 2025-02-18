package com.github.ilebedenko.release_history.java11._new_string_methods;

/**
 * Новые методы String:
 * <p>
 * `isBlank` - проверяет, что строка null или не содержит иных символов кроме пробелов
 * <p>
 * `lines` - возвращает объект Stream<String>, полученный разбиением строки по символу конца строки.
 * Этот метод следует предпочесть методу `split()`, поскольку он обеспечивает лучшую производительность
 * <p>
 * `repeat(int count)` - возвращает строку, значение которой является конкатенация исходной строки,
 *                       повторенное указанное количество раз
 * <p>
 * `strip` - возвращает строку, в которой удалены все начальные и конечные пробелы.
 *  В отличие от `trim` учитывает еще и символы пробела в Unicode
 * <p>
 * `stripLeading` - возвращает строку, в которой удалены все начальные пробелы
 * <p>
 * `stripTrailing` - возвращает строку, в которой удалены все конечные пробелы
 */
public class Test {

    public static void main(String[] args) {
        // isBlank      -> true
        System.out.println(" \u2005\n\t ".isBlank());

        // lines            -> 3
        String multiLineString = "Hello\neveryone\nin the world";
        long count = multiLineString.lines().count();
        System.out.println(count);

        // repeat           -> "La La La La Land"
        String movieName = "La ".repeat(4) + "Land";
        System.out.println(movieName);

        // strip            -> "hello"
        String text = " \n\t hello \u2005\n\t ";
        System.out.println(text.strip());

        // stripTrailing    -> " \n\t hello"
        System.out.println(text.stripTrailing());

        // stripLeading     -> "hello \u2005\n\t "
        System.out.println(text.stripLeading());
    }
}
