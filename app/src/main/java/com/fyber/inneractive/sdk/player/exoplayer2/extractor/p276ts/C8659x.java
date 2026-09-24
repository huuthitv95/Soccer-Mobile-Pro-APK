package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8802a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.x */
/* JADX INFO: loaded from: classes4.dex */
public final class C8659x {

    /* JADX INFO: renamed from: a */
    public final List f20103a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8629r[] f20104b;

    public C8659x(List list) {
        this.f20103a = list;
        this.f20104b = new InterfaceC8629r[list.size()];
    }

    /* JADX INFO: renamed from: a */
    public final void m21185a(InterfaceC8568j interfaceC8568j, C8639e0 c8639e0) {
        for (int i = 0; i < this.f20104b.length; i++) {
            c8639e0.m21174a();
            c8639e0.m21175b();
            C8538g c8538gMo21092a = interfaceC8568j.mo21092a(c8639e0.f19936d, 3);
            C8708o c8708o = (C8708o) this.f20103a.get(i);
            String str = c8708o.f20295f;
            AbstractC8802a.m21319a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = c8708o.f20290a;
            if (str2 == null) {
                c8639e0.m21175b();
                str2 = c8639e0.f19937e;
            }
            c8538gMo21092a.mo21053a(C8708o.m21265a(str2, str, c8708o.f20313x, c8708o.f20314y, c8708o.f20315z, null, Long.MAX_VALUE, Collections.EMPTY_LIST));
            this.f20104b[i] = c8538gMo21092a;
        }
    }
}
