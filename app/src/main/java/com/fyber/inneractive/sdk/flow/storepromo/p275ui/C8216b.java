package com.fyber.inneractive.sdk.flow.storepromo.p275ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.ui.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8216b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final WeakReference f18310a;

    public C8216b(C8217c c8217c) {
        this.f18310a = new WeakReference(c8217c);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C8217c c8217c = (C8217c) this.f18310a.get();
        if (c8217c != null) {
            c8217c.m20622a();
        }
    }
}
