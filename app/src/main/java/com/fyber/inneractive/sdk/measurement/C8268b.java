package com.fyber.inneractive.sdk.measurement;

import com.fyber.inneractive.sdk.network.InterfaceC8374f0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.measurement.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8268b implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8271e f18429a;

    public C8268b(C8271e c8271e) {
        this.f18429a = c8271e;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        if (str != null) {
            this.f18429a.f18435c = str;
        }
    }
}
