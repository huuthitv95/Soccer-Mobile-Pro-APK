package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ac */
/* JADX INFO: loaded from: classes6.dex */
public final class C11804ac extends AbstractC12593x0 {

    /* JADX INFO: renamed from: y */
    public static final a f26785y = new a(null);

    /* JADX INFO: renamed from: t */
    private final C12220h0 f26786t;

    /* JADX INFO: renamed from: u */
    private final C12575w0 f26787u;

    /* JADX INFO: renamed from: v */
    private final C11545Lb f26788v;

    /* JADX INFO: renamed from: w */
    private final String f26789w;

    /* JADX INFO: renamed from: x */
    private final String f26790x;

    /* JADX INFO: renamed from: com.ironsource.ac$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C11804ac m28177a(C12220h0 adProperties, C11666Sa c11666Sa) {
            List<C12533tc> listEmptyList;
            C11494Ie c11494IeM31106d;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC12593x0.a aVar = AbstractC12593x0.f32712r;
            C11573N3 c11573n3M26133c = (c11666Sa == null || (c11494IeM31106d = c11666Sa.m31106d()) == null) ? null : c11494IeM31106d.m26133c();
            C11545Lb c11545LbM26605e = c11573n3M26133c != null ? c11573n3M26133c.m26605e() : null;
            if (c11545LbM26605e == null) {
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
            return new C11804ac(adProperties, new C12575w0(strM32774f, arrayList, c12266jaM31872b), c11545LbM26605e);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11804ac(C12220h0 adProperties, C12575w0 adUnitCommonData, C11545Lb configs) {
        super(adProperties, true, adUnitCommonData.m33995f(), adUnitCommonData.m33993d(), adUnitCommonData.m33994e(), configs.m26417d(), configs.m26411b(), (int) (configs.m26415c() / ((long) 1000)), configs.m26410a(), configs.m26419f(), -1, new C11588O0(C11588O0.a.MANUAL, configs.m26417d().m33284j(), configs.m26417d().m33276b(), -1L), configs.m26421h(), configs.m26422i(), configs.m26424k(), configs.m26423j(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.f26786t = adProperties;
        this.f26787u = adUnitCommonData;
        this.f26788v = configs;
        this.f26789w = "NA";
        this.f26790x = C11683Ta.f25792e;
    }

    /* JADX INFO: renamed from: A */
    public final C11545Lb m28171A() {
        return this.f26788v;
    }

    /* JADX INFO: renamed from: a */
    public final C11804ac m28172a(C12220h0 adProperties, C12575w0 adUnitCommonData, C11545Lb configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C11804ac(adProperties, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: b */
    public C12220h0 mo26467b() {
        return this.f26786t;
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: c */
    public String mo26469c() {
        return this.f26789w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11804ac)) {
            return false;
        }
        C11804ac c11804ac = (C11804ac) obj;
        return Intrinsics.areEqual(this.f26786t, c11804ac.f26786t) && Intrinsics.areEqual(this.f26787u, c11804ac.f26787u) && Intrinsics.areEqual(this.f26788v, c11804ac.f26788v);
    }

    public int hashCode() {
        return (((this.f26786t.hashCode() * 31) + this.f26787u.hashCode()) * 31) + this.f26788v.hashCode();
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: j */
    public String mo26470j() {
        return this.f26790x;
    }

    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.f26786t + ", adUnitCommonData=" + this.f26787u + ", configs=" + this.f26788v + ")";
    }

    /* JADX INFO: renamed from: w */
    public final C12220h0 m28173w() {
        return this.f26786t;
    }

    /* JADX INFO: renamed from: x */
    public final C12575w0 m28174x() {
        return this.f26787u;
    }

    /* JADX INFO: renamed from: y */
    public final C11545Lb m28175y() {
        return this.f26788v;
    }

    /* JADX INFO: renamed from: z */
    public final C12575w0 m28176z() {
        return this.f26787u;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11804ac m28170a(C11804ac c11804ac, C12220h0 c12220h0, C12575w0 c12575w0, C11545Lb c11545Lb, int i, Object obj) {
        if ((i & 1) != 0) {
            c12220h0 = c11804ac.f26786t;
        }
        if ((i & 2) != 0) {
            c12575w0 = c11804ac.f26787u;
        }
        if ((i & 4) != 0) {
            c11545Lb = c11804ac.f26788v;
        }
        return c11804ac.m28172a(c12220h0, c12575w0, c11545Lb);
    }

    @Override // com.ironsource.AbstractC12593x0
    /* JADX INFO: renamed from: b */
    public JSONObject mo26468b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }
}
