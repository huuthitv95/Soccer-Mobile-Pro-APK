package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.CM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5036CM implements InterfaceC6896gc {
    public final EnumC6888gU A00;
    public final AbstractC44572d A01;

    public AbstractC5036CM(AbstractC44572d abstractC44572d, EnumC6888gU enumC6888gU) {
        this.A01 = abstractC44572d;
        this.A00 = enumC6888gU;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6896gc
    public void A4D(Map<InterfaceC6878gK, EnumC6901gh> map, Map<SyncModifiableBundle, EnumC6888gU> map2) {
        map2.put(null, this.A00);
    }
}
