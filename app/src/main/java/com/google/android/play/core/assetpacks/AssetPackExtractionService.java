package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public class AssetPackExtractionService extends Service {

    /* JADX INFO: renamed from: a */
    BinderC9975b f21964a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f21964a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C10029d.m22628a(getApplicationContext()).mo22481b(this);
    }
}
