package com.github.ilebedenko.release_history.java15._2_helpful_npes;

import lombok.Getter;

@Getter
public class Person {
    private final Document[] documents;

    public Person() {
        this.documents = new Document[]{new Document()};
    }
}
