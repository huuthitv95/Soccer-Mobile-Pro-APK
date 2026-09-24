package com.mbridge.msdk.videocommon.download;

import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.C13093d;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.io.File;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.f */
/* JADX INFO: compiled from: HTMLResourceManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14207f {

    /* JADX INFO: renamed from: a */
    private String f41035a;

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.f$a */
    /* JADX INFO: compiled from: HTMLResourceManager.java */
    private static class a {

        /* JADX INFO: renamed from: a */
        public static C14207f f41036a = new C14207f(null);
    }

    private C14207f() {
        m42536b();
    }

    /* synthetic */ C14207f(C14206e c14206e) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C14207f m42533a() {
        return a.f41036a;
    }

    /* JADX INFO: renamed from: a */
    public String m42534a(String str) {
        try {
            File file = new File(this.f41035a + RemoteSettings.FORWARD_SLASH_STRING + SameMD5.getMD5(C13188c1.m37646b(str)) + ".html");
            if (file.exists()) {
                return C13215o0.m37805e(file);
            }
            return null;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m42535b(String str) {
        try {
            String str2 = this.f41035a + RemoteSettings.FORWARD_SLASH_STRING + SameMD5.getMD5(C13188c1.m37646b(str)) + ".html";
            File file = new File(str2);
            if (!file.exists()) {
                return null;
            }
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d != null && !TextUtils.isEmpty(c13635gM39718d.m39444U())) {
                C13093d.m37129a(str, file);
            }
            return "file:////" + str2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m42536b() {
        this.f41035a = C13098e.m37149b(EnumC13096c.MBRIDGE_700_HTML);
    }
}
