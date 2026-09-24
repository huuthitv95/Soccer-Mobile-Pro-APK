package com.digitalturbine.ignite.authenticator.decorator;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.digitalturbine.ignite.authenticator.listeners.api.InterfaceC4256a;
import com.digitalturbine.ignite.p270cl.aidl.IIgniteServiceAPI;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.decorator.a */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceServiceConnectionC4241a extends ServiceConnection, InterfaceC4256a {
    /* JADX INFO: renamed from: a */
    void mo20277a(ComponentName componentName, IBinder iBinder);

    /* JADX INFO: renamed from: a */
    void mo20278a(InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a);

    /* JADX INFO: renamed from: a */
    void mo20279a(String str);

    /* JADX INFO: renamed from: a */
    boolean mo20280a();

    /* JADX INFO: renamed from: b */
    void mo20281b();

    /* JADX INFO: renamed from: b */
    void mo20282b(InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a);

    /* JADX INFO: renamed from: b */
    void mo20283b(String str);

    /* JADX INFO: renamed from: c */
    void mo20284c(String str);

    /* JADX INFO: renamed from: c */
    boolean mo20285c();

    /* JADX INFO: renamed from: d */
    String mo20286d();

    void destroy();

    /* JADX INFO: renamed from: e */
    String mo20287e();

    /* JADX INFO: renamed from: f */
    boolean mo20288f();

    /* JADX INFO: renamed from: g */
    Context mo20289g();

    /* JADX INFO: renamed from: h */
    boolean mo20290h();

    /* JADX INFO: renamed from: i */
    String mo20291i();

    /* JADX INFO: renamed from: j */
    boolean mo20292j();

    /* JADX INFO: renamed from: k */
    IIgniteServiceAPI mo20293k();

    /* JADX INFO: renamed from: l */
    void mo20294l();
}
