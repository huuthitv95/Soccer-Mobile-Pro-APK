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

/* JADX INFO: renamed from: com.ironsource.Pd */
/* JADX INFO: loaded from: classes6.dex */
public final class C11619Pd extends AbstractC12593x0 {

    /* JADX INFO: renamed from: z */
    public static final a f25533z = new a(null);

    /* JADX INFO: renamed from: t */
    private final C12220h0 f25534t;

    /* JADX INFO: renamed from: u */
    private final boolean f25535u;

    /* JADX INFO: renamed from: v */
    private final C12575w0 f25536v;

    /* JADX INFO: renamed from: w */
    private final C11652Rd f25537w;

    /* JADX INFO: renamed from: x */
    private final String f25538x;

    /* JADX INFO: renamed from: y */
    private final String f25539y;

    /* JADX INFO: renamed from: com.ironsource.Pd$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C11619Pd m27259a(C12220h0 adProperties, C11666Sa c11666Sa, boolean z) {
            List<C12533tc> listEmptyList;
            C11494Ie c11494IeM31106d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC12593x0.a aVar = AbstractC12593x0.f32712r;
            C11573N3 c11573n3M26133c = (c11666Sa == null || (c11494IeM31106d = c11666Sa.m31106d()) == null) ? null : c11494IeM31106d.m26133c();
            C11652Rd c11652RdM26606f = c11573n3M26133c != null ? c11573n3M26133c.m26606f() : null;
            if (c11652RdM26606f == null) {
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
            return new C11619Pd(adProperties, z, new C12575w0(strM32774f, arrayList, c12266jaM31872b), c11652RdM26606f);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C11619Pd(C12220h0 adProperties, boolean z, C12575w0 adUnitCommonData, C11652Rd configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String strM33995f = adUnitCommonData.m33995f();
        List<NetworkSettings> listM33993d = adUnitCommonData.m33993d();
        C12266ja c12266jaM33994e = adUnitCommonData.m33994e();
        C12470s2 c12470s2M27390k = configs.m27390k();
        Intrinsics.checkNotNullExpressionValue(c12470s2M27390k, "configs.rewardedVideoAuctionSettings");
        super(adProperties, z, strM33995f, listM33993d, c12266jaM33994e, c12470s2M27390k, configs.m27386g(), configs.m27387h(), configs.m27389j(), configs.m27381b(), configs.m27382c(), new C11588O0(C11588O0.a.MANUAL, configs.m27390k().m33284j(), configs.m27390k().m33276b(), -1L), configs.m27391l(), configs.m27385f(), configs.m27394o(), configs.m27393n(), false, 65536, null);
        this.f25534t = adProperties;
        this.f25535u = z;
        this.f25536v = adUnitCommonData;
        this.f25537w = configs;
        this.f25538x = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.f25539y = C11683Ta.f25789b;
    }

    /* JADX INFO: renamed from: A */
    public final C12575w0 m27252A() {
        return this.f25536v;
    }

    /* JADX INFO: renamed from: B */
    public final C11652Rd m27253B() {
        return this.f25537w;
    }

    /* JADX INFO: renamed from: a */
    public final C11619Pd m27254a(C12220h0 adProperties, boolean z, C12575w0 adUnitCommonData, C11652Rd configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C11619Pd(adProperties, z, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: b */
    public C12220h0 mo26467b() {
        return this.f25534t;
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: c */
    public String mo26469c() {
        return this.f25538x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11619Pd)) {
            return false;
        }
        C11619Pd c11619Pd = (C11619Pd) obj;
        return Intrinsics.areEqual(this.f25534t, c11619Pd.f25534t) && this.f25535u == c11619Pd.f25535u && Intrinsics.areEqual(this.f25536v, c11619Pd.f25536v) && Intrinsics.areEqual(this.f25537w, c11619Pd.f25537w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.f25534t.hashCode() * 31;
        boolean z = this.f25535u;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + this.f25536v.hashCode()) * 31) + this.f25537w.hashCode();
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: j */
    public String mo26470j() {
        return this.f25539y;
    }

    public String toString() {
        return "RewardedAdUnitData(adProperties=" + this.f25534t + ", isPublisherLoad=" + this.f25535u + ", adUnitCommonData=" + this.f25536v + ", configs=" + this.f25537w + ")";
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: u */
    public boolean mo26471u() {
        return this.f25535u;
    }

    /* JADX INFO: renamed from: w */
    public final C12220h0 m27255w() {
        return this.f25534t;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m27256x() {
        return this.f25535u;
    }

    /* JADX INFO: renamed from: y */
    public final C12575w0 m27257y() {
        return this.f25536v;
    }

    /* JADX INFO: renamed from: z */
    public final C11652Rd m27258z() {
        return this.f25537w;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11619Pd m27251a(C11619Pd c11619Pd, C12220h0 c12220h0, boolean z, C12575w0 c12575w0, C11652Rd c11652Rd, int i, Object obj) {
        if ((i & 1) != 0) {
            c12220h0 = c11619Pd.f25534t;
        }
        if ((i & 2) != 0) {
            z = c11619Pd.f25535u;
        }
        if ((i & 4) != 0) {
            c12575w0 = c11619Pd.f25536v;
        }
        if ((i & 8) != 0) {
            c11652Rd = c11619Pd.f25537w;
        }
        return c11619Pd.m27254a(c12220h0, z, c12575w0, c11652Rd);
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: b */
    public JSONObject mo26468b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject rewardedVideoSettings = providerSettings.getRewardedVideoSettings();
        Intrinsics.checkNotNullExpressionValue(rewardedVideoSettings, "providerSettings.rewardedVideoSettings");
        return rewardedVideoSettings;
    }
}
