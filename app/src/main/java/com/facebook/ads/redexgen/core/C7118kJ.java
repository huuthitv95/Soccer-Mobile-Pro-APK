package com.facebook.ads.redexgen.core;

import java.util.Collection;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C7118kJ implements InterfaceC5689Mw {
    public final /* synthetic */ C6902gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C7118kJ(JSONObject jSONObject, C6902gi c6902gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c6902gi;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5689Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5689Mw
    public final Collection<String> A7p() {
        return AbstractC5690Mx.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5689Mw
    public final EnumC5688Mv A8K() {
        return AbstractC5690Mx.A00(this.A02);
    }
}
