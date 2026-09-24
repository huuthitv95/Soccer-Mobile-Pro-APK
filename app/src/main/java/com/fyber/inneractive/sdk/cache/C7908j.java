package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.network.InterfaceC8374f0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C7908j implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7909k f17578a;

    public C7908j(C7909k c7909k) {
        this.f17578a = c7909k;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        if (str != null) {
            this.f17578a.f17583e = str;
        }
    }
}
