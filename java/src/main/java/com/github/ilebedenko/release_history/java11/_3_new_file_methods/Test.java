package com.github.ilebedenko.release_history.java11._3_new_file_methods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * В интерфейс `java.nio.file.Files` добавлены новые методы
 * для упрощенного чтения и записи строк в файлы:
 * <p>
 * `writeString(Path, CharSequence, ...)` - запись строки в файл
 * <p>
 * `readString(Path)` - чтение строки из файла
 */
public class Test {

    public static void main(String[] args) throws IOException {
        Path path = Files.createTempFile("test", ".txt");

        Files.writeString(path, "Hello, world!");
        String str = Files.readString(path);

        System.out.println(str);
    }
}
