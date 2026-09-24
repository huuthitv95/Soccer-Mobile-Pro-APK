package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.CL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5035CL implements InterfaceC6896gc {
    public final C5050Cb A00;
    public final EnumC6901gh A01;

    public AbstractC5035CL(C5050Cb c5050Cb, EnumC6901gh enumC6901gh) {
        this.A00 = c5050Cb;
        this.A01 = enumC6901gh;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6896gc
    public void A4D(Map<InterfaceC6878gK, EnumC6901gh> map, Map<SyncModifiableBundle, EnumC6888gU> map2) {
        map.put(this.A00, this.A01);
    }
}
