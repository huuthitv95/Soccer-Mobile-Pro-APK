package com.fyber.inneractive.sdk.flow.storepromo;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.storepromo.controller.C8180b;
import com.fyber.inneractive.sdk.flow.storepromo.controller.C8181c;
import com.fyber.inneractive.sdk.flow.storepromo.controller.listener.InterfaceC8182a;
import com.fyber.inneractive.sdk.flow.storepromo.controller.webview.C8183a;
import com.fyber.inneractive.sdk.flow.storepromo.loader.C8194f;
import com.fyber.inneractive.sdk.flow.storepromo.loader.C8195g;
import com.fyber.inneractive.sdk.flow.storepromo.loader.InterfaceC8190b;
import com.fyber.inneractive.sdk.flow.storepromo.observer.C8214b;
import com.fyber.inneractive.sdk.flow.storepromo.observer.InterfaceC8213a;
import com.fyber.inneractive.sdk.flow.storepromo.p275ui.C8216b;
import com.fyber.inneractive.sdk.flow.storepromo.p275ui.C8217c;
import com.fyber.inneractive.sdk.model.vast.C8313v;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.events.AbstractC8371a;
import com.fyber.inneractive.sdk.network.events.EnumC8372b;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8178b implements InterfaceC8190b, InterfaceC8182a {

    /* JADX INFO: renamed from: k */
    public static final Object f18210k = new Object();

    /* JADX INFO: renamed from: a */
    public final C8195g f18211a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9087e f18212b;

    /* JADX INFO: renamed from: c */
    public final InneractiveAdRequest f18213c;

    /* JADX INFO: renamed from: d */
    public C8180b f18214d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8190b f18215e;

    /* JADX INFO: renamed from: f */
    public final String f18216f;

    /* JADX INFO: renamed from: g */
    public int f18217g = 0;

    /* JADX INFO: renamed from: h */
    public final CopyOnWriteArrayList f18218h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f18219i = false;

    /* JADX INFO: renamed from: j */
    public C8177a f18220j = new C8177a();

    public C8178b(C8313v c8313v, AbstractC9087e abstractC9087e, InneractiveAdRequest inneractiveAdRequest) {
        this.f18211a = new C8195g(c8313v, this);
        this.f18216f = c8313v.f18575c;
        this.f18212b = abstractC9087e;
        this.f18213c = inneractiveAdRequest;
    }

    /* JADX INFO: renamed from: a */
    public final void m20601a() {
        C8180b c8180b = this.f18214d;
        if (c8180b != null) {
            C8217c c8217c = c8180b.f18224d;
            if (c8217c != null) {
                if (c8217c.f18312b != null && c8217c.f18311a != null) {
                    c8217c.f18314d.setAnimationListener(c8217c.f18319i);
                    c8217c.f18311a.setAnimation(c8217c.f18314d);
                    c8217c.f18311a.setVisibility(8);
                }
                View view = c8217c.f18311a;
                if (view != null) {
                    view.setAnimation(null);
                    AbstractC9195v.m22027a(c8217c.f18311a);
                }
                ViewGroup viewGroup = c8217c.f18312b;
                if (viewGroup != null) {
                    viewGroup.removeAllViewsInLayout();
                    AbstractC9195v.m22027a(c8217c.f18312b);
                }
                c8217c.f18311a = null;
                c8217c.f18312b = null;
                C8216b c8216b = c8217c.f18315e;
                if (c8216b != null) {
                    try {
                        AbstractC9174o.f21470a.unregisterReceiver(c8216b);
                    } catch (Exception unused) {
                    }
                    c8217c.f18315e.f18310a.clear();
                    c8217c.f18315e = null;
                }
                c8217c.f18316f = null;
                c8180b.f18224d = null;
            }
            C8181c c8181c = c8180b.f18223c;
            if (c8181c != null) {
                C8194f c8194f = c8181c.f18233d;
                if (c8194f != null) {
                    C8183a c8183a = c8194f.f18247a;
                    if (c8183a != null) {
                        AbstractC9195v.m22027a(c8183a);
                        c8194f.f18247a.destroy();
                        c8194f.f18247a = null;
                    }
                    c8194f.f18251e = null;
                    c8194f.f18250d = null;
                    c8194f.f18249c = null;
                    c8194f.f18252f = null;
                    c8194f.f18248b = null;
                }
                C8183a c8183a2 = c8181c.f18231b;
                if (c8183a2 != null) {
                    AbstractC9195v.m22027a(c8183a2);
                    c8181c.f18231b.destroy();
                    c8181c.f18231b = null;
                }
                c8181c.f18235f = null;
                c8181c.f18236g = null;
                c8181c.f18232c = null;
                c8181c.f18233d = null;
                c8180b.f18223c = null;
            }
            c8180b.f18229i = null;
            c8180b.f18225e = null;
            c8180b.f18226f = null;
            c8180b.f18228h = null;
            this.f18214d = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.InterfaceC8182a
    /* JADX INFO: renamed from: a */
    public final void mo20602a(EnumC8372b enumC8372b, String str, String str2) {
        m20604a(enumC8372b.name(), str, str2);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.InterfaceC8190b
    /* JADX INFO: renamed from: a */
    public final void mo20603a(C9152g1 c9152g1) {
        C8217c c8217c;
        View view;
        this.f18219i = true;
        InterfaceC8190b interfaceC8190b = this.f18215e;
        if (interfaceC8190b != null) {
            interfaceC8190b.mo20603a(c9152g1);
        }
        C8180b c8180b = this.f18214d;
        C8214b c8214b = new C8214b((c8180b == null || (c8217c = c8180b.f18224d) == null || c8217c.f18312b == null || (view = c8217c.f18311a) == null || view.getParent() == null || c8217c.f18312b.getVisibility() != 0) ? false : true, this.f18219i);
        Iterator it = this.f18218h.iterator();
        while (it.hasNext()) {
            ((InterfaceC8213a) it.next()).mo20621a(c8214b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20604a(String str, String str2, String str3) {
        IAlog.m21946b("StorePromoManager: reportStorePromoError: %s, msg: %s", str, str2);
        if (this.f18220j != null) {
            InneractiveAdRequest inneractiveAdRequest = this.f18213c;
            AbstractC9087e abstractC9087e = this.f18212b;
            HashMap map = new HashMap(1);
            if (!TextUtils.isEmpty(str2)) {
                map.put("error", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                map.put("failedURL", str3);
            }
            AbstractC8371a.m20742a(EnumC8415t.ERROR_STORE_PROMO_FAILURE, str, (String) null, inneractiveAdRequest, abstractC9087e, map, (Boolean) null);
            this.f18220j = null;
        }
    }
}
