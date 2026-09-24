package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.z9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12638z9 extends AbstractC12593x0 {

    /* JADX INFO: renamed from: z */
    public static final a f33257z = new a(null);

    /* JADX INFO: renamed from: t */
    private final C12220h0 f33258t;

    /* JADX INFO: renamed from: u */
    private final boolean f33259u;

    /* JADX INFO: renamed from: v */
    private final C12575w0 f33260v;

    /* JADX INFO: renamed from: w */
    private final C11363B9 f33261w;

    /* JADX INFO: renamed from: x */
    private final String f33262x;

    /* JADX INFO: renamed from: y */
    private final String f33263y;

    /* JADX INFO: renamed from: com.ironsource.z9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C12638z9 m34278a(C12220h0 adProperties, C11666Sa c11666Sa, boolean z) {
            List<C12533tc> listEmptyList;
            C11494Ie c11494IeM31106d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC12593x0.a aVar = AbstractC12593x0.f32712r;
            C11573N3 c11573n3M26133c = (c11666Sa == null || (c11494IeM31106d = c11666Sa.m31106d()) == null) ? null : c11494IeM31106d.m26133c();
            C11363B9 c11363b9M26604d = c11573n3M26133c != null ? c11573n3M26133c.m26604d() : null;
            if (c11363b9M26604d == null) {
                throw new IllegalStateException("Error getting " + adProperties.m31567a() + " configurations");
            }
            if (c11666Sa == null || (listEmptyList = c11666Sa.m27471d(adProperties.m31572e(), adProperties.m31570c())) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            String strM32774f = IronSourceUtils.m32774f();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
            Iterator<T> it = listEmptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((C12533tc) it.next()).m33799f());
            }
            C12266ja c12266jaM31872b = C12266ja.m31872b();
            Intrinsics.checkNotNullExpressionValue(c12266jaM31872b, "getInstance()");
            return new C12638z9(adProperties, z, new C12575w0(strM32774f, arrayList, c12266jaM31872b), c11363b9M26604d);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C12638z9(C12220h0 adProperties, boolean z, C12575w0 adUnitCommonData, C11363B9 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String strM33995f = adUnitCommonData.m33995f();
        List<NetworkSettings> listM33993d = adUnitCommonData.m33993d();
        C12266ja c12266jaM33994e = adUnitCommonData.m33994e();
        C12470s2 c12470s2M25470g = configs.m25470g();
        Intrinsics.checkNotNullExpressionValue(c12470s2M25470g, "configs.interstitialAuctionSettings");
        super(adProperties, z, strM33995f, listM33993d, c12266jaM33994e, c12470s2M25470g, configs.m25466c(), configs.m25467d(), configs.m25469f(), configs.m25465b(), -1, new C11588O0(C11588O0.a.MANUAL, configs.m25470g().m33284j(), configs.m25470g().m33276b(), -1L), configs.m25471h(), configs.m25474k(), configs.m25476m(), configs.m25475l(), false, 65536, null);
        this.f33258t = adProperties;
        this.f33259u = z;
        this.f33260v = adUnitCommonData;
        this.f33261w = configs;
        this.f33262x = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.f33263y = C11683Ta.f25790c;
    }

    /* JADX INFO: renamed from: A */
    public final C12575w0 m34271A() {
        return this.f33260v;
    }

    /* JADX INFO: renamed from: B */
    public final C11363B9 m34272B() {
        return this.f33261w;
    }

    /* JADX INFO: renamed from: a */
    public final C12638z9 m34273a(C12220h0 adProperties, boolean z, C12575w0 adUnitCommonData, C11363B9 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C12638z9(adProperties, z, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: b */
    public C12220h0 mo26467b() {
        return this.f33258t;
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: c */
    public String mo26469c() {
        return this.f33262x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12638z9)) {
            return false;
        }
        C12638z9 c12638z9 = (C12638z9) obj;
        return Intrinsics.areEqual(this.f33258t, c12638z9.f33258t) && this.f33259u == c12638z9.f33259u && Intrinsics.areEqual(this.f33260v, c12638z9.f33260v) && Intrinsics.areEqual(this.f33261w, c12638z9.f33261w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.f33258t.hashCode() * 31;
        boolean z = this.f33259u;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + this.f33260v.hashCode()) * 31) + this.f33261w.hashCode();
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: j */
    public String mo26470j() {
        return this.f33263y;
    }

    public String toString() {
        return "InterstitialAdUnitData(adProperties=" + this.f33258t + ", isPublisherLoad=" + this.f33259u + ", adUnitCommonData=" + this.f33260v + ", configs=" + this.f33261w + ")";
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: u */
    public boolean mo26471u() {
        return this.f33259u;
    }

    /* JADX INFO: renamed from: w */
    public final C12220h0 m34274w() {
        return this.f33258t;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m34275x() {
        return this.f33259u;
    }

    /* JADX INFO: renamed from: y */
    public final C12575w0 m34276y() {
        return this.f33260v;
    }

    /* JADX INFO: renamed from: z */
    public final C11363B9 m34277z() {
        return this.f33261w;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12638z9 m34270a(C12638z9 c12638z9, C12220h0 c12220h0, boolean z, C12575w0 c12575w0, C11363B9 c11363b9, int i, Object obj) {
        if ((i & 1) != 0) {
            c12220h0 = c12638z9.f33258t;
        }
        if ((i & 2) != 0) {
            z = c12638z9.f33259u;
        }
        if ((i & 4) != 0) {
            c12575w0 = c12638z9.f33260v;
        }
        if ((i & 8) != 0) {
            c11363b9 = c12638z9.f33261w;
        }
        return c12638z9.m34273a(c12220h0, z, c12575w0, c11363b9);
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: b */
    public JSONObject mo26468b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject interstitialSettings = providerSettings.getInterstitialSettings();
        Intrinsics.checkNotNullExpressionValue(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }
}
