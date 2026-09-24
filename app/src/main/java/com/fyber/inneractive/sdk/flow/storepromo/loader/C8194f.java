package com.fyber.inneractive.sdk.flow.storepromo.loader;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.storepromo.controller.webview.C8183a;
import com.fyber.inneractive.sdk.flow.storepromo.controller.webview.C8184b;
import com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.InterfaceC8185a;
import com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.C8187b;
import com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.InterfaceC8186a;
import com.fyber.inneractive.sdk.flow.storepromo.model.C8210c;
import com.fyber.inneractive.sdk.network.events.EnumC8372b;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.loader.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8194f implements InterfaceC8186a, InterfaceC8185a {

    /* JADX INFO: renamed from: a */
    public C8183a f18247a;

    /* JADX INFO: renamed from: b */
    public C8210c f18248b;

    /* JADX INFO: renamed from: c */
    public C8184b f18249c;

    /* JADX INFO: renamed from: e */
    public InterfaceC8189a f18251e;

    /* JADX INFO: renamed from: d */
    public C8187b f18250d = new C8187b(this);

    /* JADX INFO: renamed from: f */
    public C8197i f18252f = new C8197i();

    public C8194f(C8210c c8210c, InterfaceC8189a interfaceC8189a) {
        this.f18251e = interfaceC8189a;
        this.f18249c = new C8184b(this, this.f18251e);
        try {
            this.f18247a = new C8183a(this.f18249c);
        } catch (Throwable th) {
            IAlog.m21945a("failed to create a promo webview", new Object[0]);
            this.f18251e.mo20602a(EnumC8372b.NO_WEBVIEW_INSTALLED, th.getLocalizedMessage(), null);
        }
        this.f18248b = c8210c;
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.InterfaceC8185a
    /* JADX INFO: renamed from: a */
    public final void mo20607a() {
        C8210c c8210c;
        InterfaceC8189a interfaceC8189a;
        C8183a c8183a = this.f18247a;
        if (c8183a == null || (c8210c = this.f18248b) == null || (interfaceC8189a = this.f18251e) == null) {
            return;
        }
        interfaceC8189a.mo20606a(c8183a, c8210c);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.InterfaceC8185a
    /* JADX INFO: renamed from: a */
    public final void mo20608a(int i, C9152g1 c9152g1) {
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.InterfaceC8186a
    /* JADX INFO: renamed from: a */
    public final void mo20609a(String str, HashMap map) {
        C8183a c8183a = this.f18247a;
        if (c8183a == null) {
            IAlog.m21946b("StorePromoContentLoader: onCommandReceived: command: %s the webview is null", str);
            return;
        }
        C8187b c8187b = this.f18250d;
        if (c8187b != null) {
            c8187b.m20614a(str, map, c8183a.getLastClickedLocation());
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.InterfaceC8185a
    /* JADX INFO: renamed from: a */
    public final void mo20610a(HashMap map) {
        String str = (String) map.get("error");
        if (TextUtils.isEmpty(str)) {
            str = "Unknown error occurred on Store Promo side";
        }
        InterfaceC8189a interfaceC8189a = this.f18251e;
        if (interfaceC8189a != null) {
            interfaceC8189a.mo20602a(EnumC8372b.TEMPLATE_ERROR, str, null);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.InterfaceC8185a
    /* JADX INFO: renamed from: b */
    public final void mo20611b() {
        C8183a c8183a = this.f18247a;
        if (c8183a != null) {
            c8183a.m22085a("DTStorePromoBridge.nativeCallComplete()");
        }
    }
}
