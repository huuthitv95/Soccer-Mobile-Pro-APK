package com.ironsource.adqualitysdk.sdk.p286i;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hy */
/* JADX INFO: loaded from: classes6.dex */
public final class C12022hy<T> {

    /* JADX INFO: renamed from: ﻐ */
    private C12020hw f29253;

    /* JADX INFO: renamed from: ﾇ */
    private boolean f29256;

    /* JADX INFO: renamed from: ﻛ */
    private C12015hr f29254 = new C12015hr();

    /* JADX INFO: renamed from: ｋ */
    private Set<Object> f29255 = new HashSet();

    /* JADX INFO: renamed from: ﾒ */
    private Set<T> f29257 = new HashSet();

    /* JADX INFO: renamed from: ﱡ */
    private Set<InterfaceC12018hu> f29252 = new HashSet();

    public C12022hy(C12020hw c12020hw) {
        this.f29253 = c12020hw;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final C12020hw m30429() {
        return this.f29253;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final C12015hr m30423() {
        return this.f29254;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final Set<Object> m30427() {
        return this.f29255;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final boolean m30425() {
        return this.f29256;
    }

    /* JADX INFO: renamed from: ｋ */
    public final C12022hy m30426() {
        this.f29256 = true;
        return this;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m30424(T t) {
        this.f29257.add(t);
    }

    /* JADX INFO: renamed from: ﮐ */
    public final Set<T> m30421() {
        return this.f29257;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m30428(InterfaceC12018hu interfaceC12018hu) {
        this.f29252.add(interfaceC12018hu);
    }

    /* JADX INFO: renamed from: ﱟ */
    public final Set<InterfaceC12018hu> m30422() {
        return this.f29252;
    }
}
