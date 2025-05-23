package com.github.ilebedenko.release_history.java9._4_try_with_resources_effectively_final;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * В try-with-resources добавлена возможность использовать ресурс (implement AutoClosable), определенный вне блока.
 * Единственное ограничение: ресурс должен быть помечен как final или не изменяться после создания
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        // ==================== OLD =====================
        try (BufferedReader br1 = new BufferedReader(new FileReader("test1.txt"));
             BufferedReader br2 = new BufferedReader(new FileReader("test2.txt"))) {
            System.out.println(br1.readLine() + br2.readLine());
        } catch (IOException ignored) {
        }

        // =============== SINCE JAVA 9 ================
        final BufferedReader br1 = new BufferedReader(new FileReader("test1.txt"));
        final BufferedReader br2 = new BufferedReader(new FileReader("test2.txt"));

        try (br1; br2) {
            System.out.println(br1.readLine() + br2.readLine());
        } catch (IOException ignored) {
        }
    }
}
