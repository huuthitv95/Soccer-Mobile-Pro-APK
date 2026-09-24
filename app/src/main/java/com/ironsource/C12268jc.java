package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.jc */
/* JADX INFO: loaded from: classes6.dex */
public class C12268jc {

    /* JADX INFO: renamed from: b */
    private final InterfaceC12582w7 f30698b = C11455Gb.m25891U().mo25842a();

    /* JADX INFO: renamed from: a */
    C11612P6 f30697a = new C11612P6();

    /* JADX INFO: renamed from: a */
    public void m31884a(Context context) {
        if (context instanceof Activity) {
            this.f30697a.m27203a(C11540L6.f24995n, Boolean.valueOf(this.f30698b.mo27888a((Activity) context)));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m31890b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.f30697a.m27203a(C11540L6.f24980i, new JSONObject(controllerConfig).opt(C11744X3.a.f26180q));
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public void m31892c() {
        this.f30697a.m27203a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    /* JADX INFO: renamed from: d */
    public void m31893d() {
        this.f30697a.m27203a(C11540L6.f24946V, "9.3.0");
    }

    /* JADX INFO: renamed from: e */
    public void m31894e() {
        HashMap map = new HashMap();
        map.put(C11540L6.f24908E, C11366Bc.f23953f);
        map.put(C11540L6.f24905D, C11366Bc.f23952e);
        this.f30697a.m27207a(map);
    }

    /* JADX INFO: renamed from: a */
    public void m31883a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.f30697a.m27206a("debug", jSONObject);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m31888a(JSONObject jSONObject) {
        this.f30697a.m27206a(C11540L6.f24989l, jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public void m31891b(Context context) {
        this.f30697a.m27203a("gpi", Boolean.valueOf(C11753Xc.m27956e(context)));
    }

    /* JADX INFO: renamed from: a */
    public void m31885a(C12386n8.c cVar) {
        this.f30697a.m27203a(C11540L6.f25030y1, Integer.valueOf(cVar.ordinal()));
    }

    /* JADX INFO: renamed from: a */
    public void m31887a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.f30697a.m27203a(entry.getKey(), (Object) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m31886a(List<String> list) {
        this.f30697a.m27203a(C11540L6.f24901B1, list);
    }

    /* JADX INFO: renamed from: a */
    public void m31889a(boolean z) {
        this.f30697a.m27203a(C11540L6.f24941S0, Boolean.valueOf(z));
    }
}
