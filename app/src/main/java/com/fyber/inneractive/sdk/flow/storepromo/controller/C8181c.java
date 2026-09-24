package com.fyber.inneractive.sdk.flow.storepromo.controller;

import com.fyber.inneractive.sdk.flow.storepromo.controller.webview.C8183a;
import com.fyber.inneractive.sdk.flow.storepromo.controller.webview.C8184b;
import com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.InterfaceC8185a;
import com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.C8187b;
import com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.InterfaceC8186a;
import com.fyber.inneractive.sdk.flow.storepromo.loader.C8194f;
import com.fyber.inneractive.sdk.flow.storepromo.loader.InterfaceC8189a;
import com.fyber.inneractive.sdk.flow.storepromo.loader.InterfaceC8190b;
import com.fyber.inneractive.sdk.flow.storepromo.model.C8210c;
import com.fyber.inneractive.sdk.network.events.EnumC8372b;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.controller.c */
/* JADX INFO: loaded from: classes9.dex */
public final class C8181c implements InterfaceC8189a, InterfaceC8186a, InterfaceC8185a {

    /* JADX INFO: renamed from: a */
    public final C8184b f18230a;

    /* JADX INFO: renamed from: b */
    public C8183a f18231b;

    /* JADX INFO: renamed from: d */
    public C8194f f18233d;

    /* JADX INFO: renamed from: f */
    public InterfaceC8189a f18235f;

    /* JADX INFO: renamed from: g */
    public C8180b f18236g;

    /* JADX INFO: renamed from: e */
    public boolean f18234e = false;

    /* JADX INFO: renamed from: c */
    public C8187b f18232c = new C8187b(this);

    public C8181c(C8210c c8210c, InterfaceC8189a interfaceC8189a, C8180b c8180b) {
        this.f18235f = interfaceC8189a;
        this.f18236g = c8180b;
        this.f18230a = new C8184b(this, interfaceC8189a);
        this.f18233d = new C8194f(c8210c, this);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.InterfaceC8185a
    /* JADX INFO: renamed from: a */
    public final void mo20607a() {
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.InterfaceC8185a
    /* JADX INFO: renamed from: a */
    public final void mo20608a(int i, C9152g1 c9152g1) {
        if (i == 0) {
            C8180b c8180b = this.f18236g;
            if (c8180b != null) {
                IAlog.m21945a("StorePromoView: onClick: type: " + EnumC8179a.CLOSE, new Object[0]);
                c8180b.m20605a();
                return;
            }
            return;
        }
        C8180b c8180b2 = this.f18236g;
        if (c8180b2 != null) {
            EnumC8179a enumC8179a = EnumC8179a.INSTALL;
            IAlog.m21945a("StorePromoView: onClick: type: " + enumC8179a, new Object[0]);
            if (enumC8179a == EnumC8179a.CLOSE) {
                c8180b2.m20605a();
                return;
            }
            InterfaceC8190b interfaceC8190b = c8180b2.f18225e;
            if (interfaceC8190b != null) {
                interfaceC8190b.mo20603a(c9152g1);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.InterfaceC8189a
    /* JADX INFO: renamed from: a */
    public final void mo20606a(C8183a c8183a, C8210c c8210c) {
        IAlog.m21945a("StorePromoWebViewController: onContentLoadedSuccess: content is loaded successfully", new Object[0]);
        this.f18234e = true;
        this.f18231b = c8183a;
        c8183a.setWebViewClient(this.f18230a);
        InterfaceC8189a interfaceC8189a = this.f18235f;
        if (interfaceC8189a != null) {
            interfaceC8189a.mo20606a(this.f18231b, c8210c);
            this.f18235f = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.InterfaceC8182a
    /* JADX INFO: renamed from: a */
    public final void mo20602a(EnumC8372b enumC8372b, String str, String str2) {
        this.f18234e = false;
        InterfaceC8189a interfaceC8189a = this.f18235f;
        if (interfaceC8189a != null) {
            interfaceC8189a.mo20602a(enumC8372b, str, str2);
            this.f18235f = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.InterfaceC8186a
    /* JADX INFO: renamed from: a */
    public final void mo20609a(String str, HashMap map) {
        C8183a c8183a = this.f18231b;
        if (c8183a == null) {
            IAlog.m21946b("StorePromoWebViewController: onCommandReceived: command: %s the webview is null", str);
            return;
        }
        C9152g1 lastClickedLocation = c8183a.getLastClickedLocation();
        C8187b c8187b = this.f18232c;
        if (c8187b != null) {
            c8187b.m20614a(str, map, lastClickedLocation);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.InterfaceC8185a
    /* JADX INFO: renamed from: a */
    public final void mo20610a(HashMap map) {
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.InterfaceC8185a
    /* JADX INFO: renamed from: b */
    public final void mo20611b() {
        C8183a c8183a = this.f18231b;
        if (c8183a != null) {
            c8183a.m22085a("DTStorePromoBridge.nativeCallComplete()");
        }
    }
}
