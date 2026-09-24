package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.network.InterfaceC8400o;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.marketplace.fairbid.impl.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C9283d implements InterfaceC8400o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Map f21733a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f21734b;

    public C9283d(Map map, String str) {
        this.f21733a = map;
        this.f21734b = str;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8400o
    /* JADX INFO: renamed from: a */
    public final StringBuffer mo20775a() {
        return new StringBuffer(this.f21734b);
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8400o
    /* JADX INFO: renamed from: b */
    public final Map mo20776b() {
        return this.f21733a;
    }
}
