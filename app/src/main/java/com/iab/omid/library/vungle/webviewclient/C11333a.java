package com.iab.omid.library.vungle.webviewclient;

import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import com.iab.omid.library.vungle.attestation.C11274c;
import com.iab.omid.library.vungle.internal.C11296g;
import com.iab.omid.library.vungle.internal.C11299j;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.webviewclient.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11333a {
    /* JADX INFO: renamed from: a */
    public static void m25233a(WebView webView) {
        if (Build.VERSION.SDK_INT < 26 || !C11274c.m24951a(C11296g.m25029b().m25030a()).m24955b()) {
            return;
        }
        webView.setWebViewClient(new C11334b(webView.getWebViewClient()));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m25234a(String str) {
        if (str != null && str.startsWith("omid-native")) {
            try {
                Uri uri = Uri.parse(str);
                if ("omid-native".equals(uri.getScheme())) {
                    C11299j.m25059b(uri);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
