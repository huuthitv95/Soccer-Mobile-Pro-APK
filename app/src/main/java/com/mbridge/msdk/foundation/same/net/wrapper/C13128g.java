package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AbstractC13005b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13635g;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.wrapper.g */
/* JADX INFO: compiled from: CommonRequestParamsForAddDiff.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13128g {

    /* JADX INFO: renamed from: a */
    private static String f36063a = "";

    /* JADX INFO: renamed from: b */
    private static String f36064b = "";

    /* JADX INFO: renamed from: a */
    public static void m37261a(C13126e c13126e) {
    }

    /* JADX INFO: renamed from: a */
    public static void m37262a(C13126e c13126e, Context context) {
    }

    /* JADX INFO: renamed from: a */
    public static void m37263a(C13126e c13126e, Context context, boolean z, C13635g c13635g) {
        if (c13126e == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("dmt", C13211m0.m37779x() + "");
                jSONObject.put("dmf", C13211m0.m37747h());
                jSONObject.put("adid_limit", C13198g.m37679a() + "");
                jSONObject.put("adid_limit_dev", AbstractC13005b.m36563j() ? "1" : "0");
            }
            if (c13635g.m39578w0() == 1 && !TextUtils.isEmpty(C13198g.m37690e()) && C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("az_aid_info", C13198g.m37690e());
            }
            if (TextUtils.isEmpty(jSONObject.toString())) {
                return;
            }
            if (!jSONObject.equals(f36064b)) {
                f36063a = C13207k0.m37713b(jSONObject.toString());
            }
            if (TextUtils.isEmpty(f36063a)) {
                return;
            }
            c13126e.m37245a("dvi", f36063a);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("CommonRequestParamsForAddDiff", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m37264b(C13126e c13126e) {
    }

    /* JADX INFO: renamed from: c */
    public static void m37265c(C13126e c13126e) {
    }
}
