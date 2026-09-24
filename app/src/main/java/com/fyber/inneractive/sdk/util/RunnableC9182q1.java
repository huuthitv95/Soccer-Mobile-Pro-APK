package com.fyber.inneractive.sdk.util;

import com.ironsource.C11540L6;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.q1 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9182q1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f21475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9188s1 f21476b;

    public RunnableC9182q1(C9188s1 c9188s1, String str) {
        this.f21476b = c9188s1;
        this.f21475a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21476b.f21487c.getSharedPreferences("fyber.ua", 0).edit().putString(C11540L6.f24966d0, this.f21475a).apply();
    }
}
