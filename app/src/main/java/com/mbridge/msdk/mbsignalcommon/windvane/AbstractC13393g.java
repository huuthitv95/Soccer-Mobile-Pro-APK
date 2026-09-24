package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.windvane.g */
/* JADX INFO: compiled from: WindVanePlugin.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13393g {

    /* JADX INFO: renamed from: a */
    protected Context f37179a;

    /* JADX INFO: renamed from: b */
    protected Object f37180b;

    /* JADX INFO: renamed from: c */
    protected WindVaneWebView f37181c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f37179a = context;
        this.f37181c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f37180b = obj;
        this.f37181c = windVaneWebView;
    }
}
