package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C3345qt extends xha {

    /* JADX INFO: renamed from: lr */
    private long f11772lr;

    /* JADX INFO: renamed from: ri */
    private long f11773ri;

    public C3345qt(Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public long getDisplayDuration() {
        if (this.f11773ri == 0) {
            return 0L;
        }
        if (this.f11772lr == 0) {
            this.f11772lr = SystemClock.elapsedRealtime();
        }
        return this.f11772lr - this.f11773ri;
    }

    /* JADX INFO: renamed from: ik */
    public void m15030ik() {
        setVisibility(8);
        if (this.f11773ri != 0) {
            this.f11772lr = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: renamed from: ka */
    public boolean m15031ka() {
        return this.f11773ri > 0 && this.f11772lr > 0;
    }

    /* JADX INFO: renamed from: lr */
    public void m15032lr(wjv wjvVar, int i) {
        if (isShown()) {
            return;
        }
        m15116lr();
        setVisibility(0);
        this.f11773ri = SystemClock.elapsedRealtime();
        m15117ri(wjvVar, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.xha
    /* JADX INFO: renamed from: ri */
    protected boolean mo15033ri() {
        return false;
    }
}
