package com.fyber.inneractive.sdk.p278ui.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ui.controller.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C9123a implements InterfaceC9124b {

    /* JADX INFO: renamed from: a */
    public InterfaceC9125c f21418a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f21419b = new AtomicBoolean(false);

    @Override // com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9124b
    /* JADX INFO: renamed from: a */
    public final void mo20861a(float f) {
        if (f < 0.01f || !this.f21419b.compareAndSet(false, true)) {
            return;
        }
        IAlog.m21945a("%sVisibility requirement met. visibleViewArea: %.1f%%", IAlog.m21943a(this), Float.valueOf(f * 100.0f));
        this.f21418a.mo20488t();
    }

    @Override // com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9124b
    public final void destroy() {
        throw null;
    }
}
