package com.github.ilebedenko.release_history.java12._2_new_string_methods;

import java.util.Arrays;

/**
 * Новые методы String:
 * <p>
 * `indent(int)` - задает отступ в начале каждой строки на основе числового параметра.
 *               Если параметр больше нуля, в начале каждой строки будут вставлены n новых пробелов.
 *               Если параметр меньше нуля, то из начала каждой строки будут удалены n пробелов.
 * <p>
 * `transform(Function<String, R>)` - применяет функцию к строке и возвращает результат
 */
public class Test {

    public static void main(String[] args) {
        // indent
        String text = "Hello,\n this is a\n  multi-line message\n";
        System.out.println(text);
        System.out.println(text.indent(2));
        System.out.println(text.indent(-2));

        // transform
        text = "1, 2, 3, 4, 5";
        int[] transformed = text.transform(Test::strToIntArray);
        System.out.println(Arrays.toString(transformed));
    }

    private static int[] strToIntArray(String str) {
        return Arrays.stream(str.split(","))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
