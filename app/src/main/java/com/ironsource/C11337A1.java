package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.A1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11337A1 {

    /* JADX INFO: renamed from: a */
    private final String f23775a;

    /* JADX WARN: Multi-variable type inference failed */
    public C11337A1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public final String m25240a() {
        return this.f23775a;
    }

    /* JADX INFO: renamed from: b */
    public final String m25241b() {
        return this.f23775a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11337A1) && Intrinsics.areEqual(this.f23775a, ((C11337A1) obj).f23775a);
    }

    public int hashCode() {
        return this.f23775a.hashCode();
    }

    public String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.f23775a + ")";
    }

    public C11337A1(String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.f23775a = auctionData;
    }

    /* JADX INFO: renamed from: a */
    public final C11337A1 m25239a(String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        return new C11337A1(auctionData);
    }

    public /* synthetic */ C11337A1(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11337A1 m25238a(C11337A1 c11337a1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c11337a1.f23775a;
        }
        return c11337a1.m25239a(str);
    }
}
