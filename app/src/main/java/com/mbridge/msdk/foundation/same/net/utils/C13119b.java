package com.mbridge.msdk.foundation.same.net.utils;

import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.utils.b */
/* JADX INFO: compiled from: HttpUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13119b {

    /* JADX INFO: renamed from: a */
    private static final String f35983a = "b";

    /* JADX INFO: renamed from: a */
    public static void m37209a(C13126e c13126e, String str, String str2) {
        if (c13126e != null) {
            try {
                if (!C13182a1.m37596a(str) && !C13182a1.m37596a(str2)) {
                    c13126e.m37245a(str, str2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37210a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.startsWith(ProxyConfig.MATCH_HTTP)) {
                str = C13188c1.m37644a(str);
            }
            TextUtils.isEmpty(str);
        } catch (Throwable th) {
            C13219q0.m37816b(f35983a, th.getMessage());
        }
    }
}
