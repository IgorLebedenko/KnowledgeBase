package com.github.ilebedenko.release_history.java16._2_pattern_matching_for_instanceof;

/**
 * Паттерны для instanceof - способ избавиться от многословного приведения к типу
 * после выполнения проверки instanceof.
 * Теперь этот процесс можно заменить введением переменной-паттерна.
 */
public class Test {

    public static void main(String[] args) {
        Object obj = "some message";

        // ==================== OLD =====================
        if (obj instanceof String) {
            String str = ((String) obj);
            System.out.println(str.length());
        }

        // =============== SINCE JAVA 16 ================
        if (obj instanceof String str)
            System.out.println(str.length());

        // использование переменной-паттерна в последующем условии
        if (obj instanceof String str && str.length() > 5)
            System.out.println(str);

        // область видимости переменной-паттерна может быть за пределом if
        if (!(obj instanceof String str))
            throw new IllegalArgumentException();
        System.out.println(str);
    }
}
