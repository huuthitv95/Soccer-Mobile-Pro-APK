package com.digitalturbine.ignite.authenticator;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.digitalturbine.ignite.authenticator.decorator.C4248h;
import com.digitalturbine.ignite.authenticator.decorator.InterfaceServiceConnectionC4241a;
import com.digitalturbine.ignite.authenticator.listeners.internal.InterfaceC4258b;
import com.digitalturbine.ignite.authenticator.logger.C4259a;
import com.digitalturbine.ignite.authenticator.receiver.C4262a;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4238c implements InterfaceC4258b {

    /* JADX INFO: renamed from: a */
    public C4262a f17299a = new C4262a(this);

    /* JADX INFO: renamed from: b */
    public Context f17300b;

    /* JADX INFO: renamed from: c */
    public InterfaceServiceConnectionC4241a f17301c;

    /* JADX INFO: renamed from: d */
    public C4248h f17302d;

    public C4238c(Context context, InterfaceServiceConnectionC4241a interfaceServiceConnectionC4241a, C4248h c4248h) {
        this.f17300b = context.getApplicationContext();
        this.f17301c = interfaceServiceConnectionC4241a;
        this.f17302d = c4248h;
    }

    /* JADX INFO: renamed from: a */
    public final void m20276a() {
        C4262a c4262a;
        C4259a.m20308a("%s : start", "OneDTPropertyWatchdog");
        Context context = this.f17300b;
        if (context == null || (c4262a = this.f17299a) == null || c4262a.f17349b) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("com.dt.ignite.service.action.PROPERTY_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(c4262a, intentFilter, 4);
        } else {
            context.registerReceiver(c4262a, intentFilter);
        }
        this.f17299a.f17349b = true;
    }
}
