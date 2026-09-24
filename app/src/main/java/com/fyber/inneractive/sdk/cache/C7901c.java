package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.util.AbstractC9174o;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C7901c implements InterfaceC7899a {

    /* JADX INFO: renamed from: a */
    public final String f17569a;

    public C7901c(String str) {
        this.f17569a = str;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final Object mo20349a(String str) {
        return str;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final String mo20350a() {
        return this.f17569a;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final void mo20351a(Object obj) {
        String str = (String) obj;
        if (str != null) {
            AbstractC9174o.f21470a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("fmp.endcard.data", str).apply();
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: b */
    public final String mo20352b() {
        return "IALastModifiedFromHeader.endcard";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: c */
    public final String mo20353c() {
        return String.valueOf(("fmp.endcard_" + this.f17569a).hashCode());
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: d */
    public final boolean mo20354d() {
        return true;
    }
}
