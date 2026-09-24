package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13074h;
import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.utils.C13120c;
import com.mbridge.msdk.foundation.same.report.campaignreport.C13136b;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13636h;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.c */
/* JADX INFO: compiled from: Listener.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13110c<T> implements InterfaceC13109b<T> {
    private long startTime;
    public int adType = 0;
    public String placementId = "";
    public String unitId = "";
    private C13136b mRequestTime = null;
    private String key = "";
    private String isRKE = "0";

    public void calcRequestTime(long j) {
        C13136b c13136b = new C13136b(new C13074h());
        this.mRequestTime = c13136b;
        c13136b.m37289b(this.unitId);
        this.mRequestTime.m37288b(1);
        this.mRequestTime.m37287a((j - this.startTime) + "");
    }

    public String getKey() {
        return this.key;
    }

    public String isRKE() {
        return this.isRKE;
    }

    public void onCancel() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onError(C13113a c13113a) {
    }

    public void onFinish() {
    }

    public void onNetworking() {
    }

    public void onPreExecute() {
        this.startTime = System.currentTimeMillis();
    }

    public void onProgressChange(long j, long j2) {
    }

    public void onRetry() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onSuccess(C13112e<T> c13112e) {
        try {
            String str = C13008c.m36588n().m36533b() + "_" + this.placementId + "_" + this.unitId + "_" + this.adType;
            C13636h.m39706b().m39711a(this.unitId);
            C13219q0.m37816b("Listener", c13112e.f35958c + " " + str);
            T t = c13112e.f35958c;
            if (t instanceof JSONObject) {
                C13120c.m37214b().m37216a(str, ((JSONObject) t).optInt("status"), ((JSONObject) c13112e.f35958c).toString(), System.currentTimeMillis());
            }
            if (c13112e.f35958c instanceof String) {
                C13120c.m37214b().m37216a(str, new JSONObject((String) c13112e.f35958c).optInt("status"), (String) c13112e.f35958c, System.currentTimeMillis());
            }
        } catch (Exception e) {
            C13219q0.m37816b("Listener", e.getMessage());
        }
    }

    public void saveHbState(int i) {
        C13136b c13136b = this.mRequestTime;
        if (c13136b != null) {
            c13136b.m37290c(i);
        }
    }

    public void saveRequestTime(int i) {
        C13136b c13136b = this.mRequestTime;
        if (c13136b != null) {
            c13136b.m37286a(i);
            this.mRequestTime.m37285a();
        }
    }

    public void setAdType(int i) {
        this.adType = i;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setRKE(String str) {
        this.isRKE = str;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }
}
