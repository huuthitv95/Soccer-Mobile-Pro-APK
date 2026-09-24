package com.fyber.inneractive.sdk.config;

import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.l */
/* JADX INFO: loaded from: classes4.dex */
public final class C8015l {

    /* JADX INFO: renamed from: a */
    public final HashMap f17796a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final boolean m20438a() {
        try {
            if (this.f17796a.containsKey("dsos")) {
                return Boolean.parseBoolean((String) this.f17796a.get("dsos"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
