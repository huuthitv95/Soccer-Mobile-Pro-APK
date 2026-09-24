package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.R3 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11642R3 implements InterfaceC12457r7 {

    /* JADX INFO: renamed from: a */
    private InterfaceC12439q7 f25567a;

    protected AbstractC11642R3(JSONObject jSONObject, Context context) {
        this.f25567a = m27318a(jSONObject, context);
        Logger.m33642i("R3", "created ConnectivityAdapter with strategy " + this.f25567a.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m27319a(Context context) {
        return this.f25567a.mo31316c(context);
    }

    @Override // com.ironsource.InterfaceC12457r7
    /* JADX INFO: renamed from: a */
    public void mo27320a() {
    }

    @Override // com.ironsource.InterfaceC12457r7
    /* JADX INFO: renamed from: a */
    public void mo27321a(String str, JSONObject jSONObject) {
    }

    /* JADX INFO: renamed from: b */
    public void m27323b(Context context) {
        this.f25567a.mo31315b(context);
    }

    @Override // com.ironsource.InterfaceC12457r7
    /* JADX INFO: renamed from: b */
    public void mo27324b(String str, JSONObject jSONObject) {
    }

    /* JADX INFO: renamed from: c */
    public void m27325c(Context context) {
        this.f25567a.mo31314a(context);
    }

    /* JADX INFO: renamed from: b */
    public void m27322b() {
        this.f25567a.mo31313a();
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC12439q7 m27318a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(C11744X3.j.f26445g0) == 1) {
            return new BroadcastReceiverStrategy(this);
        }
        if (C11409E1.m25650c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new C12152dc(this);
        }
        return new BroadcastReceiverStrategy(this);
    }
}
