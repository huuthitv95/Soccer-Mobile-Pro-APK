package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11540L6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.AbstractC13003a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.tracker.C13818e;
import com.mbridge.msdk.tracker.C13827n;
import com.mbridge.msdk.tracker.InterfaceC13819f;
import com.mbridge.msdk.tracker.InterfaceC13821h;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.c */
/* JADX INFO: compiled from: EventLibraryCommon.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13134c {

    /* JADX INFO: renamed from: a */
    private static final String f36077a = "c";

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.c$a */
    /* JADX INFO: compiled from: EventLibraryCommon.java */
    class a implements InterfaceC13821h {
        a() {
        }

        @Override // com.mbridge.msdk.tracker.InterfaceC13821h
        /* JADX INFO: renamed from: a */
        public JSONObject mo37284a(C13818e c13818e) {
            if (c13818e == null) {
                return null;
            }
            JSONObject jSONObjectM41014i = c13818e.m41014i();
            if (jSONObjectM41014i == null) {
                jSONObjectM41014i = new JSONObject();
            }
            try {
                jSONObjectM41014i.put("key", c13818e.m41012g());
                Context contextM36542d = C13008c.m36588n().m36542d();
                int iM37770s = C13211m0.m37770s(contextM36542d);
                if (!jSONObjectM41014i.has("network_type")) {
                    jSONObjectM41014i.put("network_type", iM37770s);
                    jSONObjectM41014i.put("network_str", C13211m0.m37732a(contextM36542d, iM37770s));
                }
                if (!jSONObjectM41014i.has("st")) {
                    jSONObjectM41014i.put("st", System.currentTimeMillis());
                }
                String strOptString = jSONObjectM41014i.optString(MBridgeConstans.PROPERTIES_UNIT_ID, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    String str = AbstractC13003a.f35476r.get(strOptString);
                    jSONObjectM41014i.put("u_stid", str != null ? str : "");
                }
                if (!TextUtils.isEmpty(C13088a.f35856V) && !jSONObjectM41014i.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                    jSONObjectM41014i.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, C13088a.f35856V);
                }
                if (!TextUtils.isEmpty(C13088a.f35865g) && !jSONObjectM41014i.has("c")) {
                    jSONObjectM41014i.put("c", C13088a.f35865g);
                    return jSONObjectM41014i;
                }
            } catch (Exception e) {
                C13219q0.m37816b(C13134c.f36077a, e.getMessage());
            }
            return jSONObjectM41014i;
        }
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m37281b() {
        return C13132a.m37275a();
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC13819f m37282c() {
        return new C13827n();
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC13821h m37283d() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m37280a(String str) {
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d == null) {
            return true;
        }
        return C13133b.m37277a(c13635gM39718d, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m37279a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            jSONObject.remove(C11540L6.f24899B);
            jSONObject.remove("brand");
            jSONObject.remove("screen_size");
            jSONObject.remove("sub_ip");
            jSONObject.remove("network_type");
            jSONObject.remove("useragent");
            jSONObject.remove(C11540L6.f24966d0);
            jSONObject.remove("language");
            jSONObject.remove("network_str");
            jSONObject.remove("mnc");
            jSONObject.remove("mcc");
            jSONObject.remove("os_version");
            jSONObject.remove("gp_version");
            jSONObject.remove("country_code");
        }
        if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_OTHER)) {
            jSONObject.remove(C13126e.f36053d);
            jSONObject.remove(C13126e.f36054e);
            jSONObject.remove("power_rate");
            jSONObject.remove("charging");
            jSONObject.remove("timezone");
        }
        if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return;
        }
        jSONObject.remove(C11540L6.f24947V0);
        jSONObject.remove("gaid2");
        jSONObject.remove("oaid");
        jSONObject.remove("az_aid_info");
    }
}
