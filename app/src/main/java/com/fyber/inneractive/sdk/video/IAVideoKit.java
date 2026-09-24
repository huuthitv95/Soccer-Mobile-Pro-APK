package com.fyber.inneractive.sdk.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.factories.AbstractC8063b;
import com.fyber.inneractive.sdk.factories.AbstractC8065d;
import com.fyber.inneractive.sdk.factories.AbstractC8069h;
import com.fyber.inneractive.sdk.player.cache.C8452n;
import com.fyber.inneractive.sdk.response.EnumC9083a;
import com.fyber.inneractive.sdk.util.AbstractC9186s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.InterfaceC9201w;

/* JADX INFO: loaded from: classes4.dex */
public class IAVideoKit extends BroadcastReceiver {
    private static final InterfaceC9201w sProvider = new C9210a();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        InterfaceC9201w interfaceC9201w = sProvider;
        IAConfigManager.f17654M.f17663G.put(interfaceC9201w.mo20715b(), interfaceC9201w);
        C8452n c8452n = C8452n.f18811f;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            c8452n.getClass();
            IAlog.m21950f("context is null, would not start the video cache.", new Object[0]);
        } else if (!c8452n.f18814c || !AbstractC9186s.m22012a()) {
            c8452n.f18812a = applicationContext;
            new Thread(c8452n.f18816e, "VideoCache").start();
        }
        IAlog.m21945a("IAVideoKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        AbstractC8065d.f17949a.m20467a(EnumC9083a.RETURNED_ADTYPE_VAST, new C9211b());
        AbstractC8069h.f17951a.f17952a.add(new C9212c());
        AbstractC8063b.f17947a.f17948a.add(new C9213d());
    }
}
