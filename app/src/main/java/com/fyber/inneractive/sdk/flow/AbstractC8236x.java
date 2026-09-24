package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C8024p0;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C9270v0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.x */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8236x {

    /* JADX INFO: renamed from: a */
    public InneractiveAdRequest f18373a;

    /* JADX INFO: renamed from: b */
    public AbstractC9087e f18374b;

    /* JADX INFO: renamed from: c */
    public final C8006r f18375c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8041s0 f18376d;

    /* JADX INFO: renamed from: e */
    public boolean f18377e = false;

    /* JADX INFO: renamed from: f */
    public boolean f18378f = false;

    public AbstractC8236x(InterfaceC8041s0 interfaceC8041s0, C8006r c8006r) {
        this.f18376d = interfaceC8041s0;
        this.f18375c = c8006r;
    }

    /* JADX INFO: renamed from: a */
    public C9270v0 mo20633a() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void mo20634a(String str) {
    }

    /* JADX INFO: renamed from: a */
    public boolean mo20635a(boolean z, EnumC9150g enumC9150g) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo20599b() {
        InterfaceC8041s0 interfaceC8041s0 = this.f18376d;
        if (interfaceC8041s0 == null) {
            IAlog.m21950f("%s : isFullscreenAd() called with unit config null", IAlog.m21943a(this));
            return false;
        }
        C8024p0 c8024p0 = ((C8028r0) interfaceC8041s0).f17815e;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo20636c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo20600d();

    public abstract void destroy();

    /* JADX INFO: renamed from: e */
    public void mo20637e() {
    }

    public abstract boolean isVideoAd();
}
