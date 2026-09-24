package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.c2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12124c2 {

    /* JADX INFO: renamed from: a */
    private final String f30156a;

    /* JADX INFO: renamed from: b */
    private final boolean f30157b;

    /* JADX INFO: renamed from: c */
    private boolean f30158c;

    /* JADX INFO: renamed from: d */
    private String f30159d;

    /* JADX INFO: renamed from: e */
    private Map<String, ? extends Object> f30160e;

    /* JADX INFO: renamed from: f */
    private C12106b2 f30161f;

    /* JADX INFO: renamed from: g */
    private Map<String, Object> f30162g;

    public C12124c2(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f30156a = name;
        this.f30157b = z;
        this.f30159d = "";
        this.f30160e = MapsKt.emptyMap();
        this.f30162g = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public final String m31240a() {
        return this.f30156a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m31246b() {
        return this.f30157b;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, Object> m31247c() {
        return this.f30162g;
    }

    /* JADX INFO: renamed from: d */
    public final C12106b2 m31248d() {
        return this.f30161f;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m31249e() {
        return this.f30157b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12124c2)) {
            return false;
        }
        C12124c2 c12124c2 = (C12124c2) obj;
        return Intrinsics.areEqual(this.f30156a, c12124c2.f30156a) && this.f30157b == c12124c2.f30157b;
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, Object> m31250f() {
        return this.f30160e;
    }

    /* JADX INFO: renamed from: g */
    public final String m31251g() {
        return this.f30156a;
    }

    /* JADX INFO: renamed from: h */
    public final String m31252h() {
        return this.f30159d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f30156a.hashCode() * 31;
        boolean z = this.f30157b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m31253i() {
        return this.f30158c;
    }

    public String toString() {
        return "AuctionInstanceInfo(name=" + this.f30156a + ", bidder=" + this.f30157b + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C12124c2 m31239a(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new C12124c2(name, z);
    }

    /* JADX INFO: renamed from: b */
    public final void m31245b(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f30160e = map;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12124c2 m31238a(C12124c2 c12124c2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c12124c2.f30156a;
        }
        if ((i & 2) != 0) {
            z = c12124c2.f30157b;
        }
        return c12124c2.m31239a(str, z);
    }

    /* JADX INFO: renamed from: a */
    public final void m31244a(boolean z) {
        this.f30158c = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m31242a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f30159d = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m31241a(C12106b2 c12106b2) {
        this.f30161f = c12106b2;
    }

    /* JADX INFO: renamed from: a */
    public final void m31243a(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f30162g = map;
    }
}
