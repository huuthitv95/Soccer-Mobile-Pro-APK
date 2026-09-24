package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public class ExtractionForegroundService extends Service {

    /* JADX INFO: renamed from: a */
    private final IBinder f21966a = new BinderC10010ch(this);

    /* JADX INFO: renamed from: a */
    public final synchronized void m22479a() {
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f21966a;
    }
}
