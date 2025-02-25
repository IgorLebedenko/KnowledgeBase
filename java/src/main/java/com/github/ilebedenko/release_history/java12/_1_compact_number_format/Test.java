package com.github.ilebedenko.release_history.java12._1_compact_number_format;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * `CompactNumberFormat` — это подкласс `NumberFormat`, который форматирует десятичное число в компактную форму
 *              на основе шаблонов, предоставляемых заданной локалью.
 * <p>
 * `getCompactNumberInstance(Locale, NumberFormat.Style)` - возвращает экземпляр `CompactNumberFormat`
 */
public class Test {

    public static void main(String[] args) {
        NumberFormat shortFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println(shortFormat.format(1234));
        System.out.println(shortFormat.format(123456));
        System.out.println(shortFormat.format(12345678));
        System.out.println(shortFormat.format(1234567890));

        NumberFormat longFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        System.out.println(longFormat.format(1234));
        System.out.println(longFormat.format(123456));
        System.out.println(longFormat.format(12345678));
        System.out.println(longFormat.format(1234567890));
    }
}
