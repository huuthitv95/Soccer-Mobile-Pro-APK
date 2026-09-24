package com.google.android.play.core.assetpacks.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.internal.y */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class ServiceConnectionC10126y implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C10127z f22425a;

    /* synthetic */ ServiceConnectionC10126y(C10127z c10127z, C10125x c10125x) {
        this.f22425a = c10127z;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f22425a.f22428c.m22752d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f22425a.m22775c().post(new C10123v(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f22425a.f22428c.m22752d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f22425a.m22775c().post(new C10124w(this));
    }
}
