package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.f5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1551f5 extends C1619m3 {

    /* JADX INFO: renamed from: k */
    private final C1519c3 f1591k;

    public C1551f5(C1519c3 c1519c3, JSONObject jSONObject, JSONObject jSONObject2, C1748l c1748l) {
        super(c1519c3.m2196e(), jSONObject, jSONObject2, c1748l);
        this.f1591k = c1519c3;
    }

    /* JADX INFO: renamed from: A */
    public boolean m2583A() {
        return m3185a("use_cached_adapter", Boolean.TRUE).booleanValue();
    }

    /* JADX INFO: renamed from: t */
    public C1531d5.b m2584t() {
        return C1531d5.b.values()[m3183a("signal_cache_level", ((Integer) this.f2055a.m4801a(AbstractC1776t3.f3337S7)).intValue())];
    }

    @Override // com.applovin.impl.C1619m3
    public String toString() {
        return "SignalProviderSpec{adObject=" + m3189a() + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: renamed from: u */
    public C1519c3 m2585u() {
        return this.f1591k;
    }

    /* JADX INFO: renamed from: v */
    public long m2586v() {
        return m3184a("signal_expiration_ms", ((Long) this.f2055a.m4801a(AbstractC1776t3.f3336R7)).longValue());
    }

    /* JADX INFO: renamed from: w */
    public boolean m2587w() {
        return m3185a("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    /* JADX INFO: renamed from: x */
    public boolean m2588x() {
        return m3185a("prefer_collect_signal_when_initialized", Boolean.TRUE).booleanValue();
    }

    /* JADX INFO: renamed from: y */
    public boolean m2589y() {
        return m3185a("fail_collection_for_empty_signal", (Boolean) this.f2055a.m4801a(AbstractC1776t3.f3312A8)).booleanValue();
    }

    /* JADX INFO: renamed from: z */
    public boolean m2590z() {
        return m3185a("ignore_init_failure", Boolean.FALSE).booleanValue();
    }
}
