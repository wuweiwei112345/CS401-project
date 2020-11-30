package com.pro.entity;

public class LLNode<T> {
	protected LLNode<T> next;
    protected T info;

    public LLNode(T info) {
        this.info = info;
        next = null;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setNext(LLNode<T> link) {
        this.next = link;
    }

    public LLNode<T> getNext() {
        return next;
    }
}