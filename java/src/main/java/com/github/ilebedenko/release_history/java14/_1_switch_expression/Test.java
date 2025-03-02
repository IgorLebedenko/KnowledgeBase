package com.github.ilebedenko.release_history.java14._1_switch_expression;

/**
 * Оператор switch теперь становится выражением, которое может возвращать значение.
 * Также нет необходимости использовать break в каждой ветке благодаря lambda (->) синтаксису.
 */
public class Test {

    public static void main(String[] args) {
        String productType;

        productType = oldSwitch("Apple");
        System.out.println(productType);
        productType = oldSwitch("Banana");
        System.out.println(productType);

        productType = newSwitch("Apple");
        System.out.println(productType);
        productType = newSwitch("Banana");
        System.out.println(productType);
    }

    // =============== OLD ================
    private static String oldSwitch(String productName) {
        String productType;
        switch (productName) {
            case "Apple":
            case "Peach":
                productType = "Fruit";
                break;
            case "Raspberry":
            case "Cherry":
                productType = "Berry";
                break;
            default:
                System.out.println("Unknown product: " + productName);
                productType = "Other";
                break;
        }
        return productType;
    }

    // =============== SINCE JAVA 14 ================
    private static String newSwitch(String productName) {
        String productType;
        productType = switch (productName) {
            case "Apple", "Peach" -> "Fruit";
            case "Raspberry", "Cherry" -> "Berry";
            default -> {
                System.out.println("Unknown product: " + productName);
                yield "Other";
            }
        };
        return productType;
    }
}
