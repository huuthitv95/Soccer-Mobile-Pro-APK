package com.iab.omid.library.vungle.attestation;

import android.webkit.WebView;
import androidx.webkit.WebViewFeature;
import com.iab.omid.library.vungle.internal.C11296g;
import com.iab.omid.library.vungle.utils.C11313d;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.attestation.g */
/* JADX INFO: loaded from: classes6.dex */
public class C11278g {
    /* JADX INFO: renamed from: a */
    public static boolean m24960a(WebView webView) {
        try {
            if (!WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER") || !C11274c.m24951a(C11296g.m25029b().m25030a()).m24955b()) {
                return false;
            }
            C11277f.m24958a(webView);
            return true;
        } catch (Exception e) {
            C11313d.m25147a("Error during initialization of AttestationMessageListener", e);
            return false;
        } catch (NoClassDefFoundError unused) {
            C11313d.m25146a("androidx.webkit not available, skipping attestation listener initialization");
            return false;
        }
    }
}
