package com.fyber.inneractive.sdk.ignite;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener;
import com.digitalturbine.ignite.authenticator.listeners.api.InterfaceC4256a;
import com.digitalturbine.ignite.authenticator.listeners.internal.InterfaceC4257a;
import com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7982j;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.ignite.events.wrappers.C8245a;
import com.fyber.inneractive.sdk.network.C8358a1;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ignite.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8248h implements InterfaceC4256a, AuthenticationServiceListener {

    /* JADX INFO: renamed from: a */
    public Context f18407a;

    /* JADX INFO: renamed from: b */
    public IIgniteServiceAPI f18408b;

    /* JADX INFO: renamed from: k */
    public long f18417k;

    /* JADX INFO: renamed from: l */
    public String f18418l;

    /* JADX INFO: renamed from: m */
    public RunnableC8243d f18419m;

    /* JADX INFO: renamed from: n */
    public InterfaceC4257a f18420n;

    /* JADX INFO: renamed from: o */
    public C8006r f18421o;

    /* JADX INFO: renamed from: p */
    public C8252l f18422p;

    /* JADX INFO: renamed from: c */
    public final Bundle f18409c = new Bundle();

    /* JADX INFO: renamed from: e */
    public boolean f18411e = false;

    /* JADX INFO: renamed from: f */
    public boolean f18412f = false;

    /* JADX INFO: renamed from: g */
    public boolean f18413g = false;

    /* JADX INFO: renamed from: h */
    public final CopyOnWriteArrayList f18414h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f18415i = false;

    /* JADX INFO: renamed from: j */
    public boolean f18416j = false;

    /* JADX INFO: renamed from: d */
    public final C8249i f18410d = new C8249i(new C8244e(this));

    /* JADX INFO: renamed from: a */
    public final void m20645a(InterfaceC4257a interfaceC4257a) {
        IAlog.m21945a("IgniteAdapter : reconnectIgnite : with callback : " + interfaceC4257a, new Object[0]);
        this.f18420n = interfaceC4257a;
        C8252l c8252l = this.f18422p;
        if (c8252l != null) {
            c8252l.authenticate();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20646a(C8006r c8006r) {
        boolean z;
        C8248h c8248h;
        this.f18421o = c8006r;
        if (!TextUtils.isEmpty(this.f18418l)) {
            IAlog.m21945a("%s : Ignite installed will init IgniteManager", "IgniteAdapter");
            C7982j c7982j = (C7982j) c8006r.m20432a(C7982j.class);
            IAlog.m21945a("%s : initializing ignite features", "IgniteAdapter");
            Boolean boolMo20420c = c7982j.mo20420c("odt");
            this.f18411e = boolMo20420c != null ? boolMo20420c.booleanValue() : false;
            Boolean boolMo20420c2 = c7982j.mo20420c("flow");
            this.f18412f = boolMo20420c2 != null ? boolMo20420c2.booleanValue() : false;
            Boolean boolMo20420c3 = c7982j.mo20420c("updates");
            this.f18413g = boolMo20420c3 != null ? boolMo20420c3.booleanValue() : false;
            Context context = this.f18407a;
            if (context != null && ((z = this.f18411e) || this.f18412f)) {
                if (this.f18422p == null) {
                    this.f18416j = false;
                    c8248h = this;
                    C8252l c8252l = new C8252l(context, new C8251k(), new C8245a(), z, this.f18412f, this.f18413g, c8248h);
                    c8248h.f18422p = c8252l;
                    c8252l.authenticate();
                } else {
                    c8248h = this;
                }
                c8248h.f18417k = TimeUnit.SECONDS.toMillis(IAConfigManager.f17654M.f17690v.f17866a.f17862b.m20443a("igniteInstallTimeOutInSeconds", 15, 1));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20647a(EnumC8250j enumC8250j, String str) {
        if (this.f18415i) {
            return;
        }
        this.f18415i = true;
        EnumC8415t enumC8415t = EnumC8415t.IGNITE_FLOW_FAILED_TO_START;
        C8428w c8428w = new C8428w((AbstractC9087e) null);
        c8428w.f18754b = enumC8415t;
        c8428w.f18753a = null;
        c8428w.f18756d = null;
        JSONObject jSONObject = new JSONObject();
        String strM20652a = enumC8250j.m20652a();
        try {
            jSONObject.put("error_code", strM20652a);
        } catch (Exception unused) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "error_code", strM20652a);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("message", str);
            } catch (Exception unused2) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "message", str);
            }
        }
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m20648a(String str, C8247g c8247g) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.m21945a("Starting install timeout with %d", Long.valueOf(this.f18417k));
        RunnableC8243d runnableC8243d = new RunnableC8243d(this);
        this.f18419m = runnableC8243d;
        AbstractC9183r.f21478b.postDelayed(runnableC8243d, this.f18417k);
        if (!m20650n() || m20651o() || this.f18408b == null) {
            for (InterfaceC8258r interfaceC8258r : this.f18414h) {
                if (interfaceC8258r != null) {
                    interfaceC8258r.mo20642a((String) null, m20651o() ? EnumC8250j.SESSION_EXPIRED.m20652a() : EnumC8250j.NOT_CONNECTED.m20652a(), (String) null);
                }
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("packageName", str);
            jSONObject.put("data", jSONObject2);
            IIgniteServiceAPI iIgniteServiceAPI = this.f18408b;
            String string = jSONObject.toString();
            Bundle bundle = this.f18409c;
            Bundle bundle2 = new Bundle();
            C8249i c8249i = this.f18410d;
            C8242c c8242c = new C8242c(this, c8247g);
            c8249i.getClass();
            iIgniteServiceAPI.install(string, bundle, bundle2, new BinderC8259s((C8244e) c8249i.f18423a, c8242c));
        } catch (Exception unused) {
            IAlog.m21945a("Failed to install app", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m20649m() {
        RunnableC8243d runnableC8243d = this.f18419m;
        if (runnableC8243d != null) {
            AbstractC9183r.f21478b.removeCallbacks(runnableC8243d);
            this.f18419m = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m20650n() {
        C8252l c8252l = this.f18422p;
        return c8252l != null && c8252l.isConnected() && this.f18422p.isAuthenticated();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m20651o() {
        C8252l c8252l = this.f18422p;
        return c8252l == null || c8252l.f17294a.mo20288f();
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.InterfaceC4256a
    public final void onCredentialsRequestFailed(String str) {
        C8252l c8252l = this.f18422p;
        if (c8252l != null) {
            c8252l.onCredentialsRequestFailed(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.InterfaceC4256a
    public final void onCredentialsRequestSuccess(String str, String str2) {
        C8252l c8252l = this.f18422p;
        if (c8252l != null) {
            c8252l.onCredentialsRequestSuccess(str, str2);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener
    public final void onIgniteServiceAuthenticated(String str) {
        this.f18409c.putString("clientToken", str);
        IAlog.m21945a("IgniteAdapter: onIgniteServiceAuthenticated", new Object[0]);
        InterfaceC4257a interfaceC4257a = this.f18420n;
        if (interfaceC4257a != null) {
            interfaceC4257a.mo20301a();
            this.f18420n = null;
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener
    public final void onIgniteServiceAuthenticationFailed(String str) {
        this.f18408b = null;
        m20647a(EnumC8250j.FAILED_TO_AUTHENTICATE, str);
        IAlog.m21945a("IgniteAdapter: onIgniteServiceAuthenticationFailed : error : %s", str);
        InterfaceC4257a interfaceC4257a = this.f18420n;
        if (interfaceC4257a != null) {
            interfaceC4257a.mo20302a(str);
            this.f18420n = null;
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener
    public final void onIgniteServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str;
        Context context;
        IAlog.m21945a("IgniteAdapter: onIgniteServiceConnected", new Object[0]);
        this.f18418l = componentName.getPackageName();
        this.f18408b = IIgniteServiceAPI.Stub.asInterface(iBinder);
        if (this.f18416j) {
            C8252l c8252l = this.f18422p;
            if (c8252l != null) {
                c8252l.authenticate();
                return;
            }
            return;
        }
        this.f18416j = true;
        byte[] byteArray = null;
        try {
            C8255o c8255oNewBuilder = IgniteRequestOuterClass$IgniteRequest.newBuilder();
            String str2 = IAConfigManager.f17654M.f17671c;
            c8255oNewBuilder.m21753c();
            ((IgniteRequestOuterClass$IgniteRequest) c8255oNewBuilder.f21118b).setAppId(str2);
            String packageName = AbstractC9174o.f21470a.getPackageName();
            c8255oNewBuilder.m21753c();
            ((IgniteRequestOuterClass$IgniteRequest) c8255oNewBuilder.f21118b).setBundle(packageName);
            String version = InneractiveAdManager.getVersion();
            c8255oNewBuilder.m21753c();
            ((IgniteRequestOuterClass$IgniteRequest) c8255oNewBuilder.f21118b).setSdkVersion(version);
            String str3 = this.f18418l;
            c8255oNewBuilder.m21753c();
            ((IgniteRequestOuterClass$IgniteRequest) c8255oNewBuilder.f21118b).setIgnitePackageName(str3);
            if (TextUtils.isEmpty(this.f18418l) || (context = this.f18407a) == null) {
                str = null;
                c8255oNewBuilder.m21753c();
                ((IgniteRequestOuterClass$IgniteRequest) c8255oNewBuilder.f21118b).setIgniteVersionName(str);
                String strM21990a = AbstractC9174o.m21990a(this.f18407a);
                c8255oNewBuilder.m21753c();
                ((IgniteRequestOuterClass$IgniteRequest) c8255oNewBuilder.f21118b).setAppSignature(strM21990a);
                byteArray = ((IgniteRequestOuterClass$IgniteRequest) c8255oNewBuilder.m21751a()).toByteArray();
            } else {
                try {
                    str = context.getPackageManager().getPackageInfo(this.f18418l, 0).versionName;
                } catch (Exception unused) {
                    IAlog.m21945a("Failed to resolve ignite version", new Object[0]);
                    str = null;
                }
                c8255oNewBuilder.m21753c();
                ((IgniteRequestOuterClass$IgniteRequest) c8255oNewBuilder.f21118b).setIgniteVersionName(str);
                String strM21990a2 = AbstractC9174o.m21990a(this.f18407a);
                c8255oNewBuilder.m21753c();
                ((IgniteRequestOuterClass$IgniteRequest) c8255oNewBuilder.f21118b).setAppSignature(strM21990a2);
                byteArray = ((IgniteRequestOuterClass$IgniteRequest) c8255oNewBuilder.m21751a()).toByteArray();
            }
        } catch (Throwable unused2) {
            IAlog.m21945a("Failed to build ignite request", new Object[0]);
        }
        if (byteArray != null) {
            IAConfigManager.f17654M.f17686r.m20768a(new C8358a1(new C8241b(this), byteArray, this.f18421o));
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener
    public final void onIgniteServiceConnectionFailed(String str) {
        IAlog.m21945a("IgniteAdapter: onIgniteServiceConnectionFailed : error : %s", str);
        m20647a(EnumC8250j.FAILED_TO_BIND_SERVICE, str);
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener
    public final void onOdtUnsupported() {
        C8252l c8252l;
        IAlog.m21950f("%s: onOdtUnsupported : unsupported ignite version", "IgniteAdapter");
        if (this.f18412f || (c8252l = this.f18422p) == null) {
            return;
        }
        c8252l.destroy();
        this.f18422p = null;
    }
}
