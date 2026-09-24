package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.same.C13093d;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.i */
/* JADX INFO: compiled from: ResourceManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14210i {

    /* JADX INFO: renamed from: a */
    private String f41037a;

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.i$a */
    /* JADX INFO: compiled from: ResourceManager.java */
    private static class a {

        /* JADX INFO: renamed from: a */
        public static C14210i f41038a = new C14210i(null);
    }

    private C14210i() {
        m42541b();
    }

    /* synthetic */ C14210i(C14209h c14209h) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C14210i m42539a() {
        return a.f41038a;
    }

    /* JADX INFO: renamed from: a */
    public String m42540a(String str) {
        String strSubstring;
        String str2 = "";
        try {
            String str3 = this.f41037a + RemoteSettings.FORWARD_SLASH_STRING + SameMD5.getMD5(C13188c1.m37646b(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters(ResourceManager.KEY_INDEX_HTML);
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str4 = queryParameters.get(0);
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            String str5 = str3 + RemoteSettings.FORWARD_SLASH_STRING + str4 + RemoteSettings.FORWARD_SLASH_STRING + str4 + ".html";
            if (!C13215o0.m37806e(str5)) {
                return null;
            }
            try {
                C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
                if (c13635gM39718d != null && !TextUtils.isEmpty(c13635gM39718d.m39444U())) {
                    C13093d.m37129a(str, new File(str5));
                }
                strSubstring = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                strSubstring = "";
            }
            if (!TextUtils.isEmpty(strSubstring)) {
                str2 = "?" + strSubstring;
            }
            return AdPayload.FILE_SCHEME + str5 + str2;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m42541b() {
        this.f41037a = C13098e.m37149b(EnumC13096c.MBRIDGE_700_RES);
    }
}
