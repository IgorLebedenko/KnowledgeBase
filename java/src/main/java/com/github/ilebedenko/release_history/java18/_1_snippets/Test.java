package com.github.ilebedenko.release_history.java18._1_snippets;

/**
 * Тэг `@snippet` облегчает использование фрагментов кода в Javadoc, позволяя вставлять код напрямую.
 * <p>
 * Это улучшило простоту и читаемость документации.
 * У вставленного таким образом кода проверяется синтаксис.
 * <p>
 * Также внутри тэга `@snippet` можно использовать специальные встроенные тэги,
 * улучшающие читаемость и функциональность документации: `@highlight`, `@link` и т.д.
 */
public class Test {

    /**
     * <pre><b>try</b> (BufferedWriter writer = Files.<i>newBufferedWriter</i>(path)) {
     *  writer.write(text)
     *}</pre>
     */
    void pre() {}

    /**
     * <pre>{@code try (BufferedWriter writer = Files.newBufferedWriter(path)) {
     *  writer.write(text);
     *}}</pre>
     */
    void preWithCode() {}




    /**
     * {@snippet :
     * try (BufferedWriter writer = Files.newBufferedWriter(path)) {
     *   writer.write(text);
     * }
     * }
     */
    void snippet() {}

    /**
     * {@snippet :
     * // @highlight region regex="\bwrite.*?\b" type="highlighted"
     * try (BufferedWriter writer = Files.newBufferedWriter(path)) {
     *   writer.write(text);
     * }
     * // @end
     * }
     */
    void snippetWithRegexHightlight() {}

    /**
     * {@snippet :
     * // @link substring="BufferedWriter" target="java.io.BufferedWriter" :
     * try (BufferedWriter writer = Files.newBufferedWriter(path)) {
     *   writer.write(text);
     * }
     * }
     */
    void snippetWithTargetLink() {}
}
