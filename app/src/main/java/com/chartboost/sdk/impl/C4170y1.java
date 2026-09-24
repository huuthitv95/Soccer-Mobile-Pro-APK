package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.y1 */
/* JADX INFO: loaded from: classes3.dex */
public class C4170y1 extends AbstractC3654b3 {

    /* JADX INFO: renamed from: k */
    public final C4131w6 f16997k;

    /* JADX INFO: renamed from: l */
    public final C3769g3 f16998l;

    /* JADX INFO: renamed from: m */
    public final C4148x1 f16999m;

    /* JADX INFO: renamed from: n */
    public final String f17000n;

    public C4170y1(C4131w6 c4131w6, C3769g3 c3769g3, C4148x1 c4148x1, File file, String str) {
        super(AbstractC3654b3.c.GET, c4148x1.f16801d, EnumC4095ue.NORMAL, file);
        this.f13521i = AbstractC3654b3.b.ASYNC;
        this.f16997k = c4131w6;
        this.f16998l = c3769g3;
        this.f16999m = c4148x1;
        this.f17000n = str;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3654b3
    /* JADX INFO: renamed from: a */
    public C3677c3 mo16887a() {
        HashMap map = new HashMap();
        map.put("X-Chartboost-App", this.f17000n);
        map.put("X-Chartboost-Client", C3907m3.m18629b());
        map.put("X-Chartboost-Reachability", Integer.toString(this.f16998l.m17755c().m17619b()));
        return new C3677c3(map, null, null);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3654b3
    /* JADX INFO: renamed from: a */
    public void mo16889a(CBError cBError, C3723e3 c3723e3) {
        this.f16997k.m19752a(this, cBError, c3723e3);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3654b3
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo16890a(Void r1, C3723e3 c3723e3) {
        this.f16997k.m19752a(this, null, null);
    }
}
