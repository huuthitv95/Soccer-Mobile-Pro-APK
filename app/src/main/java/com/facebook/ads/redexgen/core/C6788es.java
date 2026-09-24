package com.facebook.ads.redexgen.core;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.es */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6788es extends ContentObserver {
    public final C5152EF A00;

    public C6788es(Handler handler, C5152EF c5152ef) {
        super(handler);
        this.A00 = c5152ef;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.A00.A0f();
    }
}
