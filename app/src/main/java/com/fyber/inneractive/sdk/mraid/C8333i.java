package com.fyber.inneractive.sdk.mraid;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.web.AbstractC9239i0;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.mraid.i */
/* JADX INFO: loaded from: classes4.dex */
public final class C8333i extends AbstractC8326e {
    public C8333i(LinkedHashMap linkedHashMap, AbstractC9239i0 abstractC9239i0, C9152g1 c9152g1) {
        super(linkedHashMap, abstractC9239i0, c9152g1);
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8328f
    /* JADX INFO: renamed from: a */
    public final void mo20721a() {
        int iM20720a = m20720a("w");
        int iM20720a2 = m20720a(CmcdData.Factory.STREAMING_FORMAT_HLS);
        this.f18602c.m22072a((String) this.f18601b.get("url"), iM20720a <= 0 ? -1 : iM20720a, iM20720a2 <= 0 ? -1 : iM20720a2, "true".equals(this.f18601b.get("shouldUseCustomClose")), "true".equals(this.f18601b.get("lockOrientation")));
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8326e
    /* JADX INFO: renamed from: c */
    public final String mo20718c() {
        return (String) this.f18601b.get("url");
    }
}
