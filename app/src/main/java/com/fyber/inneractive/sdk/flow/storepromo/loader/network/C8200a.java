package com.fyber.inneractive.sdk.flow.storepromo.loader.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks.C8205b;
import com.fyber.inneractive.sdk.flow.storepromo.loader.network.exception.C8207a;
import com.fyber.inneractive.sdk.network.AbstractC8416t0;
import com.fyber.inneractive.sdk.network.C8364c1;
import com.fyber.inneractive.sdk.network.C8391l;
import com.fyber.inneractive.sdk.network.C8401o0;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.loader.network.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8200a extends C8364c1 {

    /* JADX INFO: renamed from: q */
    public int f18282q;

    public C8200a(String str, C8205b c8205b) {
        super(c8205b, str, null);
    }

    @Override // com.fyber.inneractive.sdk.network.C8364c1, com.fyber.inneractive.sdk.network.AbstractC8416t0
    /* JADX INFO: renamed from: a */
    public final C8401o0 mo20620a(C8391l c8391l, Map map, int i) throws C8207a {
        int iM20786a;
        int iM20443a = IAConfigManager.f17654M.f17688t.f17862b.m20443a("sp_max_size", 307200, 0);
        this.f18282q = iM20443a;
        int i2 = iM20443a + 10;
        if (c8391l != null && (iM20786a = AbstractC8416t0.m20786a(c8391l.f18669d)) >= 0) {
            i2 = iM20786a;
        }
        long j = i2;
        int i3 = this.f18282q;
        if (j <= i3) {
            return super.mo20620a(c8391l, map, i);
        }
        throw new C8207a("The image exceeds the maximal size: " + i3 + ", actual size: " + i2);
    }
}
