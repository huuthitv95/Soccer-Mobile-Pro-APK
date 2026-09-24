package com.mbridge.msdk.foundation.same.report.campaignreport;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.entity.C13074h;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13134c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.tracker.C13818e;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.campaignreport.a */
/* JADX INFO: compiled from: BaseCampaignRequestTimeUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13135a {

    /* JADX INFO: renamed from: a */
    protected Context f36078a;

    /* JADX INFO: renamed from: b */
    protected C13074h f36079b;

    public C13135a(C13074h c13074h) {
        this.f36079b = c13074h;
        Context contextM36542d = C13008c.m36588n().m36542d();
        this.f36078a = contextM36542d;
        if (this.f36079b == null || contextM36542d == null) {
            return;
        }
        int iM37770s = C13211m0.m37770s(contextM36542d);
        this.f36079b.m36875c(iM37770s);
        this.f36079b.m36870a(C13211m0.m37732a(this.f36078a, iM37770s));
    }

    /* JADX INFO: renamed from: a */
    public void m37285a() {
        if (this.f36079b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time", this.f36079b.m36880f());
                jSONObject.put(CampaignEx.JSON_KEY_HB, this.f36079b.m36883i());
                jSONObject.put("fb", this.f36079b.m36871b());
                jSONObject.put("num", this.f36079b.m36879e());
                jSONObject.put(CampaignEx.JSON_KEY_AD_SOURCE_ID, this.f36079b.m36868a());
                jSONObject.put("timeout", this.f36079b.m36881g());
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36079b.m36882h());
                if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", this.f36079b.m36877d());
                    jSONObject.put("network_str", this.f36079b.m36874c());
                }
                C13818e c13818e = new C13818e("2000006");
                c13818e.m41002a(0);
                c13818e.m41008b(0);
                c13818e.m41006a(jSONObject);
                c13818e.m41004a(C13134c.m37283d());
                C13156d.m37475b().m37496d().m41081d(c13818e);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m37288b(int i) {
        C13074h c13074h = this.f36079b;
        if (c13074h != null) {
            c13074h.m36869a(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m37290c(int i) {
        C13074h c13074h = this.f36079b;
        if (c13074h != null) {
            c13074h.m36872b(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m37289b(String str) {
        C13074h c13074h = this.f36079b;
        if (c13074h != null) {
            c13074h.m36876c(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37286a(int i) {
        C13074h c13074h = this.f36079b;
        if (c13074h != null) {
            c13074h.m36878d(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37287a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f36079b.m36873b(str);
    }
}
