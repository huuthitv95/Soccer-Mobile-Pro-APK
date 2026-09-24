package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Mc */
/* JADX INFO: loaded from: classes6.dex */
public final class C11564Mc {

    /* JADX INFO: renamed from: a */
    private final String f25164a;

    /* JADX INFO: renamed from: b */
    private final String f25165b;

    public C11564Mc(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f25164a = url;
        this.f25165b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m26551a() {
        return this.f25164a;
    }

    /* JADX INFO: renamed from: b */
    public final String m26552b() {
        return this.f25165b;
    }

    /* JADX INFO: renamed from: c */
    public final String m26553c() {
        return this.f25165b;
    }

    /* JADX INFO: renamed from: d */
    public final String m26554d() {
        return this.f25164a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11564Mc)) {
            return false;
        }
        C11564Mc c11564Mc = (C11564Mc) obj;
        return Intrinsics.areEqual(this.f25164a, c11564Mc.f25164a) && Intrinsics.areEqual(this.f25165b, c11564Mc.f25165b);
    }

    public int hashCode() {
        int iHashCode = this.f25164a.hashCode() * 31;
        String str = this.f25165b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OpenUrl(url=" + this.f25164a + ", packageName=" + this.f25165b + ")";
    }

    public /* synthetic */ C11564Mc(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    /* JADX INFO: renamed from: a */
    public final C11564Mc m26550a(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new C11564Mc(url, str);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11564Mc m26549a(C11564Mc c11564Mc, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c11564Mc.f25164a;
        }
        if ((i & 2) != 0) {
            str2 = c11564Mc.f25165b;
        }
        return c11564Mc.m26550a(str, str2);
    }
}
