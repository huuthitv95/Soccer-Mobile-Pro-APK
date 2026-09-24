package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public class tan {
    /* JADX INFO: renamed from: ri */
    public static String m16659ri(WebView webView, int i) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news open_news_u_s/" + i;
    }

    /* JADX INFO: renamed from: ri */
    public static void m16660ri(Uri uri, com.bytedance.sdk.openadsdk.core.dzy dzyVar) {
        if (dzyVar == null || !dzyVar.m13458ri(uri)) {
            return;
        }
        try {
            dzyVar.m13424lr(uri);
        } catch (Exception e) {
            e.toString();
        }
    }
}
