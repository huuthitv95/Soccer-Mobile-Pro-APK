package com.bytedance.sdk.openadsdk.core.p200co;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tiktok.util.UrlConst;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3155ka {
    /* JADX INFO: renamed from: ri */
    public static String m13170ri(String str) {
        return TextUtils.isEmpty(str) ? str : m13171ri(C3322sf.m14819lr().m14827ac(), str);
    }

    /* JADX INFO: renamed from: ri */
    public static String m13171ri(String str, String str2) {
        if (TextUtils.isEmpty(str2) || str2.startsWith("http://") || str2.startsWith(UrlConst.HTTPS)) {
            return str2;
        }
        if (TextUtils.isEmpty(str) || str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            return str + "static/" + str2;
        }
        return str + "/static/" + str2;
    }
}
