package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.C */
/* JADX INFO: loaded from: classes6.dex */
public final class C11371C {

    /* JADX INFO: renamed from: a */
    private final AbstractC12593x0 f23995a;

    /* JADX INFO: renamed from: b */
    private final NetworkSettings f23996b;

    /* JADX INFO: renamed from: c */
    private final C12380n2 f23997c;

    /* JADX INFO: renamed from: d */
    private final C12159e1 f23998d;

    /* JADX INFO: renamed from: e */
    private final C12434q2 f23999e;

    /* JADX INFO: renamed from: f */
    private final int f24000f;

    /* JADX INFO: renamed from: g */
    private final C11497J f24001g;

    /* JADX INFO: renamed from: h */
    private final IronSource.EnumC12328a f24002h;

    /* JADX INFO: renamed from: i */
    private final JSONObject f24003i;

    /* JADX INFO: renamed from: j */
    private final String f24004j;

    /* JADX INFO: renamed from: k */
    private final int f24005k;

    /* JADX INFO: renamed from: l */
    private final String f24006l;

    /* JADX INFO: renamed from: m */
    private final C12434q2 f24007m;

    /* JADX INFO: renamed from: n */
    private final String f24008n;

    /* JADX INFO: renamed from: o */
    private final String f24009o;

    /* JADX INFO: renamed from: p */
    private final int f24010p;

    /* JADX INFO: renamed from: q */
    private final AdData f24011q;

    public C11371C(AbstractC12593x0 adUnitData, NetworkSettings providerSettings, C12380n2 auctionData, C12159e1 adapterConfig, C12434q2 auctionResponseItem, int i) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        this.f23995a = adUnitData;
        this.f23996b = providerSettings;
        this.f23997c = auctionData;
        this.f23998d = adapterConfig;
        this.f23999e = auctionResponseItem;
        this.f24000f = i;
        this.f24001g = new C11497J(C12450r0.a.DidntAttemptToLoad);
        IronSource.EnumC12328a enumC12328aM31567a = adUnitData.mo26467b().m31567a();
        this.f24002h = enumC12328aM31567a;
        this.f24003i = auctionData.m32808h();
        this.f24004j = auctionData.m32807g();
        this.f24005k = auctionData.m32809i();
        this.f24006l = auctionData.m32806f();
        this.f24007m = auctionData.m32810j();
        String strM31340f = adapterConfig.m31340f();
        Intrinsics.checkNotNullExpressionValue(strM31340f, "adapterConfig.providerName");
        this.f24008n = strM31340f;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{strM31340f, Integer.valueOf(hashCode())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        this.f24009o = str;
        this.f24010p = adapterConfig.m31338d();
        String strM33151k = auctionResponseItem.m33151k();
        Map<String, Object> mapM31478a = C12194fa.m31478a(auctionResponseItem.m33141a());
        Intrinsics.checkNotNullExpressionValue(mapM31478a, "jsonObjectToMap(auctionResponseItem.adData)");
        mapM31478a.put("adUnit", enumC12328aM31567a);
        HashMap map = new HashMap();
        Map<String, Object> mapM31478a2 = C12194fa.m31478a(adapterConfig.m31337c());
        Intrinsics.checkNotNullExpressionValue(mapM31478a2, "jsonObjectToMap(adapterConfig.adUnitSettings)");
        map.putAll(mapM31478a2);
        mapM31478a.put("userId", adUnitData.m34088r());
        mapM31478a.put("adUnitId", adUnitData.mo26467b().m31570c());
        mapM31478a.put("isMultipleAdUnits", Boolean.TRUE);
        this.f24011q = new AdData(strM33151k, map, mapM31478a);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC12593x0 m25518a() {
        return this.f23995a;
    }

    /* JADX INFO: renamed from: b */
    public final NetworkSettings m25520b() {
        return this.f23996b;
    }

    /* JADX INFO: renamed from: c */
    public final C12380n2 m25521c() {
        return this.f23997c;
    }

    /* JADX INFO: renamed from: d */
    public final C12159e1 m25522d() {
        return this.f23998d;
    }

    /* JADX INFO: renamed from: e */
    public final C12434q2 m25523e() {
        return this.f23999e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11371C)) {
            return false;
        }
        C11371C c11371c = (C11371C) obj;
        return Intrinsics.areEqual(this.f23995a, c11371c.f23995a) && Intrinsics.areEqual(this.f23996b, c11371c.f23996b) && Intrinsics.areEqual(this.f23997c, c11371c.f23997c) && Intrinsics.areEqual(this.f23998d, c11371c.f23998d) && Intrinsics.areEqual(this.f23999e, c11371c.f23999e) && this.f24000f == c11371c.f24000f;
    }

    /* JADX INFO: renamed from: f */
    public final int m25524f() {
        return this.f24000f;
    }

    /* JADX INFO: renamed from: g */
    public final AdData m25525g() {
        return this.f24011q;
    }

    /* JADX INFO: renamed from: h */
    public final IronSource.EnumC12328a m25526h() {
        return this.f24002h;
    }

    public int hashCode() {
        return (((((((((this.f23995a.hashCode() * 31) + this.f23996b.hashCode()) * 31) + this.f23997c.hashCode()) * 31) + this.f23998d.hashCode()) * 31) + this.f23999e.hashCode()) * 31) + this.f24000f;
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC12593x0 m25527i() {
        return this.f23995a;
    }

    /* JADX INFO: renamed from: j */
    public final C12159e1 m25528j() {
        return this.f23998d;
    }

    /* JADX INFO: renamed from: k */
    public final C12380n2 m25529k() {
        return this.f23997c;
    }

    /* JADX INFO: renamed from: l */
    public final String m25530l() {
        return this.f24006l;
    }

    /* JADX INFO: renamed from: m */
    public final String m25531m() {
        return this.f24004j;
    }

    /* JADX INFO: renamed from: n */
    public final C12434q2 m25532n() {
        return this.f23999e;
    }

    /* JADX INFO: renamed from: o */
    public final int m25533o() {
        return this.f24005k;
    }

    /* JADX INFO: renamed from: p */
    public final C12434q2 m25534p() {
        return this.f24007m;
    }

    /* JADX INFO: renamed from: q */
    public final JSONObject m25535q() {
        return this.f24003i;
    }

    /* JADX INFO: renamed from: r */
    public final String m25536r() {
        return this.f24008n;
    }

    /* JADX INFO: renamed from: s */
    public final int m25537s() {
        return this.f24010p;
    }

    /* JADX INFO: renamed from: t */
    public final C11497J m25538t() {
        return this.f24001g;
    }

    public String toString() {
        return "AdInstanceData(adUnitData=" + this.f23995a + ", providerSettings=" + this.f23996b + ", auctionData=" + this.f23997c + ", adapterConfig=" + this.f23998d + ", auctionResponseItem=" + this.f23999e + ", sessionDepth=" + this.f24000f + ")";
    }

    /* JADX INFO: renamed from: u */
    public final NetworkSettings m25539u() {
        return this.f23996b;
    }

    /* JADX INFO: renamed from: v */
    public final int m25540v() {
        return this.f24000f;
    }

    /* JADX INFO: renamed from: w */
    public final String m25541w() {
        return this.f24009o;
    }

    /* JADX INFO: renamed from: a */
    public final C11371C m25517a(AbstractC12593x0 adUnitData, NetworkSettings providerSettings, C12380n2 auctionData, C12159e1 adapterConfig, C12434q2 auctionResponseItem, int i) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        return new C11371C(adUnitData, providerSettings, auctionData, adapterConfig, auctionResponseItem, i);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11371C m25516a(C11371C c11371c, AbstractC12593x0 abstractC12593x0, NetworkSettings networkSettings, C12380n2 c12380n2, C12159e1 c12159e1, C12434q2 c12434q2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            abstractC12593x0 = c11371c.f23995a;
        }
        if ((i2 & 2) != 0) {
            networkSettings = c11371c.f23996b;
        }
        if ((i2 & 4) != 0) {
            c12380n2 = c11371c.f23997c;
        }
        if ((i2 & 8) != 0) {
            c12159e1 = c11371c.f23998d;
        }
        if ((i2 & 16) != 0) {
            c12434q2 = c11371c.f23999e;
        }
        if ((i2 & 32) != 0) {
            i = c11371c.f24000f;
        }
        C12434q2 c12434q3 = c12434q2;
        int i3 = i;
        return c11371c.m25517a(abstractC12593x0, networkSettings, c12380n2, c12159e1, c12434q3, i3);
    }

    /* JADX INFO: renamed from: a */
    public final void m25519a(C12450r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f24001g.m26151b(performance);
    }
}
