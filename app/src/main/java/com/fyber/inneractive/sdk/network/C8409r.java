package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.metrics.C8285d;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.r */
/* JADX INFO: loaded from: classes4.dex */
public final class C8409r implements InterfaceC8404p0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8412s f18702a;

    public C8409r(C8412s c8412s) {
        this.f18702a = c8412s;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8404p0
    /* JADX INFO: renamed from: a */
    public final void mo20332a(String str) {
        str.hashCode();
        switch (str) {
            case "sdkInitNetworkRequest":
                C8285d.f18476d.m20685a(this.f18702a.f18684d).mo20692f();
                break;
            case "sdkGotServerResponse":
                C8285d.f18476d.m20685a(this.f18702a.f18684d).mo20693g();
                break;
            case "sdkParsedResponse":
                C8285d.f18476d.m20685a(this.f18702a.f18684d).mo20690d();
                break;
        }
    }
}
