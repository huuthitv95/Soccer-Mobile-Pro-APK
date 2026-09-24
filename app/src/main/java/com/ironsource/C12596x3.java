package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.x3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12596x3 {

    /* JADX INFO: renamed from: a */
    private String f32760a;

    /* JADX INFO: renamed from: b */
    private String f32761b;

    /* JADX INFO: renamed from: c */
    private String f32762c;

    public C12596x3(String cachedAppKey, String cachedUserId, String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        this.f32760a = cachedAppKey;
        this.f32761b = cachedUserId;
        this.f32762c = cachedSettings;
    }

    /* JADX INFO: renamed from: a */
    public final String m34128a() {
        return this.f32760a;
    }

    /* JADX INFO: renamed from: b */
    public final String m34130b() {
        return this.f32761b;
    }

    /* JADX INFO: renamed from: c */
    public final String m34132c() {
        return this.f32762c;
    }

    /* JADX INFO: renamed from: d */
    public final String m34134d() {
        return this.f32760a;
    }

    /* JADX INFO: renamed from: e */
    public final String m34135e() {
        return this.f32762c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12596x3)) {
            return false;
        }
        C12596x3 c12596x3 = (C12596x3) obj;
        return Intrinsics.areEqual(this.f32760a, c12596x3.f32760a) && Intrinsics.areEqual(this.f32761b, c12596x3.f32761b) && Intrinsics.areEqual(this.f32762c, c12596x3.f32762c);
    }

    /* JADX INFO: renamed from: f */
    public final String m34136f() {
        return this.f32761b;
    }

    public int hashCode() {
        return (((this.f32760a.hashCode() * 31) + this.f32761b.hashCode()) * 31) + this.f32762c.hashCode();
    }

    public String toString() {
        return "CachedResponse(cachedAppKey=" + this.f32760a + ", cachedUserId=" + this.f32761b + ", cachedSettings=" + this.f32762c + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C12596x3 m34127a(String cachedAppKey, String cachedUserId, String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        return new C12596x3(cachedAppKey, cachedUserId, cachedSettings);
    }

    /* JADX INFO: renamed from: b */
    public final void m34131b(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f32762c = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m34133c(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f32761b = str;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12596x3 m34126a(C12596x3 c12596x3, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c12596x3.f32760a;
        }
        if ((i & 2) != 0) {
            str2 = c12596x3.f32761b;
        }
        if ((i & 4) != 0) {
            str3 = c12596x3.f32762c;
        }
        return c12596x3.m34127a(str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final void m34129a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f32760a = str;
    }
}
