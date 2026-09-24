package com.chartboost.sdk.impl;

import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.vd */
/* JADX INFO: loaded from: classes3.dex */
public final class C4116vd implements InterfaceC4054sh {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f16603a;

    /* JADX INFO: renamed from: b */
    public final C3665be f16604b;

    public C4116vd(AtomicReference sdkConfigRef, C3665be openMeasurementManager) {
        Intrinsics.checkNotNullParameter(sdkConfigRef, "sdkConfigRef");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        this.f16603a = sdkConfigRef;
        this.f16604b = openMeasurementManager;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4054sh
    /* JADX INFO: renamed from: a */
    public JSONObject mo17960a() throws JSONException {
        C3920mg c3920mg = (C3920mg) this.f16603a.get();
        if (c3920mg == null) {
            return new JSONObject();
        }
        C4138wd c4138wdM18665d = c3920mg.m18665d();
        if (c4138wdM18665d == null || !c4138wdM18665d.m19790g()) {
            return new JSONObject();
        }
        Partner partnerM16929c = this.f16604b.m16929c();
        JSONObject jSONObject = new JSONObject();
        if (partnerM16929c != null) {
            jSONObject.put("omidpn", partnerM16929c.getName());
            jSONObject.put("omidpv", partnerM16929c.getVersion());
        }
        jSONObject.put("omidv", Omid.getVersion());
        return jSONObject;
    }
}
