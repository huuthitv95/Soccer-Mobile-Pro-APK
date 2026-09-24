package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.facebook.internal.NativeProtocol;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.loader.i */
/* JADX INFO: loaded from: classes4.dex */
public final class C8197i {

    /* JADX INFO: renamed from: a */
    public static final String f18263a = m20619b("app_screen_%d");

    /* JADX INFO: renamed from: b */
    public static final String f18264b = "document.getElementById(\"app_screen_%d\").src = app_screen_%d;\n";

    /* JADX INFO: renamed from: c */
    public static final String f18265c = m20619b("app_video_url_%d");

    /* JADX INFO: renamed from: d */
    public static final String f18266d = "document.getElementById(\"app_video_url_%d\").src = app_video_url_%d;\n";

    /* JADX INFO: renamed from: e */
    public static final String f18267e = m20619b("app_icon");

    /* JADX INFO: renamed from: f */
    public static final String f18268f = "document.getElementById(\"app_icon\").src = app_icon;\n";

    /* JADX INFO: renamed from: g */
    public static final String f18269g = m20619b(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING);

    /* JADX INFO: renamed from: h */
    public static final String f18270h = m20617a(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING);

    /* JADX INFO: renamed from: i */
    public static final String f18271i = m20619b("app_pub_name");

    /* JADX INFO: renamed from: j */
    public static final String f18272j = m20617a("app_pub_name");

    /* JADX INFO: renamed from: k */
    public static final String f18273k = m20619b("app_label");

    /* JADX INFO: renamed from: l */
    public static final String f18274l = m20617a("app_label");

    /* JADX INFO: renamed from: m */
    public static final String f18275m = m20619b(CampaignEx.JSON_KEY_APP_SIZE);

    /* JADX INFO: renamed from: n */
    public static final String f18276n = m20617a(CampaignEx.JSON_KEY_APP_SIZE);

    /* JADX INFO: renamed from: o */
    public static final String f18277o = m20619b("app_rating");

    /* JADX INFO: renamed from: p */
    public static final String f18278p = m20617a("app_rating");

    /* JADX INFO: renamed from: q */
    public static final String f18279q = m20619b("app_rating_icon");

    /* JADX INFO: renamed from: r */
    public static final String f18280r = "document.getElementById(\"app_rating_icon\").src = app_rating_icon;\n";

    /* JADX INFO: renamed from: a */
    public static String m20617a(String str) {
        return "document.getElementById(\"" + str + "\").innerHTML = `${" + str + "}`;\n";
    }

    /* JADX INFO: renamed from: a */
    public static String m20618a(boolean z, String str) {
        StringBuilder sb = new StringBuilder("document.getElementById(\"");
        sb.append(str);
        sb.append("\").style.display = ");
        sb.append(z ? "'block'" : "'none'");
        sb.append(";\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m20619b(String str) {
        return "var " + str + " = `%s`;\n";
    }
}
