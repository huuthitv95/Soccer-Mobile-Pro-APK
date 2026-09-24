package com.fyber.inneractive.sdk.flow.storepromo.controller;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.C8093k;
import com.fyber.inneractive.sdk.flow.storepromo.C8178b;
import com.fyber.inneractive.sdk.flow.storepromo.controller.listener.InterfaceC8182a;
import com.fyber.inneractive.sdk.flow.storepromo.controller.webview.C8183a;
import com.fyber.inneractive.sdk.flow.storepromo.loader.InterfaceC8189a;
import com.fyber.inneractive.sdk.flow.storepromo.loader.InterfaceC8190b;
import com.fyber.inneractive.sdk.flow.storepromo.model.C8210c;
import com.fyber.inneractive.sdk.flow.storepromo.p275ui.C8217c;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.network.events.EnumC8372b;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.controller.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8180b implements InterfaceC8189a {

    /* JADX INFO: renamed from: a */
    public final InneractiveAdRequest f18221a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9087e f18222b;

    /* JADX INFO: renamed from: c */
    public C8181c f18223c;

    /* JADX INFO: renamed from: d */
    public C8217c f18224d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8190b f18225e;

    /* JADX INFO: renamed from: f */
    public C8178b f18226f;

    /* JADX INFO: renamed from: g */
    public boolean f18227g = false;

    /* JADX INFO: renamed from: h */
    public InterfaceC8182a f18228h;

    /* JADX INFO: renamed from: i */
    public C8093k f18229i;

    public C8180b(C8210c c8210c, C8178b c8178b, InterfaceC8190b interfaceC8190b, InterfaceC8182a interfaceC8182a, AbstractC9087e abstractC9087e, InneractiveAdRequest inneractiveAdRequest) {
        this.f18228h = interfaceC8182a;
        this.f18223c = new C8181c(c8210c, this, this);
        this.f18226f = c8178b;
        this.f18221a = inneractiveAdRequest;
        this.f18222b = abstractC9087e;
        this.f18225e = interfaceC8190b;
    }

    /* JADX INFO: renamed from: a */
    public final void m20605a() {
        C8217c c8217c = this.f18224d;
        if (c8217c != null) {
            if (c8217c.f18312b != null && c8217c.f18311a != null) {
                c8217c.f18314d.setAnimationListener(c8217c.f18319i);
                c8217c.f18311a.setAnimation(c8217c.f18314d);
                c8217c.f18311a.setVisibility(8);
            }
            C8093k c8093k = this.f18229i;
            if (c8093k == null || c8093k.f18001b.m20530a() == null || c8093k.f18001b.m20530a().m20510f().mo20506b() == null) {
                return;
            }
            IAlog.m21945a("%sonStorePromoDismissed restoring endcard focus", IAlog.m21943a(c8093k));
            c8093k.f18001b.m20530a().m20510f().mo20506b().requestFocus();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.InterfaceC8189a
    /* JADX INFO: renamed from: a */
    public final void mo20606a(C8183a c8183a, C8210c c8210c) {
        this.f18224d = new C8217c(IAConfigManager.f17654M.f17689u.m20436a(), c8183a, this.f18226f);
        EnumC8424u enumC8424u = EnumC8424u.VAST_EVENT_SP_LOADED;
        InneractiveAdRequest inneractiveAdRequest = this.f18221a;
        AbstractC9087e abstractC9087e = this.f18222b;
        String str = c8210c.f18302h;
        C8428w c8428w = new C8428w(enumC8424u, inneractiveAdRequest, abstractC9087e);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("templateURL", str);
        } catch (Exception unused) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "templateURL", str);
        }
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
        IAlog.m21945a("StorePromoController: onContentLoadedSuccess", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.InterfaceC8182a
    /* JADX INFO: renamed from: a */
    public final void mo20602a(EnumC8372b enumC8372b, String str, String str2) {
        this.f18227g = true;
        m20605a();
        InterfaceC8182a interfaceC8182a = this.f18228h;
        if (interfaceC8182a != null) {
            interfaceC8182a.mo20602a(enumC8372b, str, str2);
        }
    }
}
