package com.facebook.bolts;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class Capture<T> {
    private T value;

    public Capture() {
    }

    public Capture(T t) {
        this.value = t;
    }

    public T get() {
        return this.value;
    }

    public void set(T t) {
        this.value = t;
    }
}
