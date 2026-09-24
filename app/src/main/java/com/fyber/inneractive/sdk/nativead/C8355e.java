package com.fyber.inneractive.sdk.nativead;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.factories.AbstractC8065d;
import com.fyber.inneractive.sdk.factories.AbstractC8071j;
import com.fyber.inneractive.sdk.factories.C8072k;
import com.fyber.inneractive.sdk.response.EnumC9083a;
import com.fyber.inneractive.sdk.util.AbstractC9186s;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.nativead.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C8355e extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C8352b c8352b = C8352b.f18613f;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            c8352b.getClass();
            IAlog.m21950f("context is null, would not start the native cache.", new Object[0]);
        } else if (!c8352b.f18616c || !AbstractC9186s.m22012a()) {
            c8352b.f18614a = applicationContext;
            new Thread(c8352b.f18618e, "NativeCache").start();
        }
        AbstractC8065d.f17949a.m20467a(EnumC9083a.RETURNED_ADTYPE_NATIVE, new C8353c());
        C8072k c8072k = AbstractC8071j.f17953a;
        c8072k.f17954a.add(new C8354d());
    }
}
