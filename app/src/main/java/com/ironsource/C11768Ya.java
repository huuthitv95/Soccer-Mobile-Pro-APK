package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Ya */
/* JADX INFO: loaded from: classes6.dex */
public final class C11768Ya {

    /* JADX INFO: renamed from: a */
    private final C12190f6 f26640a;

    /* JADX INFO: renamed from: b */
    private final C12190f6 f26641b;

    /* JADX INFO: renamed from: c */
    private final C11338A2 f26642c;

    /* JADX INFO: renamed from: d */
    private final Map<String, C12427pd> f26643d;

    public C11768Ya(C12190f6 c12190f6, C12190f6 c12190f7, C11338A2 c11338a2, Map<String, C12427pd> providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        this.f26640a = c12190f6;
        this.f26641b = c12190f7;
        this.f26642c = c11338a2;
        this.f26643d = providerSettings;
    }

    /* JADX INFO: renamed from: a */
    public final C12190f6 m28038a() {
        return this.f26640a;
    }

    /* JADX INFO: renamed from: b */
    public final C12190f6 m28039b() {
        return this.f26641b;
    }

    /* JADX INFO: renamed from: c */
    public final C11338A2 m28040c() {
        return this.f26642c;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, C12427pd> m28041d() {
        return this.f26643d;
    }

    /* JADX INFO: renamed from: e */
    public final C11338A2 m28042e() {
        return this.f26642c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11768Ya)) {
            return false;
        }
        C11768Ya c11768Ya = (C11768Ya) obj;
        return Intrinsics.areEqual(this.f26640a, c11768Ya.f26640a) && Intrinsics.areEqual(this.f26641b, c11768Ya.f26641b) && Intrinsics.areEqual(this.f26642c, c11768Ya.f26642c) && Intrinsics.areEqual(this.f26643d, c11768Ya.f26643d);
    }

    /* JADX INFO: renamed from: f */
    public final C12190f6 m28043f() {
        return this.f26641b;
    }

    /* JADX INFO: renamed from: g */
    public final Map<String, C12427pd> m28044g() {
        return this.f26643d;
    }

    /* JADX INFO: renamed from: h */
    public final C12190f6 m28045h() {
        return this.f26640a;
    }

    public int hashCode() {
        C12190f6 c12190f6 = this.f26640a;
        int iHashCode = (c12190f6 == null ? 0 : c12190f6.hashCode()) * 31;
        C12190f6 c12190f7 = this.f26641b;
        int iHashCode2 = (iHashCode + (c12190f7 == null ? 0 : c12190f7.hashCode())) * 31;
        C11338A2 c11338a2 = this.f26642c;
        return ((iHashCode2 + (c11338a2 != null ? c11338a2.hashCode() : 0)) * 31) + this.f26643d.hashCode();
    }

    public String toString() {
        return "LevelPlayInitConfig2(rewarded=" + this.f26640a + ", interstitial=" + this.f26641b + ", banner=" + this.f26642c + ", providerSettings=" + this.f26643d + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C11768Ya m28037a(C12190f6 c12190f6, C12190f6 c12190f7, C11338A2 c11338a2, Map<String, C12427pd> providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        return new C11768Ya(c12190f6, c12190f7, c11338a2, providerSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11768Ya m28036a(C11768Ya c11768Ya, C12190f6 c12190f6, C12190f6 c12190f7, C11338A2 c11338a2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            c12190f6 = c11768Ya.f26640a;
        }
        if ((i & 2) != 0) {
            c12190f7 = c11768Ya.f26641b;
        }
        if ((i & 4) != 0) {
            c11338a2 = c11768Ya.f26642c;
        }
        if ((i & 8) != 0) {
            map = c11768Ya.f26643d;
        }
        return c11768Ya.m28037a(c12190f6, c12190f7, c11338a2, map);
    }
}
