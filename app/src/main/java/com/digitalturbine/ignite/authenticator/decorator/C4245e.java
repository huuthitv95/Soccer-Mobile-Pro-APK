package com.digitalturbine.ignite.authenticator.decorator;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.digitalturbine.ignite.authenticator.callbacks.BinderC4239a;
import com.digitalturbine.ignite.authenticator.entities.C4250a;
import com.digitalturbine.ignite.authenticator.events.C4252b;
import com.digitalturbine.ignite.authenticator.events.EnumC4254d;
import com.digitalturbine.ignite.authenticator.logger.C4259a;
import com.digitalturbine.ignite.authenticator.logger.ILogger;
import com.digitalturbine.ignite.authenticator.utils.concurency.AbstractC4265c;
import com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceAPI;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.decorator.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C4245e implements InterfaceServiceConnectionC4241a {

    /* JADX INFO: renamed from: e */
    public Context f17315e;

    /* JADX INFO: renamed from: f */
    public String f17316f;

    /* JADX INFO: renamed from: g */
    public String f17317g;

    /* JADX INFO: renamed from: h */
    public final String f17318h;

    /* JADX INFO: renamed from: i */
    public C4250a f17319i;

    /* JADX INFO: renamed from: j */
    public IIgniteServiceAPI f17320j;

    /* JADX INFO: renamed from: n */
    public InterfaceServiceConnectionC4241a f17324n;

    /* JADX INFO: renamed from: o */
    public InterfaceServiceConnectionC4241a f17325o;

    /* JADX INFO: renamed from: a */
    public boolean f17311a = false;

    /* JADX INFO: renamed from: b */
    public boolean f17312b = false;

    /* JADX INFO: renamed from: c */
    public long f17313c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f17314d = false;

    /* JADX INFO: renamed from: k */
    public final Bundle f17321k = new Bundle();

    /* JADX INFO: renamed from: l */
    public final Object f17322l = new Object();

    /* JADX INFO: renamed from: p */
    public String f17326p = null;

    /* JADX INFO: renamed from: q */
    public final RunnableC4242b f17327q = new RunnableC4242b(this);

    /* JADX INFO: renamed from: m */
    public final BinderC4239a f17323m = new BinderC4239a(this);

    public C4245e(Context context) {
        String str = null;
        this.f17315e = context.getApplicationContext();
        Intent intent = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
        Context context2 = this.f17315e;
        if (context2 != null) {
            List<ResolveInfo> listQueryIntentServices = context2.getPackageManager().queryIntentServices(intent, 0);
            if (listQueryIntentServices.size() > 0) {
                str = listQueryIntentServices.get(0).serviceInfo.packageName;
            }
        }
        this.f17318h = str;
        this.f17319i = new C4250a(false, "");
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: a */
    public final void mo20277a(ComponentName componentName, IBinder iBinder) {
        InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a = this.f17325o;
        if (interfaceServiceConnectionC4241a != null) {
            interfaceServiceConnectionC4241a.mo20277a(componentName, iBinder);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: a */
    public final void mo20278a(InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a) {
        this.f17324n = interfaceServiceConnectionC4241a;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: a */
    public final void mo20279a(String str) {
        C4259a.m20309b("%s : onAuthenticationFailed : %s", "IgniteAuthenticationComponent", str);
        this.f17312b = false;
        InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a = this.f17324n;
        if (interfaceServiceConnectionC4241a != null) {
            interfaceServiceConnectionC4241a.mo20279a(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: a */
    public final boolean mo20280a() {
        IIgniteServiceAPI iIgniteServiceAPI;
        return this.f17314d && (iIgniteServiceAPI = this.f17320j) != null && iIgniteServiceAPI.asBinder().isBinderAlive();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: b */
    public final void mo20281b() {
        if (TextUtils.isEmpty(this.f17318h)) {
            C4259a.m20309b("%s : unable to authenticate - there is no ignite on the device", "IgniteAuthenticationComponent");
            return;
        }
        if (!mo20280a()) {
            AbstractC4265c.f17351a.execute(this.f17327q);
            return;
        }
        if (!this.f17311a || mo20288f()) {
            m20295m();
            return;
        }
        Object[] objArr = {"IgniteAuthenticationComponent"};
        ILogger iLogger = C4259a.f17346b.f17347a;
        if (iLogger != null) {
            iLogger.mo20305i("%s : already authenticated", objArr);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: b */
    public final void mo20282b(InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a) {
        this.f17325o = interfaceServiceConnectionC4241a;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: b */
    public final void mo20283b(String str) {
        C4259a.m20309b("%s : onIgniteFailedToConnect : %s", "IgniteAuthenticationComponent", str);
        InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a = this.f17325o;
        if (interfaceServiceConnectionC4241a != null) {
            interfaceServiceConnectionC4241a.mo20283b(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: c */
    public final void mo20284c(String str) {
        String str2;
        C4259a.m20308a("%s: onAuthenticationSuccess", "IgniteAuthenticationComponent");
        this.f17312b = false;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f17326p = str;
        this.f17321k.putString("clientToken", str);
        this.f17311a = true;
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            try {
                str2 = new String(Base64.decode(str.split("\\.")[1], 8), "UTF-8");
            } catch (Exception e) {
                C4259a.m20309b("%s : decodeJwtBody : %s", "JwtUtil", e.toString());
                str2 = "";
            }
        }
        if (!str2.isEmpty()) {
            try {
                long jOptLong = new JSONObject(str2).optLong("exp");
                this.f17313c = jOptLong;
                long millis = TimeUnit.SECONDS.toMillis(jOptLong);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(millis);
                    str3 = simpleDateFormat.format(calendar.getTime());
                } catch (Exception unused) {
                }
                C4259a.m20308a("%s : Ignite session will exp in: %s", "IgniteAuthenticationComponent", str3);
            } catch (Exception e2) {
                C4252b.m20297a(EnumC4254d.ONE_DT_GENERAL_ERROR, e2);
                C4259a.m20309b("%s: resolveSessionExpiryTime : unable resolve session expiration : %s", "IgniteAuthenticationComponent", e2.toString());
            }
        }
        InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a = this.f17324n;
        if (interfaceServiceConnectionC4241a != null) {
            interfaceServiceConnectionC4241a.mo20284c(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: c */
    public final boolean mo20285c() {
        return mo20288f() || !mo20280a();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: d */
    public final String mo20286d() {
        return this.f17318h;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    public final void destroy() {
        if (this.f17315e != null && mo20280a()) {
            this.f17315e.unbindService(this);
            this.f17315e = null;
        }
        this.f17325o = null;
        this.f17324n = null;
        this.f17320j = null;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: e */
    public final String mo20287e() {
        return this.f17326p;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: f */
    public final boolean mo20288f() {
        return this.f17313c > 0 && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) > this.f17313c;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: g */
    public final Context mo20289g() {
        return this.f17315e;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: h */
    public final boolean mo20290h() {
        return this.f17311a;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: i */
    public final String mo20291i() {
        return this.f17319i.f17339a;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: j */
    public final boolean mo20292j() {
        return this.f17319i.f17340b;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: k */
    public final IIgniteServiceAPI mo20293k() {
        return this.f17320j;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: l */
    public final void mo20294l() {
        mo20281b();
    }

    /* JADX INFO: renamed from: m */
    public final void m20295m() {
        if (mo20280a()) {
            String str = this.f17316f;
            String str2 = this.f17317g;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.f17312b) {
                return;
            }
            if ((mo20288f() || !this.f17311a) && this.f17320j != null) {
                try {
                    this.f17312b = true;
                    this.f17321k.putInt("sdkFlowTypeKey", 1);
                    this.f17320j.authenticate(this.f17316f, this.f17317g, this.f17321k, this.f17323m);
                } catch (RemoteException e) {
                    this.f17312b = false;
                    C4252b.m20297a(EnumC4254d.ONE_DT_AUTHENTICATION_ERROR, e);
                    C4259a.m20309b("%s: startAuthenticationProcess: unable to start authentication : %s", "IgniteAuthenticationComponent", e.toString());
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.InterfaceC4256a
    public final void onCredentialsRequestFailed(String str) {
        C4259a.m20309b("%s: onCredentialsRequestFailed: %s", "IgniteAuthenticationComponent", str);
        mo20283b(str);
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.InterfaceC4256a
    public final void onCredentialsRequestSuccess(String str, String str2) {
        this.f17316f = str;
        this.f17317g = str2;
        m20295m();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C4259a.m20308a("%s : onIgniteConnected", "IgniteAuthenticationComponent");
        this.f17320j = IIgniteServiceAPI.Stub.asInterface(iBinder);
        this.f17314d = true;
        AbstractC4265c.f17351a.execute(new RunnableC4243c(this, new RunnableC4244d(this, componentName, iBinder)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f17314d = false;
        this.f17313c = 0L;
        mo20283b("Service : " + (componentName != null ? componentName.getClassName() : "Ignite") + " disconnected");
    }
}
