package com.ironsource;

import com.ironsource.mediationsdk.C12333d;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.r2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12452r2 {

    /* JADX INFO: renamed from: a */
    private final String f31820a;

    /* JADX INFO: renamed from: b */
    private final C12333d f31821b;

    public C12452r2(String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        this.f31820a = serverData;
        this.f31821b = C12333d.m32333b();
    }

    /* JADX INFO: renamed from: c */
    private final String m33210c() {
        return this.f31820a;
    }

    /* JADX INFO: renamed from: a */
    public final C12452r2 m33211a(String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        return new C12452r2(serverData);
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m33213b() {
        Map<String, String> mapM32341b = this.f31821b.m32341b(this.f31820a);
        Intrinsics.checkNotNullExpressionValue(mapM32341b, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return mapM32341b;
    }

    /* JADX INFO: renamed from: d */
    public final String m33214d() {
        String strM32342c = this.f31821b.m32342c(this.f31820a);
        Intrinsics.checkNotNullExpressionValue(strM32342c, "auctionDataUtils.getDyna…romServerData(serverData)");
        return strM32342c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12452r2) && Intrinsics.areEqual(this.f31820a, ((C12452r2) obj).f31820a);
    }

    public int hashCode() {
        return this.f31820a.hashCode();
    }

    public String toString() {
        return "AuctionServerData(serverData=" + this.f31820a + ")";
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12452r2 m33209a(C12452r2 c12452r2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c12452r2.f31820a;
        }
        return c12452r2.m33211a(str);
    }

    /* JADX INFO: renamed from: a */
    public final String m33212a() {
        String strM32335a = this.f31821b.m32335a(this.f31820a);
        Intrinsics.checkNotNullExpressionValue(strM32335a, "auctionDataUtils.getAdmFromServerData(serverData)");
        return strM32335a;
    }
}
