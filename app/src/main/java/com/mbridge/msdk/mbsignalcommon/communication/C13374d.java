package com.mbridge.msdk.mbsignalcommon.communication;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13073g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.communication.d */
/* JADX INFO: compiled from: CommonSignalCommunicatioImpUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13374d {

    /* JADX INFO: renamed from: a */
    public static final String f37110a = "d";

    /* JADX INFO: renamed from: b */
    public static int f37111b = 0;

    /* JADX INFO: renamed from: c */
    public static int f37112c = 1;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.communication.d$a */
    /* JADX INFO: compiled from: CommonSignalCommunicatioImpUtils.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f37113a;

        a(CampaignEx campaignEx) {
            this.f37113a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13020j c13020jM36706a = C13020j.m36706a(C13017g.m36693a(C13008c.m36588n().m36542d()));
                if (c13020jM36706a != null) {
                    if (c13020jM36706a.m36707a(this.f37113a.getId())) {
                        c13020jM36706a.m36709b(this.f37113a.getId());
                    } else {
                        C13073g c13073g = new C13073g();
                        c13073g.m36859a(this.f37113a.getId());
                        c13073g.m36861b(this.f37113a.getFca());
                        c13073g.m36863c(this.f37113a.getFcb());
                        c13073g.m36857a(0);
                        c13073g.m36865d(1);
                        c13073g.m36858a(System.currentTimeMillis());
                        c13020jM36706a.m36708b(c13073g);
                    }
                }
                C13374d.m38670b(this.f37113a.getCampaignUnitId(), this.f37113a);
            } catch (Throwable th) {
                C13219q0.m37817b(C13374d.f37110a, th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m38670b(String str, CampaignEx campaignEx) {
        if (C13091b.f35892c == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        C13091b.m37104a(str, campaignEx, "banner");
    }

    /* JADX INFO: renamed from: a */
    public static void m38667a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                m38666a(obj, "data is empty");
                return;
            }
            CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject);
            if (campaignWithBackData == null) {
                m38666a(obj, "data camapign is empty");
            } else {
                m38665a(campaignWithBackData);
                m38669b(obj, "");
            }
        } catch (Throwable th) {
            m38666a(obj, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m38669b(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, f37111b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            m38666a(obj, e.getMessage());
            C13219q0.m37813a(f37110a, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38665a(CampaignEx campaignEx) {
        new Thread(new a(campaignEx)).start();
    }

    /* JADX INFO: renamed from: a */
    public static String m38663a(float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C13088a.f35866h, C13229v0.m37902b(C13008c.m36588n().m36542d(), f));
            jSONObject2.put(C13088a.f35867i, C13229v0.m37902b(C13008c.m36588n().m36542d(), f2));
            jSONObject2.put(C13088a.f35871m, 0);
            jSONObject2.put(C13088a.f35869k, C13008c.m36588n().m36542d().getResources().getConfiguration().orientation);
            jSONObject2.put(C13088a.f35870l, C13229v0.m37918d(C13008c.m36588n().m36542d()));
            jSONObject.put(C13088a.f35868j, jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m38664a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            C13219q0.m37816b(f37110a, "code to string is error");
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38666a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, f37112c);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C13392f.m38726a().m38731b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C13219q0.m37813a(f37110a, e.getMessage());
        }
    }
}
