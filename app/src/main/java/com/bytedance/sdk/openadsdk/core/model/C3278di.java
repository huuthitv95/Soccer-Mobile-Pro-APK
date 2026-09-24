package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.component.utils.C2707ac;
import com.facebook.internal.NativeProtocol;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.di */
/* JADX INFO: loaded from: classes3.dex */
public class C3278di {
    private int xha;

    /* JADX INFO: renamed from: ri */
    private String f11218ri = "";

    /* JADX INFO: renamed from: lr */
    private String f11217lr = "";

    /* JADX INFO: renamed from: ik */
    private String f11215ik = "";

    /* JADX INFO: renamed from: ka */
    private String f11216ka = "";

    /* JADX INFO: renamed from: fi */
    private double f11214fi = -1.0d;

    /* JADX INFO: renamed from: di */
    private int f11213di = -1;

    /* JADX INFO: renamed from: di */
    public int m14067di() {
        return this.xha;
    }

    /* JADX INFO: renamed from: fi */
    public int m14068fi() {
        return this.f11213di;
    }

    /* JADX INFO: renamed from: ik */
    public String m14069ik() {
        return this.f11215ik;
    }

    /* JADX INFO: renamed from: ik */
    public void m14070ik(String str) {
        this.f11215ik = str;
    }

    /* JADX INFO: renamed from: ka */
    public double m14071ka() {
        return this.f11214fi;
    }

    /* JADX INFO: renamed from: ka */
    public void m14072ka(String str) {
        this.f11216ka = str;
    }

    /* JADX INFO: renamed from: lr */
    public String m14073lr() {
        return this.f11217lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m14074lr(int i) {
        this.xha = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m14075lr(String str) {
        this.f11217lr = str;
    }

    /* JADX INFO: renamed from: mj */
    public JSONObject m14076mj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, m14073lr());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, m14067di());
            jSONObject.put("comment_num", m14068fi());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, m14077ri());
            jSONObject.put("package_name", m14069ik());
            jSONObject.put("score", m14071ka());
            jSONObject.put("app_category", xha());
            return jSONObject;
        } catch (Exception e) {
            C2707ac.m10197ik(e.toString(), new Object[0]);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ri */
    public String m14077ri() {
        return this.f11218ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m14078ri(double d) {
        if (d < 1.0d || d > 5.0d) {
            this.f11214fi = -1.0d;
        } else {
            this.f11214fi = d;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14079ri(int i) {
        if (i <= 0) {
            this.f11213di = -1;
        } else {
            this.f11213di = i;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14080ri(String str) {
        this.f11218ri = str;
    }

    public String xha() {
        return this.f11216ka;
    }
}
