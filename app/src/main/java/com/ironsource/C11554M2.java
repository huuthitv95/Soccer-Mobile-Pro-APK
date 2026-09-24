package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C12366o;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.M2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11554M2 extends AbstractC12593x0 {

    /* JADX INFO: renamed from: z */
    public static final a f25108z = new a(null);

    /* JADX INFO: renamed from: t */
    private final C11500J2 f25109t;

    /* JADX INFO: renamed from: u */
    private final boolean f25110u;

    /* JADX INFO: renamed from: v */
    private final C12575w0 f25111v;

    /* JADX INFO: renamed from: w */
    private final C11692U2 f25112w;

    /* JADX INFO: renamed from: x */
    private final String f25113x;

    /* JADX INFO: renamed from: y */
    private final String f25114y;

    /* JADX INFO: renamed from: com.ironsource.M2$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C11554M2 m26476a(C11500J2 adProperties, C11666Sa c11666Sa, boolean z) {
            List<C12533tc> listEmptyList;
            C11494Ie c11494IeM31106d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC12593x0.a aVar = AbstractC12593x0.f32712r;
            C11573N3 c11573n3M26133c = (c11666Sa == null || (c11494IeM31106d = c11666Sa.m31106d()) == null) ? null : c11494IeM31106d.m26133c();
            C11692U2 c11692u2M26603c = c11573n3M26133c != null ? c11573n3M26133c.m26603c() : null;
            if (c11692u2M26603c == null) {
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
            return new C11554M2(adProperties, z, new C12575w0(strM32774f, arrayList, c12266jaM31872b), c11692u2M26603c);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C11554M2(C11500J2 adProperties, boolean z, C12575w0 adUnitCommonData, C11692U2 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String strM33995f = adUnitCommonData.m33995f();
        List<NetworkSettings> listM33993d = adUnitCommonData.m33993d();
        C12266ja c12266jaM33994e = adUnitCommonData.m33994e();
        C12470s2 c12470s2M27560d = configs.m27560d();
        Intrinsics.checkNotNullExpressionValue(c12470s2M27560d, "configs.bannerAuctionSettings");
        super(adProperties, z, strM33995f, listM33993d, c12266jaM33994e, c12470s2M27560d, configs.m27555a(), (int) (configs.m27558b() / ((long) 1000)), configs.m27559c(), configs.m27562f(), -1, new C11588O0(C11588O0.a.MANUAL_WITH_AUTOMATIC_RELOAD, configs.m27560d().m33284j(), configs.m27560d().m33276b(), 1000 * ((long) configs.m27564h())), configs.m27561e(), configs.m27568l(), configs.m27570n(), configs.m27569m(), false, 65536, null);
        this.f25109t = adProperties;
        this.f25110u = z;
        this.f25111v = adUnitCommonData;
        this.f25112w = configs;
        this.f25113x = "BN";
        this.f25114y = C11683Ta.f25791d;
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C11500J2 mo26467b() {
        return this.f25109t;
    }

    /* JADX INFO: renamed from: B */
    public final C12575w0 m26463B() {
        return this.f25111v;
    }

    /* JADX INFO: renamed from: C */
    public final C11692U2 m26464C() {
        return this.f25112w;
    }

    /* JADX INFO: renamed from: a */
    public final C11554M2 m26465a(C11500J2 adProperties, boolean z, C12575w0 adUnitCommonData, C11692U2 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C11554M2(adProperties, z, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: c */
    public String mo26469c() {
        return this.f25113x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11554M2)) {
            return false;
        }
        C11554M2 c11554m2 = (C11554M2) obj;
        return Intrinsics.areEqual(this.f25109t, c11554m2.f25109t) && this.f25110u == c11554m2.f25110u && Intrinsics.areEqual(this.f25111v, c11554m2.f25111v) && Intrinsics.areEqual(this.f25112w, c11554m2.f25112w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.f25109t.hashCode() * 31;
        boolean z = this.f25110u;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + this.f25111v.hashCode()) * 31) + this.f25112w.hashCode();
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: j */
    public String mo26470j() {
        return this.f25114y;
    }

    public String toString() {
        return "BannerAdUnitData(adProperties=" + this.f25109t + ", isPublisherLoad=" + this.f25110u + ", adUnitCommonData=" + this.f25111v + ", configs=" + this.f25112w + ")";
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: u */
    public boolean mo26471u() {
        return this.f25110u;
    }

    /* JADX INFO: renamed from: w */
    public final C11500J2 m26472w() {
        return this.f25109t;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m26473x() {
        return this.f25110u;
    }

    /* JADX INFO: renamed from: y */
    public final C12575w0 m26474y() {
        return this.f25111v;
    }

    /* JADX INFO: renamed from: z */
    public final C11692U2 m26475z() {
        return this.f25112w;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11554M2 m26461a(C11554M2 c11554m2, C11500J2 c11500j2, boolean z, C12575w0 c12575w0, C11692U2 c11692u2, int i, Object obj) {
        if ((i & 1) != 0) {
            c11500j2 = c11554m2.f25109t;
        }
        if ((i & 2) != 0) {
            z = c11554m2.f25110u;
        }
        if ((i & 4) != 0) {
            c12575w0 = c11554m2.f25111v;
        }
        if ((i & 8) != 0) {
            c11692u2 = c11554m2.f25112w;
        }
        return c11554m2.m26465a(c11500j2, z, c12575w0, c11692u2);
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: b */
    public JSONObject mo26468b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject bannerSettings = providerSettings.getBannerSettings();
        Intrinsics.checkNotNullExpressionValue(bannerSettings, "providerSettings.bannerSettings");
        return bannerSettings;
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: a */
    public AdData mo26466a(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(mo26468b(providerSettings), mo26467b().m31567a(), m34088r(), new C12366o(ContextProvider.getInstance().getApplicationContext(), new C12313m0().m32121b(mo26467b().m26169i())));
        Intrinsics.checkNotNullExpressionValue(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…ze(adProperties.adSize)))");
        return adDataCreateAdDataForNetworkAdapter;
    }
}
