package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7990r;
import com.fyber.inneractive.sdk.flow.C8222v;
import com.fyber.inneractive.sdk.ignite.C8248h;
import com.fyber.inneractive.sdk.ignite.C8252l;
import com.fyber.inneractive.sdk.ignite.EnumC8250j;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.ignite.InterfaceC8258r;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.ViewOnLongClickListenerC9178p0;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.v0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9270v0 implements InterfaceC8258r {

    /* JADX INFO: renamed from: B */
    public boolean f21673B;

    /* JADX INFO: renamed from: a */
    public final WebView f21677a;

    /* JADX INFO: renamed from: b */
    public final C8248h f21678b;

    /* JADX INFO: renamed from: c */
    public final String f21679c;

    /* JADX INFO: renamed from: d */
    public EnumC8253m f21680d;

    /* JADX INFO: renamed from: e */
    public final String f21681e;

    /* JADX INFO: renamed from: f */
    public final String f21682f;

    /* JADX INFO: renamed from: g */
    public final String f21683g;

    /* JADX INFO: renamed from: h */
    public final C8222v f21684h;

    /* JADX INFO: renamed from: i */
    public InterfaceC9266t0 f21685i;

    /* JADX INFO: renamed from: k */
    public String f21687k;

    /* JADX INFO: renamed from: m */
    public final C8006r f21689m;

    /* JADX INFO: renamed from: o */
    public long f21691o;

    /* JADX INFO: renamed from: p */
    public RunnableC9251n0 f21692p;

    /* JADX INFO: renamed from: q */
    public WeakReference f21693q;

    /* JADX INFO: renamed from: j */
    public String f21686j = "invalid_task_id";

    /* JADX INFO: renamed from: l */
    public boolean f21688l = false;

    /* JADX INFO: renamed from: n */
    public long f21690n = 10;

    /* JADX INFO: renamed from: r */
    public boolean f21694r = false;

    /* JADX INFO: renamed from: s */
    public boolean f21695s = false;

    /* JADX INFO: renamed from: t */
    public final AtomicInteger f21696t = new AtomicInteger(0);

    /* JADX INFO: renamed from: u */
    public final AtomicBoolean f21697u = new AtomicBoolean(false);

    /* JADX INFO: renamed from: v */
    public final AtomicBoolean f21698v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w */
    public boolean f21699w = false;

    /* JADX INFO: renamed from: x */
    public boolean f21700x = false;

    /* JADX INFO: renamed from: y */
    public boolean f21701y = false;

    /* JADX INFO: renamed from: z */
    public boolean f21702z = false;

    /* JADX INFO: renamed from: A */
    public boolean f21672A = false;

    /* JADX INFO: renamed from: C */
    public boolean f21674C = false;

    /* JADX INFO: renamed from: D */
    public boolean f21675D = false;

    /* JADX INFO: renamed from: E */
    public final C9249m0 f21676E = new C9249m0(this);

    public C9270v0(C9272w0 c9272w0) {
        this.f21679c = c9272w0.f21704a;
        this.f21680d = c9272w0.f21705b;
        this.f21681e = c9272w0.f21706c;
        this.f21689m = c9272w0.f21707d;
        this.f21682f = c9272w0.f21708e;
        this.f21683g = c9272w0.f21709f;
        this.f21684h = c9272w0.f21710g;
        C8248h c8248h = IAConfigManager.f17654M.f17660D;
        this.f21678b = c8248h;
        c8248h.f18414h.add(this);
        this.f21677a = new WebView(AbstractC9174o.f21470a);
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC8258r
    /* JADX INFO: renamed from: a */
    public final void mo20639a(String str) {
        this.f21702z = true;
        if (this.f21686j.equals(str)) {
            this.f21678b.m20649m();
            m22091d("onInstallStart();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC8258r
    /* JADX INFO: renamed from: a */
    public final void mo20640a(String str, int i, double d) {
        if (this.f21686j.equals(str)) {
            if (i == 0) {
                m22091d(String.format("onDownloadProgress(%f);", Double.valueOf(d)));
            } else {
                if (i != 1) {
                    return;
                }
                m22091d("onInstallationProgress();");
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC8258r
    /* JADX INFO: renamed from: a */
    public final void mo20641a(String str, String str2) {
        if (str == null || str2 == null || !str2.equals(this.f21679c)) {
            return;
        }
        this.f21686j = str;
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC8258r
    /* JADX INFO: renamed from: a */
    public final void mo20642a(String str, String str2, String str3) {
        C8222v c8222v;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.f21675D) {
            this.f21702z = false;
            if (this.f21686j.equals(str)) {
                this.f21678b.m20649m();
                if (!this.f21698v.get() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2) && str2.equals("App already installed")) {
                    m22091d("onInstallationSuccess();");
                    this.f21672A = true;
                    return;
                }
            }
            if ((str2 == null || !(str2.equals(EnumC8250j.NOT_CONNECTED.m20652a()) || str2.equals(EnumC8250j.SESSION_EXPIRED.m20652a()))) && this.f21678b.m20650n()) {
                if (!TextUtils.equals(str2, EnumC8250j.DOWNLOAD_IS_CANCELLED.m20652a())) {
                    this.f21678b.m20649m();
                    m22091d("onInstallationFailed();");
                }
            } else {
                if (this.f21696t.getAndIncrement() < 2) {
                    this.f21678b.m20645a(new C9255p0(this, str2, str3));
                    return;
                }
                this.f21678b.m20649m();
                m22091d("onInstallationFailed();");
                C8248h c8248h = this.f21678b;
                C8252l c8252l = c8248h.f18422p;
                if (c8252l == null || !c8252l.isConnected() || (iIgniteServiceAPI = c8248h.f18408b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    EnumC8250j enumC8250j = EnumC8250j.FAILED_TO_BIND_SERVICE;
                    C8248h c8248h2 = this.f21678b;
                    if (!c8248h2.f18415i && (c8222v = this.f21684h) != null) {
                        c8248h2.f18415i = true;
                        c8222v.m20626a(EnumC8415t.IGNITE_FLOW_FAILED_TO_START, null, enumC8250j.m20652a(), null);
                    }
                }
            }
            EnumC8253m enumC8253m = this.f21680d;
            if (enumC8253m != null) {
                this.f21684h.m20626a(EnumC8415t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, str2, str3, enumC8253m);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC8258r
    /* JADX INFO: renamed from: b */
    public final void mo20643b(String str) {
        this.f21702z = false;
        this.f21672A = true;
        if (this.f21686j.equals(str)) {
            this.f21678b.m20649m();
            m22091d("onInstallationSuccess();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.InterfaceC8258r
    /* JADX INFO: renamed from: c */
    public final void mo20644c(String str) {
        C8222v c8222v;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.f21698v.get() && str != null) {
            if (str.equals(EnumC8250j.NOT_CONNECTED.m20652a()) || str.equals(EnumC8250j.SESSION_EXPIRED.m20652a())) {
                if (this.f21696t.getAndIncrement() < 2) {
                    this.f21678b.m20645a(new C9257q0(this));
                    return;
                }
                C8248h c8248h = this.f21678b;
                C8252l c8252l = c8248h.f18422p;
                if (c8252l == null || !c8252l.isConnected() || (iIgniteServiceAPI = c8248h.f18408b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    EnumC8250j enumC8250j = EnumC8250j.FAILED_TO_BIND_SERVICE;
                    C8248h c8248h2 = this.f21678b;
                    if (c8248h2.f18415i || (c8222v = this.f21684h) == null) {
                        return;
                    }
                    c8248h2.f18415i = true;
                    c8222v.m20626a(EnumC8415t.IGNITE_FLOW_FAILED_TO_START, null, enumC8250j.m20652a(), null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m22091d(String str) {
        AbstractC9183r.f21478b.post(new RunnableC9253o0(this, str));
    }

    /* JADX INFO: renamed from: e */
    public final void m22092e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f21687k = str;
        WebSettings settings = this.f21677a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        this.f21677a.setInitialScale(1);
        this.f21677a.setBackgroundColor(-1);
        this.f21677a.setWebViewClient(this.f21676E);
        WebView webView = this.f21677a;
        webView.setLongClickable(false);
        webView.setOnLongClickListener(new ViewOnLongClickListenerC9178p0());
        this.f21677a.addJavascriptInterface(new C9268u0(this), "nativeInterface");
        this.f21677a.loadUrl(str);
        C8006r c8006r = this.f21689m;
        if (c8006r != null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Integer numMo20416a = ((C7990r) c8006r.m20432a(C7990r.class)).mo20416a("load_timeout");
            int i = 10;
            int iIntValue = numMo20416a != null ? numMo20416a.intValue() : 10;
            if (iIntValue < 30 && iIntValue > 2) {
                i = iIntValue;
            }
            long millis = timeUnit.toMillis(i);
            this.f21690n = millis;
            IAlog.m21945a("InternalStoreWebpageController: Starting load timeout with %d", Long.valueOf(millis));
        }
        this.f21691o = System.currentTimeMillis();
        RunnableC9251n0 runnableC9251n0 = new RunnableC9251n0(this);
        this.f21692p = runnableC9251n0;
        AbstractC9183r.f21478b.postDelayed(runnableC9251n0, this.f21690n);
    }
}
