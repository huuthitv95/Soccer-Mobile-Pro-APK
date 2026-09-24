package com.digitalturbine.ignite.authenticator;

import android.content.Context;
import com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f;
import com.digitalturbine.ignite.authenticator.decorator.C4245e;
import com.digitalturbine.ignite.authenticator.decorator.C4248h;
import com.digitalturbine.ignite.authenticator.events.C4252b;
import com.digitalturbine.ignite.authenticator.events.InterfaceC4251a;
import com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener;
import com.digitalturbine.ignite.authenticator.listeners.api.InterfaceC4256a;
import com.digitalturbine.ignite.authenticator.logger.C4259a;
import com.digitalturbine.ignite.authenticator.logger.ILogger;
import com.digitalturbine.ignite.authenticator.utils.concurency.AbstractC4265c;

/* JADX INFO: loaded from: classes3.dex */
public class IgniteManager implements InterfaceC4256a {

    /* JADX INFO: renamed from: a */
    public AbstractC4246f f17294a;

    /* JADX INFO: renamed from: b */
    public C4237b f17295b;

    public IgniteManager(Context context, ILogger iLogger, boolean z, AuthenticationServiceListener authenticationServiceListener) {
        this(iLogger, null);
        this.f17294a = new C4248h(new C4245e(context), false, z, authenticationServiceListener, this);
    }

    public IgniteManager(ILogger iLogger, InterfaceC4251a interfaceC4251a) {
        C4259a.f17346b.f17347a = iLogger;
        C4252b.f17341b.f17342a = interfaceC4251a;
    }

    public void authenticate() {
        AbstractC4265c.f17351a.execute(new RunnableC4236a(this));
    }

    public void destroy() {
        this.f17295b = null;
        this.f17294a.destroy();
    }

    public String getOdt() {
        C4237b c4237b = this.f17295b;
        return c4237b != null ? c4237b.f17297a : "";
    }

    public boolean isAuthenticated() {
        return this.f17294a.mo20290h();
    }

    public boolean isConnected() {
        return this.f17294a.mo20280a();
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.InterfaceC4256a
    public void onCredentialsRequestFailed(String str) {
        this.f17294a.onCredentialsRequestFailed(str);
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.InterfaceC4256a
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f17294a.onCredentialsRequestSuccess(str, str2);
    }
}
