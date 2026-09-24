package com.fyber.inneractive.sdk.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.AbstractC8063b;
import com.fyber.inneractive.sdk.factories.AbstractC8065d;
import com.fyber.inneractive.sdk.factories.AbstractC8069h;
import com.fyber.inneractive.sdk.factories.C8067f;
import com.fyber.inneractive.sdk.flow.C8172q0;
import com.fyber.inneractive.sdk.response.EnumC9083a;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.InterfaceC9201w;

/* JADX INFO: loaded from: classes4.dex */
public class IAMraidKit extends BroadcastReceiver {
    private static final InterfaceC9201w sProvider = new C8318a();

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isMRaidSpotContent(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C8172q0);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IAlog.m21945a("IAMraidKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        InterfaceC9201w interfaceC9201w = sProvider;
        IAConfigManager.f17654M.f17663G.put(interfaceC9201w.mo20715b(), interfaceC9201w);
        C8320b c8320b = new C8320b();
        C8067f c8067f = AbstractC8065d.f17949a;
        c8067f.m20467a(EnumC9083a.RETURNED_ADTYPE_HTML, c8320b);
        c8067f.m20467a(EnumC9083a.RETURNED_ADTYPE_MRAID, c8320b);
        AbstractC8069h.f17951a.f17952a.add(new C8322c(this));
        AbstractC8063b.f17947a.f17948a.add(new C8324d(this));
    }
}
