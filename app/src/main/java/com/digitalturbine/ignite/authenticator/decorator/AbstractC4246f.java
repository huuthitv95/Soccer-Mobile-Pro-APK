package com.digitalturbine.ignite.authenticator.decorator;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener;
import com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceAPI;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.decorator.f */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4246f implements InterfaceServiceConnectionC4241a {

    /* JADX INFO: renamed from: a */
    public final InterfaceServiceConnectionC4241a f17328a;

    /* JADX INFO: renamed from: b */
    public AuthenticationServiceListener f17329b;

    public AbstractC4246f(InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a, AuthenticationServiceListener authenticationServiceListener) {
        this.f17328a = interfaceServiceConnectionC4241a;
        this.f17329b = authenticationServiceListener;
        interfaceServiceConnectionC4241a.mo20282b(this);
        interfaceServiceConnectionC4241a.mo20278a(this);
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: a */
    public void mo20277a(ComponentName componentName, IBinder iBinder) {
        AuthenticationServiceListener authenticationServiceListener = this.f17329b;
        if (authenticationServiceListener != null) {
            authenticationServiceListener.onIgniteServiceConnected(componentName, iBinder);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: a */
    public final void mo20278a(InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a) {
        this.f17328a.mo20278a(interfaceServiceConnectionC4241a);
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: a */
    public void mo20279a(String str) {
        AuthenticationServiceListener authenticationServiceListener = this.f17329b;
        if (authenticationServiceListener != null) {
            authenticationServiceListener.onIgniteServiceAuthenticationFailed(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: a */
    public boolean mo20280a() {
        return this.f17328a.mo20280a();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: b */
    public void mo20281b() {
        this.f17328a.mo20281b();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: b */
    public final void mo20282b(InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a) {
        this.f17328a.mo20282b(interfaceServiceConnectionC4241a);
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: b */
    public void mo20283b(String str) {
        AuthenticationServiceListener authenticationServiceListener = this.f17329b;
        if (authenticationServiceListener != null) {
            authenticationServiceListener.onIgniteServiceConnectionFailed(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: c */
    public void mo20284c(String str) {
        AuthenticationServiceListener authenticationServiceListener = this.f17329b;
        if (authenticationServiceListener != null) {
            authenticationServiceListener.onIgniteServiceAuthenticated(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: c */
    public boolean mo20285c() {
        return this.f17328a.mo20285c();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: d */
    public String mo20286d() {
        return null;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    public void destroy() {
        this.f17329b = null;
        this.f17328a.destroy();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: e */
    public final String mo20287e() {
        return this.f17328a.mo20287e();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: f */
    public boolean mo20288f() {
        return this.f17328a.mo20288f();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: g */
    public Context mo20289g() {
        return this.f17328a.mo20289g();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: h */
    public boolean mo20290h() {
        return this.f17328a.mo20290h();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: i */
    public String mo20291i() {
        return null;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: j */
    public boolean mo20292j() {
        return false;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: k */
    public IIgniteServiceAPI mo20293k() {
        return this.f17328a.mo20293k();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: l */
    public void mo20294l() {
        this.f17328a.mo20294l();
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.InterfaceC4256a
    public void onCredentialsRequestFailed(String str) {
        this.f17328a.onCredentialsRequestFailed(str);
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.InterfaceC4256a
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f17328a.onCredentialsRequestSuccess(str, str2);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f17328a.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f17328a.onServiceDisconnected(componentName);
    }
}
