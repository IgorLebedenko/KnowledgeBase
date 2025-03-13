package com.github.ilebedenko.release_history.java17._1_sealed_classes;

/**
 * Sealed (запечатанные) классы или интерфейсы разрешают наследование ограниченному
 * специально объявленному списку подклассов. Других наследников быть не может.
 * <p>
 * Появилось два новых модификатора `sealed` и `non-sealed` и ключевое слово permits`.
 * <p>
 * При этом наследники sealed класса обязаны явно указать свое отношение к дальнейшему наследованию одним из вариантов:
 * - final - наследников не предполагается
 * - sealed - наследование строго определенному списку подклассов
 * - non-sealed - наследником может быть кто угодно
 * <p>
 * Наследники, перечисленные в permits, должны находиться в том же пакете или модуле, что и родитель
 * <p>
 */
public class Test {
    public sealed class Shape permits Circle, Square, Rectangle, WeirdShape {}

    public final  class Circle     extends Shape {}
    public sealed class Rectangle  extends Shape permits TranspRectangle, FilledRectangle {}
    public final  class Square     extends Shape {}
    public non-sealed class WeirdShape extends Shape {}

    public final class TranspRectangle extends Rectangle {}
    public final class FilledRectangle extends Rectangle {}
}
