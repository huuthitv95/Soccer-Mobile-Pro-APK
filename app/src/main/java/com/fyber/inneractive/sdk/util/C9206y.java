package com.fyber.inneractive.sdk.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.y */
/* JADX INFO: loaded from: classes4.dex */
public final class C9206y extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9136b0 f21512a;

    public C9206y(C9136b0 c9136b0) {
        this.f21512a = c9136b0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C9136b0 c9136b0 = this.f21512a;
        c9136b0.getClass();
        IAlog.m21945a("%sonReceive. action = %s", IAlog.m21943a(c9136b0), intent.getAction());
        C9136b0.m21956a(this.f21512a, context, intent);
    }
}
