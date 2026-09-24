package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbsignalcommon.base.C13349b;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a */
/* JADX INFO: compiled from: MBWebViewChecker.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C13384a {

    /* JADX INFO: renamed from: a */
    private static volatile Boolean f37131a;

    /* JADX INFO: renamed from: b */
    private static volatile Handler f37132b;

    /* JADX INFO: renamed from: c */
    private static Boolean f37133c;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a$a */
    /* JADX INFO: compiled from: MBWebViewChecker.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f37134a;

        a(Context context) {
            this.f37134a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C13384a.f37131a == null) {
                try {
                    Boolean unused = C13384a.f37131a = Boolean.valueOf(C13384a.m38710a(this.f37134a));
                } catch (Exception unused2) {
                    Boolean unused3 = C13384a.f37131a = Boolean.FALSE;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m38711b(Context context) {
        C13635g c13635gM39714b;
        try {
            c13635gM39714b = C13636h.m39706b().m39714b(C13008c.m36588n().m36533b());
        } catch (Exception unused) {
            c13635gM39714b = null;
        }
        if (c13635gM39714b != null) {
            f37133c = Boolean.valueOf(c13635gM39714b.m39409G0());
        } else {
            f37133c = Boolean.FALSE;
        }
        Boolean bool = f37133c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f37131a == null) {
                try {
                    f37131a = Boolean.valueOf(m38710a(context));
                } catch (Exception unused2) {
                    f37131a = Boolean.FALSE;
                }
            }
            if (f37131a == null) {
                f37131a = new Boolean(false);
            }
            return f37131a.booleanValue();
        }
        if (f37131a == null && f37132b == null) {
            f37132b = new Handler(Looper.getMainLooper());
            f37132b.post(new a(context));
        }
        if (f37131a == null) {
            return true;
        }
        return f37131a.booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m38710a(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new C13349b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView == null) {
            return false;
        }
        m38709a(webView);
        return true;
    }

    /* JADX INFO: renamed from: a */
    private static void m38709a(WebView webView) {
        try {
            webView.destroy();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("MBWebViewChecker", "destroy webview error", e);
            }
        }
    }
}
