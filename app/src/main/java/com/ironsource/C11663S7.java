package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.S7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11663S7 {

    /* JADX INFO: renamed from: a */
    private final int f25664a;

    /* JADX INFO: renamed from: b */
    private final int f25665b;

    public C11663S7(int i, int i2) {
        this.f25664a = i;
        this.f25665b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m27455a() {
        return this.f25664a;
    }

    /* JADX INFO: renamed from: b */
    public final int m27457b() {
        return this.f25665b;
    }

    /* JADX INFO: renamed from: c */
    public final int m27458c() {
        return this.f25665b;
    }

    /* JADX INFO: renamed from: d */
    public final int m27459d() {
        return this.f25664a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11663S7)) {
            return false;
        }
        C11663S7 c11663s7 = (C11663S7) obj;
        return this.f25664a == c11663s7.f25664a && this.f25665b == c11663s7.f25665b;
    }

    public int hashCode() {
        return (this.f25664a * 31) + this.f25665b;
    }

    public String toString() {
        return "ISContainerParams(width=" + this.f25664a + ", height=" + this.f25665b + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C11663S7 m27456a(int i, int i2) {
        return new C11663S7(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11663S7 m27454a(C11663S7 c11663s7, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = c11663s7.f25664a;
        }
        if ((i3 & 2) != 0) {
            i2 = c11663s7.f25665b;
        }
        return c11663s7.m27456a(i, i2);
    }
}
