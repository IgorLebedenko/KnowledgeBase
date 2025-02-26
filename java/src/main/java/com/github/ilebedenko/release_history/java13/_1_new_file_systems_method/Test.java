package com.github.ilebedenko.release_history.java13._1_new_file_systems_method;

import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.Map;

/**
 *  Методы FileSystems, которые создает новую файловую систему для указанного URI\Path:
 *  <p>
 *  `newFileSystem(URI, Map<String, ?>)`
 *  <p>
 *  `newFileSystem(URI, Map<String, ?>, Loader)`
 *  <p>
 *  `newFileSystem(Path)`
 *  <p>
 *  `newFileSystem(Path, Map<String, ?>)`
 *  <p>
 *  `newFileSystem(Path, Map<String, ?>, Loader)`
 */
public class Test {

    public static void main(String[] args) throws IOException {
        final Path zipPath = Paths.get("example.zip");
        final URI uri = URI.create("jar:file:" + zipPath.toUri().getPath());

        // create file system for ZIP file
        try (FileSystem fs = FileSystems.newFileSystem(uri, Map.of("create", "true"))) {
            Path fileInZip = fs.getPath("file.txt");
            Files.writeString(fileInZip, "Hello, ZIP!");
        }
    }
}
