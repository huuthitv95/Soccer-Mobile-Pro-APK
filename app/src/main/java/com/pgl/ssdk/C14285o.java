package com.pgl.ssdk;

/* JADX INFO: renamed from: com.pgl.ssdk.o */
/* JADX INFO: loaded from: classes7.dex */
public final class C14285o<A, B> {

    /* JADX INFO: renamed from: a */
    private final A f41335a;

    /* JADX INFO: renamed from: b */
    private final B f41336b;

    public C14285o(A a2, B b) {
        this.f41335a = a2;
        this.f41336b = b;
    }

    /* JADX INFO: renamed from: a */
    public static <A, B> C14285o<A, B> m43096a(A a2, B b) {
        return new C14285o<>(a2, b);
    }

    /* JADX INFO: renamed from: a */
    public A m43097a() {
        return this.f41335a;
    }

    /* JADX INFO: renamed from: b */
    public B m43098b() {
        return this.f41336b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14285o.class != obj.getClass()) {
            return false;
        }
        C14285o c14285o = (C14285o) obj;
        A a2 = this.f41335a;
        if (a2 == null) {
            if (c14285o.f41335a != null) {
                return false;
            }
        } else if (!a2.equals(c14285o.f41335a)) {
            return false;
        }
        B b = this.f41336b;
        if (b == null) {
            if (c14285o.f41336b != null) {
                return false;
            }
        } else if (!b.equals(c14285o.f41336b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a2 = this.f41335a;
        int iHashCode = ((a2 == null ? 0 : a2.hashCode()) + 31) * 31;
        B b = this.f41336b;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }
}
