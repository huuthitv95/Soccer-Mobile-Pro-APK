package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.w */
/* JADX INFO: loaded from: classes4.dex */
public final class C8798w {

    /* JADX INFO: renamed from: a */
    public final HashMap f20598a = new HashMap();

    /* JADX INFO: renamed from: b */
    public Map f20599b;

    /* JADX INFO: renamed from: a */
    public final synchronized Map m21317a() {
        if (this.f20599b == null) {
            this.f20599b = Collections.unmodifiableMap(new HashMap(this.f20598a));
        }
        return this.f20599b;
    }
}
