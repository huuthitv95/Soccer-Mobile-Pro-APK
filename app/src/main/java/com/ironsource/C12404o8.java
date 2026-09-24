package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.o8 */
/* JADX INFO: loaded from: classes6.dex */
public class C12404o8 {

    /* JADX INFO: renamed from: c */
    public static final int f31621c = 1001;

    /* JADX INFO: renamed from: a */
    private String f31622a;

    /* JADX INFO: renamed from: b */
    private int f31623b;

    public C12404o8(int i, String str) {
        this.f31623b = i;
        this.f31622a = str == null ? "" : str;
    }

    /* JADX INFO: renamed from: a */
    public int m32956a() {
        return this.f31623b;
    }

    /* JADX INFO: renamed from: b */
    public String m32957b() {
        return this.f31622a;
    }

    public String toString() {
        return "error - code:" + this.f31623b + ", message:" + this.f31622a;
    }
}
