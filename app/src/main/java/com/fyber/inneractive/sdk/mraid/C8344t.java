package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.web.AbstractC9239i0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.mraid.t */
/* JADX INFO: loaded from: classes4.dex */
public final class C8344t extends AbstractC8328f {
    public C8344t(LinkedHashMap linkedHashMap, AbstractC9239i0 abstractC9239i0, C9152g1 c9152g1) {
        super(linkedHashMap, abstractC9239i0, c9152g1);
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8328f
    /* JADX INFO: renamed from: a */
    public final void mo20721a() {
        Map map = this.f18601b;
        this.f18602c.setOrientationProperties((map != null && map.containsKey("allowOrientationChange") && "false".equals(this.f18601b.get("allowOrientationChange"))) ? false : true, (String) this.f18601b.get("forceOrientation"));
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8328f
    /* JADX INFO: renamed from: b */
    public final boolean mo20717b() {
        return false;
    }
}
