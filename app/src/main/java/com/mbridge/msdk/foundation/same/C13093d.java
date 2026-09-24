package com.mbridge.msdk.foundation.same;

import android.text.TextUtils;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.omsdk.C13439b;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.d */
/* JADX INFO: compiled from: SameTools.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13093d {

    /* JADX INFO: renamed from: a */
    private static final List<String> f35904a = new LinkedList();

    /* JADX INFO: renamed from: a */
    public static int m37125a(CampaignEx campaignEx, String str) {
        if (campaignEx == null) {
            return -1;
        }
        try {
            return !TextUtils.isEmpty(campaignEx.getMof_template_url()) ? C13229v0.m37903b(campaignEx.getMof_template_url()) : C13229v0.m37903b(str);
        } catch (Exception e) {
            C13219q0.m37816b("SameTools", e.getMessage());
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m37130a(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.equals(str2, C13121d.m37226h().f36024d) || TextUtils.equals(str2, C13121d.m37226h().f36006O) || (!TextUtils.equals(str, "download_video") && !TextUtils.equals(str, "download_image") && !TextUtils.equals(str, "download_template") && !TextUtils.equals(str, "") && !TextUtils.equals(str, "download_other") && !TextUtils.equals(str, "download_html") && !TextUtils.equals(str, "applets_model") && !TextUtils.equals(str, "campaign") && !TextUtils.equals(str, "bid_request") && !TextUtils.equals(str, "more_offer") && !TextUtils.equals(str, "mraid_js") && !TextUtils.equals(str, "om_sdk") && !TextUtils.equals(str, "roas") && !TextUtils.equals(str, "web_env_check_js") && !TextUtils.equals(str, "setting")) || !C13223s0.m37831a().m37842a("request_track", true)) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static String m37126a(DownloadRequest<?> downloadRequest) {
        if (downloadRequest == null) {
            return "un_known";
        }
        String str = downloadRequest.get("download_scene", "");
        return TextUtils.isEmpty(str) ? "un_known" : str;
    }

    /* JADX INFO: renamed from: a */
    public static String m37127a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String[] strArrSplit = str.split(";");
            if (strArrSplit.length > 0) {
                return strArrSplit[0].trim();
            }
            return str.trim();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37129a(String str, File file) {
        Runtime runtime;
        if (file != null) {
            try {
                if (file.exists()) {
                    try {
                        List<String> list = f35904a;
                        if (list.contains(str)) {
                            list.add(str);
                            System.gc();
                            Runtime.getRuntime().gc();
                            return;
                        } else {
                            C13215o0.m37795a(C13439b.m38948a(ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, C13215o0.m37805e(file))).getBytes(), file);
                            list.add(str);
                            System.gc();
                            runtime = Runtime.getRuntime();
                        }
                    } catch (Throwable th) {
                        try {
                            C13219q0.m37816b("SameTools", th.getMessage());
                            f35904a.add(str);
                            System.gc();
                            runtime = Runtime.getRuntime();
                        } catch (Throwable th2) {
                            try {
                                f35904a.add(str);
                                System.gc();
                                Runtime.getRuntime().gc();
                            } catch (Throwable unused) {
                            }
                            throw th2;
                        }
                    }
                    runtime.gc();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37128a(File file) {
        boolean zDelete;
        if (file != null) {
            try {
                if (file.exists()) {
                    try {
                        zDelete = file.delete();
                    } catch (Throwable unused) {
                        zDelete = false;
                    }
                    if (zDelete) {
                        return;
                    }
                    file.deleteOnExit();
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
