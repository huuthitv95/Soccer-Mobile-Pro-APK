package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.C11540L6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.buffer.sharedperference.C12998a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AbstractC13005b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C13006c;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13225t0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.util.C13885c;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.wrapper.f */
/* JADX INFO: compiled from: CommonRequestParamsForAdd.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13127f {
    /* JADX INFO: renamed from: a */
    public static void m37249a(C13126e c13126e, Context context) {
        if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            c13126e.m37245a("withGP", C13211m0.m37723E() + "");
            c13126e.m37245a("has_wx", C13211m0.m37724E(context) + "");
            c13126e.m37245a("integrated_wx", C13211m0.m37727G() + "");
            c13126e.m37245a("opensdk_ver", C13211m0.m37721D() + "");
            c13126e.m37245a("wx_api_ver", C13211m0.m37741e(C13008c.m36588n().m36551j()) + "");
            c13126e.m37245a("mnc", C13211m0.m37768r(C13008c.m36588n().m36542d()));
            c13126e.m37245a("mcc", C13211m0.m37766q(C13008c.m36588n().m36542d()));
            String strM37751j = C13211m0.m37751j();
            if (!TextUtils.isEmpty(strM37751j)) {
                c13126e.m37245a("hardware", strM37751j);
            }
            if (C13006c.m36583m().m36575d() == 1) {
                c13126e.m37245a("dnt", "1");
            }
            c13126e.m37245a(C13126e.f36055f, C13006c.m36583m().m36573c() + "");
            c13126e.m37245a("adid_limit", C13198g.m37679a() + "");
            c13126e.m37245a("adid_limit_dev", AbstractC13005b.m36563j() ? "1" : "0");
            c13126e.m37245a("emu", String.valueOf(C13211m0.m37725F()));
            c13126e.m37245a("gp_version", C13211m0.m37775v());
            c13126e.m37245a("os_api_version", String.valueOf(Build.VERSION.SDK_INT));
        }
        if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_OTHER)) {
            c13126e.m37245a(C13126e.f36053d, C13225t0.m37852c() + "");
            c13126e.m37245a(C13126e.f36054e, C13225t0.m37848a() + "");
            c13126e.m37245a(C13126e.f36059j, C13211m0.m37777w());
        }
        c13126e.m37245a("pkg_source", C13211m0.m37733a(C13211m0.m37772t(context), context));
        if (C13008c.m36588n().m36552k() != null) {
            c13126e.m37245a("web_env", C13008c.m36588n().m36552k().toString());
        }
        c13126e.m37245a("http_req", "2");
        C13128g.m37262a(c13126e, context);
        m37256g(c13126e);
    }

    /* JADX INFO: renamed from: b */
    public static void m37251b(C13126e c13126e) {
        c13126e.m37245a("api_version", C13088a.f35862d);
    }

    /* JADX INFO: renamed from: c */
    public static void m37252c(C13126e c13126e) {
        String str = C13885c.f39663b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c13126e.m37245a("cronet_env", str);
    }

    /* JADX INFO: renamed from: d */
    public static void m37253d(C13126e c13126e) {
        c13126e.m37245a("dyview_type", C13088a.f35881w);
    }

    /* JADX INFO: renamed from: e */
    public static void m37254e(C13126e c13126e) {
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d == null) {
            c13635gM39718d = C13636h.m39706b().m39708a();
        }
        if (c13635gM39718d.m39401E() == 1) {
            c13126e.m37245a("gdpr_consent", C13006c.m36583m().m36576e() + "");
        } else if (c13635gM39718d.m39415I0()) {
            c13126e.m37245a("gdpr_consent", C13006c.m36583m().m36576e() + "");
        }
        String strM36577f = C13006c.m36583m().m36577f();
        if (TextUtils.isEmpty(strM36577f)) {
            return;
        }
        c13126e.m37245a("tc_string", strM36577f);
    }

    /* JADX INFO: renamed from: f */
    public static void m37255f(C13126e c13126e) {
        try {
            if (TextUtils.isEmpty(C13088a.f35856V)) {
                C13088a.f35856V = C12998a.m36460b().m36462a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (!TextUtils.isEmpty(C13088a.f35856V)) {
                c13126e.m37245a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, C13088a.f35856V);
            }
            if (TextUtils.isEmpty(C13088a.f35865g)) {
                C13088a.f35865g = C12998a.m36460b().m36462a("c");
            }
            if (TextUtils.isEmpty(C13088a.f35865g)) {
                return;
            }
            c13126e.m37245a("c", C13088a.f35865g);
        } catch (Exception e) {
            C13219q0.m37816b("CommonRequestParamsForAdd", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m37256g(C13126e c13126e) {
        m37250a(c13126e, true);
        m37258i(c13126e);
        m37255f(c13126e);
        m37254e(c13126e);
        m37248a(c13126e);
        m37252c(c13126e);
        C13128g.m37261a(c13126e);
    }

    /* JADX INFO: renamed from: h */
    public static void m37257h(C13126e c13126e) {
        if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            c13126e.m37245a("withGP", C13211m0.m37723E() + "");
            c13126e.m37245a("has_wx", C13211m0.m37724E(C13008c.m36588n().m36542d()) + "");
            c13126e.m37245a("integrated_wx", C13211m0.m37727G() + "");
            c13126e.m37245a("opensdk_ver", C13211m0.m37721D() + "");
            c13126e.m37245a("wx_api_ver", C13211m0.m37741e(C13008c.m36588n().m36551j()) + "");
            c13126e.m37245a("mnc", C13211m0.m37768r(C13008c.m36588n().m36542d()));
            c13126e.m37245a("mcc", C13211m0.m37766q(C13008c.m36588n().m36542d()));
            String strM37751j = C13211m0.m37751j();
            if (!TextUtils.isEmpty(strM37751j)) {
                c13126e.m37245a("hardware", strM37751j);
            }
            c13126e.m37245a("adid_limit", C13198g.m37679a() + "");
            c13126e.m37245a("adid_limit_dev", AbstractC13005b.m36563j() ? "1" : "0");
            c13126e.m37245a("emu", String.valueOf(C13211m0.m37725F()));
            c13126e.m37245a("gp_version", C13211m0.m37775v());
            c13126e.m37245a("os_api_version", String.valueOf(Build.VERSION.SDK_INT));
        }
        if (C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_OTHER)) {
            c13126e.m37245a(C13126e.f36059j, C13211m0.m37777w());
        }
        C13128g.m37264b(c13126e);
        m37250a(c13126e, false);
        m37258i(c13126e);
        m37255f(c13126e);
        m37248a(c13126e);
        m37252c(c13126e);
    }

    /* JADX INFO: renamed from: i */
    public static void m37258i(C13126e c13126e) {
        int iM37719C = C13211m0.m37719C();
        if (iM37719C != -1) {
            c13126e.m37245a("unknown_source", iM37719C + "");
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m37259j(C13126e c13126e) {
        if (C13211m0.m37715A() == 0) {
            return;
        }
        c13126e.m37245a("tun", C13211m0.m37715A() + "");
    }

    /* JADX INFO: renamed from: k */
    public static void m37260k(C13126e c13126e) {
        if (c13126e != null) {
            if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                c13126e.m37244a(C11540L6.f24899B);
                c13126e.m37244a("brand");
                c13126e.m37244a("screen_size");
                c13126e.m37244a("sub_ip");
                c13126e.m37244a("network_type");
                c13126e.m37244a("useragent");
                c13126e.m37244a(C11540L6.f24966d0);
                c13126e.m37244a("language");
                c13126e.m37244a("network_str");
                c13126e.m37244a("os_version");
                c13126e.m37244a("country_code");
                c13126e.m37244a("cronet_env");
                c13126e.m37244a("adid_limit");
                c13126e.m37244a("adid_limit_dev");
            }
            if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_OTHER)) {
                c13126e.m37244a(C13126e.f36053d);
                c13126e.m37244a(C13126e.f36054e);
                c13126e.m37244a("power_rate");
                c13126e.m37244a("charging");
                c13126e.m37244a("timezone");
            }
            if (!C13006c.m36583m().m36584c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                c13126e.m37244a(C11540L6.f24947V0);
                c13126e.m37244a("gaid2");
                c13126e.m37244a("az_aid_info");
            }
            C13128g.m37265c(c13126e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37250a(C13126e c13126e, boolean z) {
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (c13635gM39718d != null) {
            if (!TextUtils.isEmpty(c13635gM39718d.m39456a()) && z) {
                c13126e.m37245a("a_stid", c13635gM39718d.m39456a());
            }
            try {
                C13128g.m37263a(c13126e, contextM36542d, z, c13635gM39718d);
            } catch (Exception e) {
                C13219q0.m37816b("CommonRequestParamsForAdd", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37248a(C13126e c13126e) {
        String strM37684b = C13198g.m37684b();
        if (TextUtils.isEmpty(strM37684b)) {
            return;
        }
        c13126e.m37245a("az_aid_info", strM37684b);
    }
}
