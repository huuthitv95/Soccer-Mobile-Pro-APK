package com.fyber.inneractive.sdk.web;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity;
import com.fyber.inneractive.sdk.flow.AbstractC8234w;
import com.fyber.inneractive.sdk.flow.C8222v;
import com.fyber.inneractive.sdk.ignite.BinderC8240a;
import com.fyber.inneractive.sdk.ignite.C8247g;
import com.fyber.inneractive.sdk.ignite.C8248h;
import com.fyber.inneractive.sdk.ignite.EnumC8250j;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.ignite.InterfaceC8258r;
import com.fyber.inneractive.sdk.network.AbstractC8434z;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.u0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9268u0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9270v0 f21670a;

    public C9268u0(C9270v0 c9270v0) {
        this.f21670a = c9270v0;
    }

    @JavascriptInterface
    public void onBackButtonPressed() {
        WeakReference weakReference = this.f21670a.f21693q;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((InternalStoreWebpageActivity) this.f21670a.f21693q.get()).finish();
    }

    @JavascriptInterface
    public void onCancelButtonPressed() {
        EnumC8253m enumC8253m;
        EnumC8253m enumC8253m2;
        C9270v0 c9270v0 = this.f21670a;
        c9270v0.f21680d = c9270v0.f21673B ? EnumC8253m.TRUE_SINGLE_TAP : EnumC8253m.SINGLE_TAP;
        String str = c9270v0.f21686j;
        if (str != null) {
            c9270v0.f21698v.set(true);
            c9270v0.f21697u.set(false);
            C8248h c8248h = c9270v0.f21678b;
            C9259r0 c9259r0 = new C9259r0(c9270v0);
            if (!c8248h.m20650n() || c8248h.m20651o()) {
                for (InterfaceC8258r interfaceC8258r : c8248h.f18414h) {
                    if (interfaceC8258r != null) {
                        interfaceC8258r.mo20644c((c8248h.m20651o() ? EnumC8250j.SESSION_EXPIRED : EnumC8250j.NOT_CONNECTED).m20652a());
                    }
                }
            } else {
                try {
                    IIgniteServiceAPI iIgniteServiceAPI = c8248h.f18408b;
                    Bundle bundle = c8248h.f18409c;
                    c8248h.f18410d.getClass();
                    iIgniteServiceAPI.cancel(str, bundle, new BinderC8240a(c9259r0));
                } catch (Exception unused) {
                    IAlog.m21945a("Failed to cancel task", new Object[0]);
                    c9259r0.m22088a(false);
                }
            }
            AbstractC9183r.f21478b.postDelayed(new RunnableC9264s0(c9270v0), 2500L);
            C8222v c8222v = c9270v0.f21684h;
            if (c8222v != null && !c9270v0.f21694r && (enumC8253m2 = c9270v0.f21680d) != null) {
                c9270v0.f21694r = true;
                c8222v.m20627a(EnumC8424u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, enumC8253m2);
            }
        }
        C9270v0 c9270v1 = this.f21670a;
        C8222v c8222v2 = c9270v1.f21684h;
        if (c8222v2 == null || c9270v1.f21694r || (enumC8253m = c9270v1.f21680d) == null) {
            return;
        }
        c9270v1.f21694r = true;
        c8222v2.m20627a(EnumC8424u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, enumC8253m);
    }

    @JavascriptInterface
    public void onInstallButtonPressed() {
        EnumC8253m enumC8253m;
        C9270v0 c9270v0 = this.f21670a;
        EnumC8253m enumC8253m2 = c9270v0.f21673B ? EnumC8253m.TRUE_SINGLE_TAP : EnumC8253m.SINGLE_TAP;
        c9270v0.f21680d = enumC8253m2;
        c9270v0.f21678b.m20648a(c9270v0.f21679c, new C8247g(c9270v0.f21682f, enumC8253m2, c9270v0.f21684h.f18326a));
        C9270v0 c9270v1 = this.f21670a;
        C8222v c8222v = c9270v1.f21684h;
        if (c8222v == null || c9270v1.f21695s || (enumC8253m = c9270v1.f21680d) == null) {
            return;
        }
        c9270v1.f21695s = true;
        c8222v.m20627a(EnumC8424u.IGNITE_FLOW_INSTALL_CLICKED, enumC8253m);
    }

    @JavascriptInterface
    public void onNavigatedInsideStorePage() {
        this.f21670a.f21699w = true;
    }

    @JavascriptInterface
    public void onNavigatedToMainPage() {
        this.f21670a.f21699w = false;
    }

    @JavascriptInterface
    public void onOpenButtonPressed() {
        Intent launchIntentForPackage;
        if (TextUtils.isEmpty(this.f21670a.f21679c)) {
            C9270v0 c9270v0 = this.f21670a;
            c9270v0.getClass();
            IAlog.m21950f("%smPackageName is null", IAlog.m21943a(c9270v0));
            return;
        }
        if (TextUtils.isEmpty(this.f21670a.f21683g)) {
            launchIntentForPackage = AbstractC9174o.f21470a.getPackageManager().getLaunchIntentForPackage(this.f21670a.f21679c);
        } else {
            launchIntentForPackage = new Intent("android.intent.action.MAIN");
            C9270v0 c9270v1 = this.f21670a;
            launchIntentForPackage.setClassName(c9270v1.f21679c, c9270v1.f21683g);
        }
        if (launchIntentForPackage == null) {
            C9270v0 c9270v2 = this.f21670a;
            c9270v2.getClass();
            IAlog.m21950f("%sPackage %s not found", IAlog.m21943a(c9270v2), this.f21670a.f21679c);
            return;
        }
        launchIntentForPackage.setFlags(268435456);
        try {
            AbstractC9174o.f21470a.startActivity(launchIntentForPackage);
        } catch (Throwable th) {
            C8222v c8222v = this.f21670a.f21684h;
            if (c8222v != null) {
                String simpleName = th.getClass().getSimpleName();
                String message = th.getMessage();
                AbstractC8234w abstractC8234w = c8222v.f18326a;
                AbstractC8434z.m20811a(simpleName, message, abstractC8234w.f18373a, abstractC8234w.f18374b);
            }
        }
    }

    @JavascriptInterface
    public void onTransitionEnded() {
        this.f21670a.f21700x = false;
    }

    @JavascriptInterface
    public void onTransitionStarting() {
        this.f21670a.f21700x = true;
    }
}
