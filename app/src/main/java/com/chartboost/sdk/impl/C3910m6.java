package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.m6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3910m6 implements InterfaceC4054sh {

    /* JADX INFO: renamed from: e */
    public static final a f15330e = new a(null);

    /* JADX INFO: renamed from: a */
    public final Context f15331a;

    /* JADX INFO: renamed from: b */
    public final C4105v2 f15332b;

    /* JADX INFO: renamed from: c */
    public final C3795h6 f15333c;

    /* JADX INFO: renamed from: d */
    public final String f15334d;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.m6$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C3910m6(Context context, C4105v2 identity, C3795h6 c3795h6) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(identity, "identity");
        this.f15331a = context;
        this.f15332b = identity;
        this.f15333c = c3795h6;
        this.f15334d = C11744X3.i.f26328G;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4054sh
    /* JADX INFO: renamed from: a */
    public JSONObject mo17960a() throws JSONException {
        C3958o9 c3958o9M19635h = this.f15332b.m19635h();
        Double dM18632b = m18632b();
        C4106v3 c4106v3M19742a = new C4128w3().m19742a(this.f15331a);
        String strM19427b = AbstractC3771g5.m17768g(this.f15331a).m19427b();
        C3795h6 c3795h6 = this.f15333c;
        Integer numValueOf = c3795h6 != null ? Integer.valueOf(c3795h6.m17862f()) : null;
        C3795h6 c3795h7 = this.f15333c;
        Integer numValueOf2 = c3795h7 != null ? Integer.valueOf(c3795h7.m17861e()) : null;
        C3795h6 c3795h8 = this.f15333c;
        Integer numValueOf3 = c3795h8 != null ? Integer.valueOf(c3795h8.m17866j()) : null;
        String strM17779f = C3773g7.f14286a.m17779f();
        int i = c3958o9M19635h.m18899f() == EnumC3922mi.TRACKING_LIMITED ? 1 : 0;
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String str3 = "Android " + Build.VERSION.RELEASE;
        C3795h6 c3795h9 = this.f15333c;
        Float fValueOf = c3795h9 != null ? Float.valueOf(c3795h9.m17864h()) : null;
        String strM20065a = C4187yi.f17062b.m20065a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("battery_level", dM18632b);
        jSONObject.put(C11540L6.f24937Q0, c4106v3M19742a != null ? c4106v3M19742a.m19644d() : null);
        jSONObject.put("connection_type", strM19427b);
        jSONObject.put("device_type", numValueOf);
        jSONObject.put("display_height", numValueOf2);
        jSONObject.put("display_width", numValueOf3);
        jSONObject.put("language", strM17779f);
        jSONObject.put("lmt", i);
        jSONObject.put(C11540L6.f25013t, str);
        jSONObject.put(C11540L6.f24899B, str2);
        jSONObject.put(C11540L6.f24911F, C11744X3.f26142d);
        jSONObject.put("os_version", str3);
        jSONObject.put("pixel_ratio", fValueOf);
        jSONObject.put("user_agent", strM20065a);
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public final Double m18632b() {
        int intProperty;
        try {
            Object systemService = this.f15331a.getSystemService("batterymanager");
            BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
            if (batteryManager == null || (intProperty = batteryManager.getIntProperty(4)) < 0 || intProperty >= 101) {
                return null;
            }
            return Double.valueOf(((double) intProperty) / 100.0d);
        } catch (Exception unused) {
            return null;
        }
    }
}
