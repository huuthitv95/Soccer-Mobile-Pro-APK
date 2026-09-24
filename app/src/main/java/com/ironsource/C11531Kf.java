package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Kf */
/* JADX INFO: loaded from: classes6.dex */
public final class C11531Kf {

    /* JADX INFO: renamed from: a */
    private String f24872a;

    /* JADX WARN: Multi-variable type inference failed */
    public C11531Kf() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public final String m26306a() {
        return this.f24872a;
    }

    /* JADX INFO: renamed from: b */
    public final String m26307b() {
        return this.f24872a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11531Kf) && Intrinsics.areEqual(this.f24872a, ((C11531Kf) obj).f24872a);
    }

    public int hashCode() {
        String str = this.f24872a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.f24872a + ")";
    }

    public C11531Kf(String str) {
        this.f24872a = str;
    }

    /* JADX INFO: renamed from: a */
    public final C11531Kf m26305a(String str) {
        return new C11531Kf(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m26308b(String str) {
        this.f24872a = str;
    }

    public /* synthetic */ C11531Kf(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11531Kf m26304a(C11531Kf c11531Kf, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c11531Kf.f24872a;
        }
        return c11531Kf.m26305a(str);
    }
}
