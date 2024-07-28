package com.github.ilebedenko.release_history.java10._1_local_variable_type_inference;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Зарезервированное слово var позволяет сократить объявление локальной переменной,
 * опустив явное объявление типа. Тип переменной будет определяться по правой части.
 * Использование var не делает java динамически типизированным языком.
 * Тип переменной по-прежнему выводится во время компиляции и не может быть изменен позже.
 * <p>
 * Недопустимое использование:
 * - нелокальная переменная         <code>public var message = "my text"</code
 * - инициализация null значением   <code>var nullValue = null</code>
 * - lambda выражения               <code>var p = (String s) -> s.length() > 10</code>
 * - инициализация массива          <code>var arr = { 1, 2, 3 }</code>
 */
public class Test {

    public static void main(String[] args) {

        // 1. Упрощает объявление сложных типов
        // ORIGINAL
        Map<String, Integer> map = Map.of("a", 1, "b", 2);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            entry.getValue();
        }

        // NEW
        var map2 = Map.of("a", 1, "b", 2);
        for (var entry : map2.entrySet()) {
            entry.getValue();
        }

        // ORIGINAL
        try (InputStream is = new FileInputStream("file.txt");
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader buf = new BufferedReader(isr)) {
            buf.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // NEW
        try (var is = new FileInputStream("file.txt");
             var isr = new InputStreamReader(is);
             var buf = new BufferedReader(isr)) {
            buf.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        // 2. Повышает требования к информативности имен переменных и вызываемых методов.
        // Иначе сильно пострадает читабельность
        // ORIGINAL
        Executor obj = new Executor();
        List<String> result = obj.execute("query");
        // NEW
        var customers = obj.execute("query");


        // 3. Нужно быть осторожным при замене на var абстрактных типов.
        // Код становится привязан к реализации, а не абстракции
        // ORIGINAL
        List<String> strings = new ArrayList<>();
        // NEW (тип переменной будет ArrayList<String>)
        var strings2 = new ArrayList<String>();


        // 4. Нужно быть осторожным при использовании с diamond операторами
        // ORIGINAL
        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        // NEW
        var stringQueue2 = new PriorityQueue<String>();
        // DANGEROUS (тип переменной будет PriorityQueue<Object>)
        var stringQueue3 = new PriorityQueue<>();


        // 5. Нужно быть осторожным при использовании var вместо примитивных типов
        // ORIGINAL
        boolean ready = true;
        char ch = '\ufffd';
        long sum = 0L;
        String label = "text";
        // NEW
        var ready2 = true;
        var ch2 = '\ufffd';
        var sum2 = 0L;
        var label2 = "text";

        // ORIGINAL
        byte flags = 0;
        short mask = 0x7fff;
        long base = 17;
        // DANGEROUS (тип всех переменных int)
        var flags2 = 0;
        var mask2 = 0x7fff;
        var base2 = 17;
    }
}
