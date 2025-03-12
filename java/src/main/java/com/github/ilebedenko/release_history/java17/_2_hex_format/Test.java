package com.github.ilebedenko.release_history.java17._2_hex_format;

import java.util.HexFormat;

/**
 * Добавлен класс `HexFormat` для удобной работы с шестнадцатеричными данными
 */
public class Test {

    public static void main(String[] args) {
        // -> 0000007b
        String hexDigits = HexFormat.of().toHexDigits(123);
        System.out.println(hexDigits);

        // -> 123
        int num = HexFormat.fromHexDigits(hexDigits);
        System.out.println(num);

        // HexFormat с разделителем и префиксом
        HexFormat hexFormat = HexFormat.ofDelimiter(" ").withPrefix("0x");
        byte[] bytes = {1, 2, 3, 127, -128};
        // -> 0x01 0x02 0x03 0x7f 0x80
        String hexString = hexFormat.formatHex(bytes);
        System.out.println(hexString);
    }
}
