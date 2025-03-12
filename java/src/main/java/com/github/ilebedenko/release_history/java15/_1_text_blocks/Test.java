package com.github.ilebedenko.release_history.java15._1_text_blocks;

/**
 * Текстовые блоки упрощают работу с многострочным текстом, таким как JSON, XML или SQL-запросы.
 * <p>
 * - В конце каждой строки автоматически добавляется '\n',
 * который можно удалить добавлением символа '\' в конце строки
 * - Символ '\s' транслируется в единичный пробел
 * - Для замены плейсхолдеров лучше использовать Text Block совместно с методом `String.formatted()`
 */
public class Test {

    public static void main(String[] args) {
        // ==================== OLD =====================
        String html =
                "<html>\n" +
                        "\t<body>\n" +
                        "\t\t<p style=\"font-weight: bold\">Hello, World!</p>\n" +
                        "\t</body>\n" +
                        "</html>\n";
        System.out.println(html);

        // =============== SINCE JAVA 15 ================
        html = """
                <html>
                    <body>
                        <p style="font-weight: bold">Hello, World!</p>
                    </body>
                </html>
                """;
        System.out.println(html);

        // Text Block with placeholders
        String sql = """
                SELECT *
                FROM persons
                WHERE type = %s
                ORDER BY name %s
                """.formatted(123, "DESC");
        System.out.println(sql);
    }
}
