package com.github.ilebedenko.release_history.java9._3_anonymous_class_diamond_operator;

public abstract class Handler<T> {
    public T content;

    public Handler(T content) {
        this.content = content;
    }

    abstract void handle();
}
