package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AbstractC13005b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.setting.C13635g;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.k */
/* JADX INFO: compiled from: ReportUtilDiff.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13149k {
    /* JADX INFO: renamed from: a */
    public static JSONObject m37398a(Context context, C13635g c13635g) throws Exception {
        JSONObject jSONObject = new JSONObject();
        if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            String strM37765q = C13211m0.m37765q();
            if (!TextUtils.isEmpty(strM37765q)) {
                jSONObject.put("manufacturer", strM37765q);
            }
            int iM37759n = C13211m0.m37759n();
            if (iM37759n != -1) {
                jSONObject.put("sdkint", iM37759n);
            }
            String strM37782y = C13211m0.m37782y(context);
            if (!TextUtils.isEmpty(strM37782y)) {
                jSONObject.put("is24H", strM37782y);
            }
            String strM37783z = C13211m0.m37783z();
            if (!TextUtils.isEmpty(strM37783z)) {
                jSONObject.put("totalram", strM37783z);
            }
            String strM37784z = C13211m0.m37784z(context);
            if (!TextUtils.isEmpty(strM37784z)) {
                jSONObject.put("totalmemory", strM37784z);
            }
            jSONObject.put("adid_limit", C13198g.m37679a() + "");
            jSONObject.put("adid_limit_dev", AbstractC13005b.m36563j() ? "1" : "0");
        }
        if (c13635g.m39578w0() == 1 && !TextUtils.isEmpty(C13198g.m37690e()) && C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            jSONObject.put("az_aid_info", C13198g.m37690e());
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static void m37399a(C13126e c13126e, Context context) {
    }
}
