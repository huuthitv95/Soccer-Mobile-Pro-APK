package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.v0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8223v0 {

    /* JADX INFO: renamed from: a */
    public boolean f18327a = true;

    /* JADX INFO: renamed from: b */
    public String f18328b;

    public boolean getAllowFullscreen() {
        return this.f18327a;
    }

    public String getMediationName() {
        return IAConfigManager.f17654M.f17680l;
    }

    public String getMediationVersion() {
        return IAConfigManager.f17654M.f17682n;
    }
}
