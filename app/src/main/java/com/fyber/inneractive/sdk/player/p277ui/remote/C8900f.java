package com.fyber.inneractive.sdk.player.p277ui.remote;

import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.network.events.EnumC8372b;
import com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s;
import com.fyber.inneractive.sdk.player.p277ui.C8891o;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.remoteui.InterfaceC9260a;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.remote.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8900f implements InterfaceC9260a {

    /* JADX INFO: renamed from: a */
    public AbstractC8902s f20941a;

    /* JADX INFO: renamed from: h */
    public boolean f20948h;

    /* JADX INFO: renamed from: b */
    public boolean f20942b = false;

    /* JADX INFO: renamed from: c */
    public boolean f20943c = false;

    /* JADX INFO: renamed from: d */
    public boolean f20944d = false;

    /* JADX INFO: renamed from: e */
    public boolean f20945e = false;

    /* JADX INFO: renamed from: f */
    public boolean f20946f = false;

    /* JADX INFO: renamed from: g */
    public boolean f20947g = false;

    /* JADX INFO: renamed from: i */
    public boolean f20949i = false;

    /* JADX INFO: renamed from: j */
    public boolean f20950j = false;

    /* JADX INFO: renamed from: k */
    public EnumC8253m f20951k = EnumC8253m.NONE;

    /* JADX INFO: renamed from: l */
    public String f20952l = "";

    public C8900f(C8891o c8891o) {
        this.f20941a = null;
        this.f20948h = false;
        this.f20941a = c8891o;
        this.f20948h = c8891o.f20901I;
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.InterfaceC9260a
    /* JADX INFO: renamed from: a */
    public final void mo21463a(EnumC8372b enumC8372b, String str, boolean z, HashMap map) {
        AbstractC8902s abstractC8902s = this.f20941a;
        if (abstractC8902s == null) {
            IAlog.m21945a("%s: showFallback: fallback won't be displayed because it is null", "RemoteUiFallbackHandler");
            return;
        }
        abstractC8902s.mo21446g(this.f20942b);
        this.f20941a.mo21442d(this.f20949i);
        this.f20941a.mo21444f(this.f20946f);
        this.f20941a.mo21437a(this.f20945e, this.f20951k);
        this.f20941a.mo21441c(this.f20948h);
        this.f20941a.mo21438a(this.f20950j, this.f20952l);
        this.f20941a.mo21440b(this.f20947g);
        this.f20941a.mo21443e(this.f20943c);
        this.f20941a.mo21435a(this.f20944d);
    }
}
