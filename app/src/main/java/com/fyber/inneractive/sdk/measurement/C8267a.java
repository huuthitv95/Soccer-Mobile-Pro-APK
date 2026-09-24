package com.fyber.inneractive.sdk.measurement;

import com.fyber.inneractive.sdk.network.InterfaceC8374f0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.measurement.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8267a implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8271e f18428a;

    public C8267a(C8271e c8271e) {
        this.f18428a = c8271e;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        if (str != null) {
            this.f18428a.f18434b = str;
        }
    }
}
