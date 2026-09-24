package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.metrics.C8285d;
import com.fyber.inneractive.sdk.metrics.C8289h;
import com.fyber.inneractive.sdk.metrics.C8290i;
import com.fyber.inneractive.sdk.network.InterfaceC8404p0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.adm.w */
/* JADX INFO: loaded from: classes4.dex */
public final class C7852w implements InterfaceC8404p0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7854y f17512a;

    public C7852w(C7854y c7854y) {
        this.f17512a = c7854y;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8404p0
    /* JADX INFO: renamed from: a */
    public final void mo20332a(String str) {
        str.hashCode();
        switch (str) {
            case "sdkInitNetworkRequest":
                C8285d c8285d = C8285d.f18476d;
                c8285d.m20685a(this.f17512a.f17517d).mo20692f();
                c8285d.m20686b(this.f17512a.f17517d).f18492c = System.currentTimeMillis();
                break;
            case "sdkGotServerResponse":
                C8285d.f18476d.m20685a(this.f17512a.f17517d).mo20694h();
                break;
            case "sdkParsedResponse":
                C8285d.f18476d.m20685a(this.f17512a.f17517d).mo20690d();
                break;
            case "sdkRequestEndedButWillBeRetried":
                C8290i c8290iM20686b = C8285d.f18476d.m20686b(this.f17512a.f17517d);
                c8290iM20686b.f18490a.put(new C8289h("retrying"), Long.valueOf(System.currentTimeMillis() - c8290iM20686b.f18492c));
                break;
        }
    }
}
