package com.github.ilebedenko.release_history.java15._2_helpful_npes;

/**
 * Начиная с Java 15 исключение `NullPointerException` описывает какой вызов или
 * какая переменная в цепочке имела значение null и стала причиной исключения
 */
public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getDocuments()[0].getAddress().getText());
    }
}
