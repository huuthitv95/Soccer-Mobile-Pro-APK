package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.buffer.sharedperference.C12998a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AbstractC13005b;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.C13107Aa;
import com.mbridge.msdk.foundation.same.net.C13108a;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.a */
/* JADX INFO: compiled from: CommonDeviceInfo.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13132a {
    /* JADX INFO: renamed from: a */
    public static JSONObject m37275a() {
        JSONObject jSONObject;
        Context contextM36542d = C13008c.m36588n().m36542d();
        try {
            jSONObject = C13148j.m37374a(contextM36542d).m37247c();
        } catch (Exception e) {
            C13219q0.m37817b("CommonDeviceInfo", "getCommonProperty error", e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(C13088a.f35856V)) {
                C13088a.f35856V = C12998a.m36460b().m36462a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (!TextUtils.isEmpty(C13088a.f35856V)) {
                jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, C13088a.f35856V);
            }
            if (TextUtils.isEmpty(C13088a.f35865g)) {
                C13088a.f35865g = C12998a.m36460b().m36462a("c");
            }
            if (!TextUtils.isEmpty(C13088a.f35865g)) {
                jSONObject.put("c", C13088a.f35865g);
            }
            jSONObject.put("open", C13088a.f35853S);
            String strM37185a = C13107Aa.m37185a();
            if (strM37185a == null) {
                strM37185a = "";
            }
            jSONObject.put("channel", strM37185a);
            jSONObject.put("band_width", C13108a.m37190b().m37191a());
            if (!AbstractC13005b.m36562i()) {
                jSONObject.put("dev_source", "2");
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d == null) {
                c13635gM39718d = C13636h.m39706b().m39708a();
            }
            JSONObject jSONObjectM37276a = m37276a(c13635gM39718d);
            if (jSONObjectM37276a != null) {
                String string = jSONObjectM37276a.toString();
                if (!TextUtils.isEmpty(string)) {
                    String strM37713b = C13207k0.m37713b(string);
                    if (!TextUtils.isEmpty(strM37713b)) {
                        jSONObject.put("dvi", strM37713b);
                    }
                }
            }
            jSONObject.put("app_id", C13008c.m36588n().m36533b());
            jSONObject.put("m_sdk", "msdk");
            jSONObject.put("lqswt", String.valueOf(1));
            jSONObject.put("network_available", String.valueOf(C13229v0.m37947m(contextM36542d)));
            String strM39527k = "UNKNOWN";
            if (c13635gM39718d != null) {
                strM39527k = c13635gM39718d.m39527k();
                jSONObject.put("a_stid", c13635gM39718d.m39456a());
            }
            jSONObject.put("country_code", strM39527k);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m37276a(C13635g c13635g) {
        try {
            return C13148j.m37375a(C13008c.m36588n().m36542d(), c13635g);
        } catch (Exception unused) {
            return null;
        }
    }
}
