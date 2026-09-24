package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.M3 */
/* JADX INFO: loaded from: classes6.dex */
public class C11555M3 {

    /* JADX INFO: renamed from: a */
    private boolean f25115a = true;

    /* JADX INFO: renamed from: b */
    private IronSourceError f25116b = null;

    /* JADX INFO: renamed from: a */
    public void m26478a(IronSourceError ironSourceError) {
        this.f25115a = false;
        this.f25116b = ironSourceError;
    }

    /* JADX INFO: renamed from: b */
    public boolean m26479b() {
        return this.f25115a;
    }

    /* JADX INFO: renamed from: c */
    public void m26480c() {
        this.f25115a = true;
        this.f25116b = null;
    }

    public String toString() {
        if (m26479b()) {
            return "valid:" + this.f25115a;
        }
        return "valid:" + this.f25115a + ", IronSourceError:" + this.f25116b;
    }

    /* JADX INFO: renamed from: a */
    public IronSourceError m26477a() {
        return this.f25116b;
    }
}
