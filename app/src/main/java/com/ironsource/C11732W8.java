package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.W8 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11732W8 {

    /* JADX INFO: renamed from: a */
    private final String f26095a;

    /* JADX INFO: renamed from: b */
    private final String f26096b;

    /* JADX INFO: renamed from: c */
    private InterfaceC11740X f26097c;

    /* JADX INFO: renamed from: d */
    private boolean f26098d;

    /* JADX INFO: renamed from: e */
    private String f26099e;

    /* JADX INFO: renamed from: f */
    private String f26100f;

    public C11732W8(String appKey, String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f26095a = appKey;
        this.f26096b = userId;
    }

    /* JADX INFO: renamed from: a */
    public final String m27819a() {
        return this.f26095a;
    }

    /* JADX INFO: renamed from: b */
    public final String m27823b() {
        return this.f26096b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m27825c() {
        return this.f26098d;
    }

    /* JADX INFO: renamed from: d */
    public final String m27826d() {
        return this.f26095a;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC11740X m27827e() {
        return this.f26097c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11732W8)) {
            return false;
        }
        C11732W8 c11732w8 = (C11732W8) obj;
        return Intrinsics.areEqual(this.f26095a, c11732w8.f26095a) && Intrinsics.areEqual(this.f26096b, c11732w8.f26096b);
    }

    /* JADX INFO: renamed from: f */
    public final String m27828f() {
        return this.f26100f;
    }

    /* JADX INFO: renamed from: g */
    public final String m27829g() {
        return this.f26099e;
    }

    /* JADX INFO: renamed from: h */
    public final String m27830h() {
        return this.f26096b;
    }

    public int hashCode() {
        return (this.f26095a.hashCode() * 31) + this.f26096b.hashCode();
    }

    public String toString() {
        return "InitConfig(appKey=" + this.f26095a + ", userId=" + this.f26096b + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C11732W8 m27817a(String appKey, String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new C11732W8(appKey, userId);
    }

    /* JADX INFO: renamed from: b */
    public final void m27824b(String str) {
        this.f26099e = str;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11732W8 m27816a(C11732W8 c11732w8, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c11732w8.f26095a;
        }
        if ((i & 2) != 0) {
            str2 = c11732w8.f26096b;
        }
        return c11732w8.m27817a(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m27820a(InterfaceC11740X interfaceC11740X) {
        this.f26097c = interfaceC11740X;
    }

    /* JADX INFO: renamed from: a */
    public final void m27822a(boolean z) {
        this.f26098d = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m27821a(String str) {
        this.f26100f = str;
    }

    /* JADX INFO: renamed from: a */
    public final <T> T m27818a(InterfaceC11437Fb<C11732W8, T> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.mo25577a(this);
    }
}
