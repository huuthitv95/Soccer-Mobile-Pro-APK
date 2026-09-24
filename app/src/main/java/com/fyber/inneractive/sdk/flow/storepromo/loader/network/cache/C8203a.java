package com.fyber.inneractive.sdk.flow.storepromo.loader.network.cache;

import com.fyber.inneractive.sdk.cache.InterfaceC7899a;
import com.fyber.inneractive.sdk.util.AbstractC9174o;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.loader.network.cache.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8203a implements InterfaceC7899a {

    /* JADX INFO: renamed from: a */
    public final String f18283a;

    public C8203a(String str) {
        this.f18283a = str;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final Object mo20349a(String str) {
        return str;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final String mo20350a() {
        return this.f18283a;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final void mo20351a(Object obj) {
        String str = (String) obj;
        if (str != null) {
            AbstractC9174o.f21470a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("dt_store.promo.data", str).apply();
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: b */
    public final String mo20352b() {
        return "IALastModifiedFromHeader.dt_storepromo";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: c */
    public final String mo20353c() {
        return String.valueOf(("dt_store.promo_" + this.f18283a).hashCode());
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: d */
    public final boolean mo20354d() {
        return true;
    }
}
