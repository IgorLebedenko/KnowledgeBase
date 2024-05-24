package com.github.ilebedenko.release_history.java9._5_safevarargs_on_private_method;

/**
 * Аннотация @SafeVarargs используется для подавления предупреждения
 * о небезопасном использовании переменного числа аргументов (varargs) в методах,
 * объявленных с параметризованным (generic) типом
 * <p>
 * В Java7 она была введена для static и final методов, а также конструкторов.
 * В Java9 была расширена и для private методов
 */
public class Test {
    public static void main(String[] args) {
        Util util = new Util();
        util.displayFinal("a", "b", "c");
        Util.displayStatic("d", "e", "f");
    }
}
