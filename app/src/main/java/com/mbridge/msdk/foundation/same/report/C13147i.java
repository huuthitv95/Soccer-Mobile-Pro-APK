package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.i */
/* JADX INFO: compiled from: ReportControllerDiff.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13147i {
    /* JADX INFO: renamed from: a */
    public static void m37373a(Context context, int i, int i2, String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000058");
            jSONObject.put("appid", C13008c.m36588n().m36533b());
            jSONObject.put("dl_type", String.valueOf(i));
            jSONObject.put("dl_link_type", String.valueOf(i2));
            jSONObject.put("rid", str);
            jSONObject.put("rid_n", str2);
            jSONObject.put("cid", str3);
            jSONObject.put("tgt_v", C13211m0.m37780x(context));
            jSONObject.put("app_v_n", C13211m0.m37720C(context));
            jSONObject.put("app_v_c", C13211m0.m37718B(context));
            C13156d.m37475b().m37488a(jSONObject);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("ReportControllerDiff", e.getMessage());
            }
        }
    }
}
