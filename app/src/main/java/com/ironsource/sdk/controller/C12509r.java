package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.r */
/* JADX INFO: loaded from: classes6.dex */
class C12509r {

    /* JADX INFO: renamed from: a */
    private C12510s f32207a;

    /* JADX INFO: renamed from: b */
    private boolean f32208b = false;

    C12509r(C12510s c12510s) {
        this.f32207a = c12510s;
    }

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.f32208b) {
            return "";
        }
        this.f32208b = true;
        return this.f32207a.m33486b();
    }
}
