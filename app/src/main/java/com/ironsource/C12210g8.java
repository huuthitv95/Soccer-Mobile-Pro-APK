package com.ironsource;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: com.ironsource.g8 */
/* JADX INFO: loaded from: classes6.dex */
public class C12210g8 {

    /* JADX INFO: renamed from: a */
    private C12264j8 f30427a;

    C12210g8(C12264j8 c12264j8) {
        this.f30427a = c12264j8;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.f30427a.handleMessageFromAd(str);
    }
}
