package com.facebook.ads.redexgen.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ON */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ServiceConnectionC5777ON implements ServiceConnection {
    public final /* synthetic */ HandlerC5778OO A00;

    public ServiceConnectionC5777ON(HandlerC5778OO handlerC5778OO) {
        this.A00 = handlerC5778OO;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.A00.A04.removeCallbacks(this.A00.A08);
        this.A00.A00 = new Messenger(iBinder);
        if (!AbstractC6174Us.A09(this.A00.A07)) {
            return;
        }
        this.A00.A07(this.A00.A00);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.A00.A09();
    }
}
