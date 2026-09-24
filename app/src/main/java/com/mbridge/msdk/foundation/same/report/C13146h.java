package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11341A5;
import com.ironsource.C11540L6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.entity.C13071e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.net.URLEncoder;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.h */
/* JADX INFO: compiled from: ReportController.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13146h {

    /* JADX INFO: renamed from: b */
    public static final String f36120b = "h";

    /* JADX INFO: renamed from: a */
    private final Context f36121a;

    public C13146h(Context context, int i) {
        this.f36121a = context;
    }

    /* JADX INFO: renamed from: a */
    public void m37368a(String str, C13071e c13071e, String str2) {
        JSONObject jSONObjectM36813a = C13071e.m36813a(c13071e);
        if (jSONObjectM36813a != null) {
            C13156d.m37475b().m37488a(jSONObjectM36813a);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m37372b(String str, String str2, String str3, String str4, String str5, boolean z) {
        try {
            if (TextUtils.isEmpty(str5)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put("key", URLEncoder.encode("2000066", C11341A5.f23802O));
            jSONObject.put("rid", URLEncoder.encode(str, C11341A5.f23802O));
            jSONObject.put("rid_n", URLEncoder.encode(str2, C11341A5.f23802O));
            jSONObject.put("cid", URLEncoder.encode(str3, C11341A5.f23802O));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str4, C11341A5.f23802O));
            jSONObject.put("err_method", str5);
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Exception e) {
            C13219q0.m37816b(f36120b, e.getMessage());
        }
    }

    public C13146h(Context context) {
        this.f36121a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public void m37366a(int i, int i2, String str, String str2, String str3) {
        C13147i.m37373a(this.f36121a, i, i2, str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public void m37371a(String str, String str2, String str3, String str4, String str5, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put("key", URLEncoder.encode("2000065", C11341A5.f23802O));
            jSONObject.put("rid", URLEncoder.encode(str, C11341A5.f23802O));
            jSONObject.put("rid_n", URLEncoder.encode(str2, C11341A5.f23802O));
            jSONObject.put("cid", URLEncoder.encode(str3, C11341A5.f23802O));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str4, C11341A5.f23802O));
            jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, URLEncoder.encode(str5, C11341A5.f23802O));
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Exception e) {
            C13219q0.m37816b(f36120b, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37370a(String str, String str2, String str3, String str4, String str5) {
        try {
            int iM37770s = C13211m0.m37770s(this.f36121a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", URLEncoder.encode("2000071", C11341A5.f23802O));
            jSONObject.put("rid", URLEncoder.encode(str, C11341A5.f23802O));
            jSONObject.put("rid_n", URLEncoder.encode(str2, C11341A5.f23802O));
            jSONObject.put("cid", URLEncoder.encode(str3, C11341A5.f23802O));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, URLEncoder.encode(str4, C11341A5.f23802O));
            jSONObject.put("reason", URLEncoder.encode(str5, C11341A5.f23802O));
            jSONObject.put("network_type", URLEncoder.encode(String.valueOf(iM37770s), C11341A5.f23802O));
            jSONObject.put("result", URLEncoder.encode("0", C11341A5.f23802O));
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Exception e) {
            C13219q0.m37816b(f36120b, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37365a() {
        try {
            if (C13148j.m37393a()) {
                String strM36533b = C13008c.m36588n().m36533b();
                C13635g c13635gM39718d = C13636h.m39706b().m39718d(strM36533b);
                if (c13635gM39718d == null) {
                    c13635gM39718d = C13636h.m39706b().m39708a();
                }
                String strM37689d = C13198g.m37689d();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000053");
                jSONObject.put("Appid", strM36533b);
                jSONObject.put("uptips2", c13635gM39718d.m39574v0());
                jSONObject.put("info_status", C13006c.m36583m().m36578g());
                jSONObject.put("iseu", c13635gM39718d.m39407G());
                if (!TextUtils.isEmpty(strM37689d)) {
                    jSONObject.put(C11540L6.f24947V0, strM37689d);
                }
                jSONObject.put("GDPR_area", c13635gM39718d.m39415I0());
                jSONObject.put("GDPR_consent", C13006c.m36583m().m36576e());
                C13156d.m37475b().m37488a(jSONObject);
                C13148j.m37397c();
            }
        } catch (Throwable th) {
            C13219q0.m37816b(f36120b, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37367a(int i, String str) {
        C13156d.m37475b().m37488a(C13148j.m37376a((Campaign) null, i, "request"));
    }

    /* JADX INFO: renamed from: a */
    public void m37369a(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_type", "1");
            jSONObject.put("cid", str);
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            jSONObject.put("key", "2000027");
            jSONObject.put("http_url", str3);
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Exception e) {
            C13219q0.m37816b(f36120b, e.getMessage());
        }
    }
}
