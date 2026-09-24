package com.fyber.inneractive.sdk.player.p277ui.remote;

import com.fyber.inneractive.sdk.player.controller.AbstractC8485z;
import com.fyber.inneractive.sdk.player.p277ui.InterfaceC8890n;
import com.fyber.inneractive.sdk.util.C9152g1;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.remote.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C8899e {

    /* JADX INFO: renamed from: a */
    public C8898d f20938a;

    /* JADX INFO: renamed from: c */
    public boolean f20940c = false;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f20939b = new ConcurrentHashMap();

    public C8899e(C8898d c8898d) {
        this.f20938a = c8898d;
    }

    /* JADX INFO: renamed from: a */
    public final void m21465a(int i, C9152g1 c9152g1) {
        InterfaceC8890n interfaceC8890n;
        C8898d c8898d = this.f20938a;
        if (c8898d == null || (interfaceC8890n = c8898d.f20928e) == null) {
            return;
        }
        ((AbstractC8485z) interfaceC8890n).m20932a(i, c9152g1);
    }

    /* JADX INFO: renamed from: a */
    public final void m21466a(String str, String str2, boolean z) {
        if (!z) {
            this.f20939b.put(str, str2);
            return;
        }
        C8898d c8898d = this.f20938a;
        if (c8898d != null) {
            c8898d.f20925b.m22085a(str2);
        }
    }
}
