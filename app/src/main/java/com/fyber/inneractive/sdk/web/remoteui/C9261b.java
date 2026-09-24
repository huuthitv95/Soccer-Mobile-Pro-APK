package com.fyber.inneractive.sdk.web.remoteui;

import com.fyber.inneractive.sdk.network.events.EnumC8372b;
import com.fyber.inneractive.sdk.player.p277ui.remote.InterfaceC8895a;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C9248m;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.remoteui.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C9261b extends C9248m implements InterfaceC9260a, InterfaceC8895a {

    /* JADX INFO: renamed from: h */
    public InterfaceC9260a f21660h;

    /* JADX INFO: renamed from: i */
    public InterfaceC8895a f21661i;

    /* JADX INFO: renamed from: j */
    public boolean f21662j = false;

    /* JADX INFO: renamed from: k */
    public final C9262c f21663k;

    public C9261b() {
        C9262c c9262c = new C9262c(this, this);
        this.f21663k = c9262c;
        setWebViewClient(c9262c);
        getSettings().setJavaScriptEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setBackgroundColor(0);
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.InterfaceC9260a
    /* JADX INFO: renamed from: a */
    public final void mo21463a(EnumC8372b enumC8372b, String str, boolean z, HashMap map) {
        this.f21662j = false;
        InterfaceC9260a interfaceC9260a = this.f21660h;
        if (interfaceC9260a != null) {
            interfaceC9260a.mo21463a(enumC8372b, str, z, map);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.remote.InterfaceC8895a
    /* JADX INFO: renamed from: a */
    public final void mo21461a(String str, HashMap map) {
        InterfaceC8895a interfaceC8895a = this.f21661i;
        if (interfaceC8895a != null) {
            interfaceC8895a.mo21461a(str, map);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.C9248m, android.webkit.WebView
    public final void destroy() {
        this.f21660h = null;
        this.f21661i = null;
        C9262c c9262c = this.f21663k;
        c9262c.getClass();
        IAlog.m21945a("%s: destroy()", "RemoteUiWebViewClient");
        c9262c.f21665b = null;
        c9262c.f21664a = null;
        super.destroy();
    }

    public void setCommandHandler(InterfaceC8895a interfaceC8895a) {
        this.f21661i = interfaceC8895a;
    }

    public void setResultFailureListener(InterfaceC9260a interfaceC9260a) {
        this.f21660h = interfaceC9260a;
    }

    public void setUiReady(boolean z) {
        this.f21662j = z;
    }
}
