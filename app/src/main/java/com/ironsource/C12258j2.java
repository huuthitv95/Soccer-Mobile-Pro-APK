package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.j2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12258j2 {

    /* JADX INFO: renamed from: a */
    private final String f30602a;

    /* JADX INFO: renamed from: b */
    private final boolean f30603b;

    /* JADX INFO: renamed from: c */
    private boolean f30604c;

    /* JADX INFO: renamed from: d */
    private String f30605d;

    /* JADX INFO: renamed from: e */
    private Map<String, ? extends Object> f30606e;

    /* JADX INFO: renamed from: f */
    private C12106b2 f30607f;

    /* JADX INFO: renamed from: g */
    private Map<String, Object> f30608g;

    public C12258j2(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f30602a = name;
        this.f30603b = z;
        this.f30605d = "";
        this.f30606e = MapsKt.emptyMap();
        this.f30608g = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public final String m31781a() {
        return this.f30602a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m31787b() {
        return this.f30603b;
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, Object> m31788c() {
        return this.f30608g;
    }

    /* JADX INFO: renamed from: d */
    public final C12106b2 m31789d() {
        return this.f30607f;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m31790e() {
        return this.f30603b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12258j2)) {
            return false;
        }
        C12258j2 c12258j2 = (C12258j2) obj;
        return Intrinsics.areEqual(this.f30602a, c12258j2.f30602a) && this.f30603b == c12258j2.f30603b;
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, Object> m31791f() {
        return this.f30606e;
    }

    /* JADX INFO: renamed from: g */
    public final String m31792g() {
        return this.f30602a;
    }

    /* JADX INFO: renamed from: h */
    public final String m31793h() {
        return this.f30605d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f30602a.hashCode() * 31;
        boolean z = this.f30603b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m31794i() {
        return this.f30604c;
    }

    public String toString() {
        return "AuctionRequestInstanceInfo(name=" + this.f30602a + ", bidder=" + this.f30603b + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C12258j2 m31780a(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new C12258j2(name, z);
    }

    /* JADX INFO: renamed from: b */
    public final void m31786b(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f30606e = map;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12258j2 m31779a(C12258j2 c12258j2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c12258j2.f30602a;
        }
        if ((i & 2) != 0) {
            z = c12258j2.f30603b;
        }
        return c12258j2.m31780a(str, z);
    }

    /* JADX INFO: renamed from: a */
    public final void m31785a(boolean z) {
        this.f30604c = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m31783a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f30605d = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m31782a(C12106b2 c12106b2) {
        this.f30607f = c12106b2;
    }

    /* JADX INFO: renamed from: a */
    public final void m31784a(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f30608g = map;
    }
}
