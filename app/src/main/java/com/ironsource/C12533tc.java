package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.tc */
/* JADX INFO: loaded from: classes6.dex */
public final class C12533tc {

    /* JADX INFO: renamed from: a */
    private final String f32463a;

    /* JADX INFO: renamed from: b */
    private final String f32464b;

    /* JADX INFO: renamed from: c */
    private final String f32465c;

    /* JADX INFO: renamed from: d */
    private final String f32466d;

    /* JADX INFO: renamed from: e */
    private final String f32467e;

    /* JADX INFO: renamed from: f */
    private final JSONObject f32468f;

    /* JADX INFO: renamed from: g */
    private final Map<String, JSONObject> f32469g;

    /* JADX INFO: renamed from: h */
    private final String f32470h;

    /* JADX INFO: renamed from: i */
    private final String f32471i;

    /* JADX INFO: renamed from: j */
    private final boolean f32472j;

    /* JADX INFO: renamed from: k */
    private C12533tc f32473k;

    /* JADX INFO: renamed from: l */
    private final Lazy f32474l;

    /* JADX INFO: renamed from: com.ironsource.tc$a */
    static final class a extends Lambda implements Function0<NetworkSettings> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkSettings invoke() {
            String strM33803j = C12533tc.this.m33803j();
            String strM33805l = C12533tc.this.m33805l();
            String strM33801h = C12533tc.this.m33801h();
            String strM33804k = C12533tc.this.m33804k();
            JSONObject jSONObjectM33796c = C12533tc.this.m33796c();
            C12533tc c12533tc = C12533tc.this.f32473k;
            JSONObject jSONObjectM32750b = IronSourceUtils.m32750b(jSONObjectM33796c, c12533tc != null ? c12533tc.m33796c() : null);
            JSONObject jSONObjectM33806m = C12533tc.this.m33806m();
            C12533tc c12533tc2 = C12533tc.this.f32473k;
            JSONObject jSONObjectM32750b2 = IronSourceUtils.m32750b(jSONObjectM33806m, c12533tc2 != null ? c12533tc2.m33806m() : null);
            JSONObject jSONObjectM33798e = C12533tc.this.m33798e();
            C12533tc c12533tc3 = C12533tc.this.f32473k;
            JSONObject jSONObjectM32750b3 = IronSourceUtils.m32750b(jSONObjectM33798e, c12533tc3 != null ? c12533tc3.m33798e() : null);
            JSONObject jSONObjectM33797d = C12533tc.this.m33797d();
            C12533tc c12533tc4 = C12533tc.this.f32473k;
            JSONObject jSONObjectM32750b4 = IronSourceUtils.m32750b(jSONObjectM33797d, c12533tc4 != null ? c12533tc4.m33797d() : null);
            JSONObject jSONObjectM33800g = C12533tc.this.m33800g();
            C12533tc c12533tc5 = C12533tc.this.f32473k;
            NetworkSettings networkSettings = new NetworkSettings(strM33803j, strM33805l, strM33801h, strM33804k, jSONObjectM32750b, jSONObjectM32750b2, jSONObjectM32750b3, jSONObjectM32750b4, IronSourceUtils.m32750b(jSONObjectM33800g, c12533tc5 != null ? c12533tc5.m33800g() : null));
            networkSettings.setIsMultipleInstances(C12533tc.this.m33808o());
            networkSettings.setSubProviderId(C12533tc.this.m33807n());
            networkSettings.setAdSourceNameForEvents(C12533tc.this.m33794b());
            return networkSettings;
        }
    }

    public C12533tc(String providerName, JSONObject networkSettings) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        this.f32463a = providerName;
        this.f32464b = providerName;
        String strOptString = networkSettings.optString(C12551uc.f32570d, providerName);
        Intrinsics.checkNotNullExpressionValue(strOptString, "networkSettings.optStrin…,\n          providerName)");
        this.f32465c = strOptString;
        String strOptString2 = networkSettings.optString(C12551uc.f32572f, strOptString);
        Intrinsics.checkNotNullExpressionValue(strOptString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.f32466d = strOptString2;
        Object objOpt = networkSettings.opt("providerNetworkKey");
        this.f32467e = objOpt instanceof String ? (String) objOpt : null;
        this.f32468f = networkSettings.optJSONObject("application");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(adFormatArrValues.length);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            arrayList.add(C12518sf.m33677a(adFormat));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            String str = (String) obj;
            JSONObject jSONObjectOptJSONObject = networkSettings.optJSONObject("adFormats");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str) : null;
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            linkedHashMap.put(obj, jSONObjectOptJSONObject2);
        }
        this.f32469g = linkedHashMap;
        String strOptString3 = networkSettings.optString("spId", "0");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.f32470h = strOptString3;
        String strOptString4 = networkSettings.optString(C12551uc.f32567a);
        Intrinsics.checkNotNullExpressionValue(strOptString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.f32471i = strOptString4;
        this.f32472j = networkSettings.optBoolean(C12551uc.f32569c, false);
        this.f32474l = LazyKt.lazy(new a());
    }

    /* JADX INFO: renamed from: b */
    public final String m33794b() {
        return this.f32471i;
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m33796c() {
        return this.f32468f;
    }

    /* JADX INFO: renamed from: d */
    public final JSONObject m33797d() {
        JSONObject jSONObjectM32750b = IronSourceUtils.m32750b(this.f32469g.get("banner"), this.f32468f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectM32750b, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectM32750b;
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m33798e() {
        JSONObject jSONObjectM32750b = IronSourceUtils.m32750b(this.f32469g.get("interstitial"), this.f32468f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectM32750b, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectM32750b;
    }

    /* JADX INFO: renamed from: f */
    public final NetworkSettings m33799f() {
        return (NetworkSettings) this.f32474l.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final JSONObject m33800g() {
        JSONObject jSONObjectM32750b = IronSourceUtils.m32750b(this.f32469g.get("nativeAd"), this.f32468f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectM32750b, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectM32750b;
    }

    /* JADX INFO: renamed from: h */
    public final String m33801h() {
        return this.f32466d;
    }

    /* JADX INFO: renamed from: i */
    public final String m33802i() {
        return this.f32464b;
    }

    /* JADX INFO: renamed from: j */
    public final String m33803j() {
        return this.f32463a;
    }

    /* JADX INFO: renamed from: k */
    public final String m33804k() {
        return this.f32467e;
    }

    /* JADX INFO: renamed from: l */
    public final String m33805l() {
        return this.f32465c;
    }

    /* JADX INFO: renamed from: m */
    public final JSONObject m33806m() {
        JSONObject jSONObjectM32750b = IronSourceUtils.m32750b(this.f32469g.get("rewarded"), this.f32468f);
        Intrinsics.checkNotNullExpressionValue(jSONObjectM32750b, "mergeJsons(\n            …     applicationSettings)");
        return jSONObjectM32750b;
    }

    /* JADX INFO: renamed from: n */
    public final String m33807n() {
        return this.f32470h;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m33808o() {
        return this.f32472j;
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, JSONObject> m33793a() {
        return this.f32469g;
    }

    /* JADX INFO: renamed from: b */
    public final void m33795b(C12533tc c12533tc) {
        this.f32473k = c12533tc;
    }
}
