package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ie */
/* JADX INFO: loaded from: classes6.dex */
public final class C12252ie {

    /* JADX INFO: renamed from: a */
    private final String f30593a;

    /* JADX INFO: renamed from: b */
    private final String f30594b;

    /* JADX INFO: renamed from: c */
    private final List<IronSource.EnumC12328a> f30595c;

    public C12252ie(String appKey, String str, List<IronSource.EnumC12328a> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        this.f30593a = appKey;
        this.f30594b = str;
        this.f30595c = legacyAdFormats;
    }

    /* JADX INFO: renamed from: a */
    public final String m31762a() {
        return this.f30593a;
    }

    /* JADX INFO: renamed from: b */
    public final String m31764b() {
        return this.f30594b;
    }

    /* JADX INFO: renamed from: c */
    public final List<IronSource.EnumC12328a> m31765c() {
        return this.f30595c;
    }

    /* JADX INFO: renamed from: d */
    public final String m31766d() {
        return this.f30593a;
    }

    /* JADX INFO: renamed from: e */
    public final List<IronSource.EnumC12328a> m31767e() {
        return this.f30595c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12252ie)) {
            return false;
        }
        C12252ie c12252ie = (C12252ie) obj;
        return Intrinsics.areEqual(this.f30593a, c12252ie.f30593a) && Intrinsics.areEqual(this.f30594b, c12252ie.f30594b) && Intrinsics.areEqual(this.f30595c, c12252ie.f30595c);
    }

    /* JADX INFO: renamed from: f */
    public final String m31768f() {
        return this.f30594b;
    }

    public int hashCode() {
        int iHashCode = this.f30593a.hashCode() * 31;
        String str = this.f30594b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f30595c.hashCode();
    }

    public String toString() {
        return "SdkInitRequest(appKey=" + this.f30593a + ", userId=" + this.f30594b + ", legacyAdFormats=" + this.f30595c + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C12252ie m31761a(String appKey, String str, List<IronSource.EnumC12328a> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        return new C12252ie(appKey, str, legacyAdFormats);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12252ie m31760a(C12252ie c12252ie, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c12252ie.f30593a;
        }
        if ((i & 2) != 0) {
            str2 = c12252ie.f30594b;
        }
        if ((i & 4) != 0) {
            list = c12252ie.f30595c;
        }
        return c12252ie.m31761a(str, str2, list);
    }

    /* JADX INFO: renamed from: a */
    public final void m31763a(List<? extends IronSource.EnumC12328a> adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f30595c.clear();
        this.f30595c.addAll(adFormats);
    }

    public /* synthetic */ C12252ie(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, list);
    }
}
