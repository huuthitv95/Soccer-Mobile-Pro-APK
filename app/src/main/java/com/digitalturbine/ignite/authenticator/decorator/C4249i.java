package com.digitalturbine.ignite.authenticator.decorator;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.ignite.C8248h;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.decorator.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C4249i extends AbstractC4246f {
    public C4249i(C4245e c4245e, C8248h c8248h) {
        super(c4245e, c8248h);
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: a */
    public final void mo20277a(ComponentName componentName, IBinder iBinder) {
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: a */
    public final void mo20279a(String str) {
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: a */
    public final boolean mo20280a() {
        return false;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: b */
    public final void mo20281b() {
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: b */
    public final void mo20283b(String str) {
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: c */
    public final void mo20284c(String str) {
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: c */
    public final boolean mo20285c() {
        return false;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: f */
    public final boolean mo20288f() {
        return false;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: g */
    public final Context mo20289g() {
        return null;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: h */
    public final boolean mo20290h() {
        return false;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: k */
    public final IIgniteServiceAPI mo20293k() {
        return null;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a
    /* JADX INFO: renamed from: l */
    public final void mo20294l() {
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.listeners.api.InterfaceC4256a
    public final void onCredentialsRequestFailed(String str) {
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, com.digitalturbine.ignite.authenticator.listeners.api.InterfaceC4256a
    public final void onCredentialsRequestSuccess(String str, String str2) {
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.AbstractC4246f, android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
